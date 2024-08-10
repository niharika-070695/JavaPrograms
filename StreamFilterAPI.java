import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//https://www.youtube.com/watch?v=8yyHwQtnOj4
public class StreamFilterAPI {
    public static void main(String[] args){
        //Traditional way of printing objects from a list
        List<Product> plist = new ArrayList<Product>();
        for(Product p:getProducts()){
            if(p.getPrice()>25000f){
                plist.add(p);
            }
        }
        for(Product p1:plist){
            System.out.println(p1);
        }
        System.out.println("******************************");
        //using Java8 features -streamAPI
        List<Product> list2 = getProducts()
                .stream().filter((p1)->p1.getPrice() > 25000f)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);

    }

    private static List<Product> getProducts(){
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"HP Laptop",25000f));
        productList.add(new Product(2,"Lenovo Laptop",35000f));
        productList.add(new Product(3,"Intel Laptop",45000f));
        productList.add(new Product(4,"Sony Laptop",65000f));
        return productList;
    }
}
class Product{
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
