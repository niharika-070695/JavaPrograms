import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListProgram {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int x = s1.nextInt();
        s1.nextLine();
        List<ArrayList<Integer>> listOfLists = new ArrayList<>();
        while(x>0){
            String line = s1.nextLine();
            String[] tokens = line.split("\\s+");
            ArrayList<Integer> currentList = new ArrayList<>();
            for(String token: tokens){
                currentList.add(Integer.parseInt(token));
            }
            listOfLists.add(currentList);
            x = x-1;
        }
        x = s1.nextInt();
        System.out.println("queries count is" + x);
        while(x>0){
            int lineNo = Integer.parseInt(s1.next());
            int indexNo = Integer.parseInt(s1.next());
            try{
                System.out.println(listOfLists.get(lineNo-1).get(indexNo));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
            x = x-1;

        }
    }
}
