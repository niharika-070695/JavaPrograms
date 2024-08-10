import java.util.List;
import java.util.Arrays;
public class CustomerUtils {
    //Populating static data for Customers
    public static List<Customer> getCustomerData(){

        //creating the address class objects
        Address homeAddress = new Address("612","525-EastArmour","KansasCity");
        Address officeAddress = new Address("702","350-EastArmor-BLVD","Missouri");

        //creating the customer class objects
        Customer customer1 = new Customer(1,"Virat","Seattle","virta@gmail.com","9967344533",
                Arrays.asList(homeAddress,officeAddress));
        Customer customer2 = new Customer(2,"Dhoni","Michigan","dhoni@gmail.com","9981346633",
                Arrays.asList(homeAddress,officeAddress));

        Customer customer3 = new Customer(3,"Sachin","NewYork","sachin@gmail.com","9981346622",
                Arrays.asList(homeAddress,officeAddress));

        Customer customer4 = new Customer(4,"Dravid","NewJersey","dravid@gmail.com","9982146622",
                Arrays.asList(homeAddress,officeAddress));

        Customer customer5 = new Customer(5,"Jadeja","Dallas","jadeja@gmail.com","9982146622",
                Arrays.asList(homeAddress,officeAddress));

        return Arrays.asList(customer1,customer2,customer3,customer4,customer5);
    }
}
