import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
//https://www.youtube.com/watch?v=8yyHwQtnOj4
public class FindElementsUsingStreamAPI {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,3,2,1);
        //findFirst() and findAny() methods
        Optional<Integer> element = list1.stream().findFirst();
        if(element.isPresent()){
            System.out.println(element.get());
        }
        else{
            System.out.println("Stream is empty");
        }
        Optional<Integer> elementx = list1.stream().findAny();
        if(elementx.isPresent()){
            System.out.println(elementx.get());
        }
        else{
            System.out.println("Stream is empty");
        }
        //count(),min(),max() methods
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println(stream1.count());

//        Integer integermin = stream1.min(Comparator.comparing(Integer::valueOf)).get();
//        System.out.println("Min => "+ integermin);      //gives error stream closed
//
//        Integer integermax = stream1.max(Comparator.comparing(Integer::valueOf)).get();
//        System.out.println("Max => "+ integermax);     //gives error stream closed

        Integer integermin1 = Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min => "+ integermin1);

        Integer integermax1 = Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max => "+ integermax1);


    }
}
