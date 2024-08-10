import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("HelloWorld");
        List<Integer> l1 = new ArrayList<>();
        l1.add(22);
        l1.add(33);
        l1.add(13);
        Collections.sort(l1);
        System.out.println(l1);

    }
}
