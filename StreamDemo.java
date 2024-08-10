import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args){

        //get the customer information from collection object
        List<Customer> customerList = CustomerUtils.getCustomerData();

        //converting the collection object into stream object
        Stream<Customer> customerStream = customerList.stream();

        //display customer information as object by object
        //ex for implementation of ConsumerFunctional Interface Abstract method
        //Consumer is a Functional Interface which is taking Customer object and displaying Customer object
        //and displaying Customer object
        //forEach() is terminal operation
        //passing consumer object to forEach method will be executing for every customer in list object
        Consumer<Customer> customerConsumer = c->System.out.println(c);
        customerList.forEach(customerConsumer);
        //***********below is other way**************
        customerList.forEach(c->System.out.println(c));

        //calling forEach method on customerStream
        System.out.println("***************streams output*****************");
        customerStream.forEach(customerConsumer);

        //getting all the customer names from list of customers
        //map() is an intermediate operation used to extract required property-customer name from object
        Stream<Customer> customerStream1 = customerList.stream();
        Stream<String> customerNames = customerStream1.map(c->c.getName());
        //displaying the customer names-- forEach() is  a terminal operation
        customerNames.forEach(a-> System.out.println("Customer Name: "+a));
        //second way by using Function interface directly
        Stream<Customer> customerStream2 = customerList.stream();
        Function<Customer,String> customerNameFunction = custName -> custName.getName();
        Stream<String> customerNamesList = customerStream2.map(customerNameFunction);
        //displaying the customer names-- forEach() is  a terminal operation
        customerNamesList.forEach(a-> System.out.println("Customer Name: "+a));

        //get all customer information who are residing in Seattle
        //we use filter() as Intermediate operation
        //filter is taking Predicate Functional Interface as parameter which can be used for conditional evaluation
        Stream<Customer> customerStream3 = customerList.stream();
        Predicate<Customer> seattlePredicate = cust->cust.getLocation().equalsIgnoreCase("Seattle");
        // we are reusing customerConsumer
        customerStream3.filter(seattlePredicate).forEach(customerConsumer);


    }
}
