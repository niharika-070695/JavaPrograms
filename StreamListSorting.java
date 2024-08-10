import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//https://www.youtube.com/watch?v=8yyHwQtnOj4
public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        List<String> sortedList = fruits
                .stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        //we can sort using Lambda expression
        List<String> sortedFruits = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedFruits);

        //Without using any parameter in sorted method-- by default it sorts in ascending order
        List<String> sortedFruitsList = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedFruitsList);

        System.out.println("*****************************************");
        //descending order
        List<String> sortedListDesc = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedListDesc);

        List<String> sortedFruitsDesc = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedFruitsDesc);

        //creating a list of Employees
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Virat", 30, 35000));
        employees.add(new Employee(20, "Sachin", 41, 42000));
        employees.add(new Employee(21, "Rohit", 33, 23000));
        employees.add(new Employee(11, "Shubham", 24, 55000));

        //sorting employees by salary using Anonymous implementation of Comparator interface
        List<Employee> employeesSortedList = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());

        System.out.println(employeesSortedList);

        //After converting above Anonymous implementation into Lambda expression
        List<Employee> employeesSortedLambdaList = employees.stream().
                sorted((o3, o4) -> (int) (o3.getSalary() - o4.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employeesSortedLambdaList);
        // To sort employee by their salary in descending order -- swap the references
        List<Employee> employeesSortedLambdaListDesc = employees.stream().
                sorted((o3, o4) -> (int) (o4.getSalary() - o3.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employeesSortedLambdaListDesc);


        //Replace Lambda expression with Comparator provided method - ascending order
        List<Employee> employeesSortedLambdaListAscComp = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(employeesSortedLambdaListAscComp);

        //Replace Lambda expression with Comparator provided method - descending order
        List<Employee> employeesSortedLambdaListDescComp = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(employeesSortedLambdaListDescComp);

        //sorting by age - ascending order
        List<Employee> employeesSortedLambdaListAscCompAge = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getAge)).collect(Collectors.toList());
        System.out.println(employeesSortedLambdaListAscCompAge);

        //sorting by age - descending order
        List<Employee> employeesSortedLambdaListDescCompAge = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
        System.out.println(employeesSortedLambdaListDescCompAge);

        System.out.println("**********Name***********************");
        //sorting by name - DescendingOrder
        List<Employee> employeesSortedLambdaListDescCompName = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
        System.out.println(employeesSortedLambdaListDescCompName);

        //sorting by name - Ascending Order
        List<Employee> employeesSortedLambdaListAscCompName = employees.stream()
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(employeesSortedLambdaListAscCompName);







    }
}
