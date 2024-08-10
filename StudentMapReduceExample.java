import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMapReduceExample {

    public static void main(String[] args){
        List<Student> s = StudentDatabase.getStudents();
        s.forEach(x->System.out.println(x));
        Stream<Collection<Integer>> s1 = s.stream()
                .filter(c->c.getMajor().equalsIgnoreCase("Computer Science"))
                .map(e->e.getGrades().values());
        //s1.forEach(d->System.out.println(d));

        //FlatMap stream of collections to a single stream of integers
        List<Integer> integerStream = s1.flatMap(Collection::stream).collect(Collectors.toList());
        //Find the max value in stream of integers
        Integer max = integerStream.stream().reduce(Integer::max).get();
        System.out.println("Maximum value: "+ max);

        //optimal code
        int ans = s.stream().filter(x->x.getMajor().equalsIgnoreCase("Computer Science"))
                .flatMap(a->a.getGrades().values().stream()).reduce(Integer::max).get();
        System.out.println("Maximum value is: "+ ans);



    }
}
