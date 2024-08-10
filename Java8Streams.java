import java.util.*;
import java.util.stream.Stream;
//https://www.youtube.com/watch?v=8yyHwQtnOj4
public class Java8Streams {
    public static void main(String[] args){
        //create a stream
        Stream<String> s1 =  Stream.of("a","b","c");
        s1.forEach(System.out::println);

        //create a stream from sources
        //using collection source
        Collection<String> c1 = Arrays.asList("Java","Python","J2EE","Angular");
        Stream<String> s2 = c1.stream();
        s2.forEach(System.out::println);
        //using List source
        List<String> l1 = Arrays.asList("IntelliJ","Eclipse","VisualStudio","IBMRAD");
        Stream<String> s3 = l1.stream();
        s3.forEach(System.out::println);
        //using Set source
        Set<String> st1 = new HashSet<>(l1);
        Stream<String> s4 = st1.stream();
        s4.forEach(System.out::println);
        //using array object
        String[] sa1 = {"apple","banana","grapes","orange"};
        Stream<String> s5 = Arrays.stream(sa1);
        s5.forEach(System.out::println);

        //Filtering using Stream API


    }
}
