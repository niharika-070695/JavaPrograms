import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//https://www.youtube.com/watch?v=w-iwyp_A7e8
public class MapReduceExample {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);

        List<String> words = Arrays.asList("corejava","spring","hibernate","python","springboot");
        //Traditional way of calculating sum
        int sum = 0;
        for(int n: numbers){
            sum = sum+n;
        }
        System.out.println("Traditional way: "+ sum);
        //Using Java8 streams - sum method
        int sum2 = numbers.stream().mapToInt(i->i).sum();
        System.out.println("Using Java8 Sum(): "+sum2);

        //Using Java8 Streams - reduce method
        int sum3 = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("Using Java8 reduce(): "+sum3);

        //Using Java8 method reference
        Optional<Integer> sum4 = numbers.stream().reduce(Integer::sum);
        System.out.println("Using Java8 Method reference: " + sum4.get());
        //Using Java8 multiply
        int pro1 = numbers.stream().reduce(1,(a,b) -> a*b);
        System.out.println("Multiplication product:"+ pro1);

        //max value
        int maxVal = numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("Maximum value: "+ maxVal);

        //min value
        int minVal = numbers.stream().reduce(0,(a,b)->a<b?a:b);
        System.out.println("Minimum value: "+ minVal);

        Integer maxVal1 = numbers.stream().reduce(Integer::max).get();
        System.out.println("Max value using method reference: "+ maxVal1);

        Integer minVal1 = numbers.stream().reduce(Integer::min).get();
        System.out.println("Min value using method reference: "+minVal1);

        String longestString = words.stream()
                .reduce((word1,word2)-> word1.length() > word2.length()? word1:word2)
                .get();
        System.out.println("Longest string: "+longestString);

        //step1: get employees whose grade is A
        //step2: get salary

        double avgSalary = EmployeeDatabase.getEmployees()
                .stream()
                .filter(e->e.getGrade().equalsIgnoreCase("A"))
                .map(e->e.getSalary())
                .mapToDouble(i->i)
                .average()
                .getAsDouble();
        System.out.println("Average salary of employees with garde A is: " + avgSalary);

        //sum of salaries of employees whose grade is A
        double sumOfSalary = EmployeeDatabase.getEmployees()
                .stream().filter(e->e.getGrade().equalsIgnoreCase("A"))
                .map(e->e.getSalary())
                .mapToDouble(i->i)
                .sum();
        System.out.println("Sum of salaries of employees with grade A:"+ sumOfSalary);



    }
}
