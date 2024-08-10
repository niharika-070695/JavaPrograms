import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if(s.isEmpty()){
            System.out.println(0);
            System.exit(0);
        }


        String[] tokens = s.split("[\\s\\p{Punct}]+");
        System.out.println(tokens.length);
        for(String t: tokens){
            System.out.println(t);

        }
        scan.close();
    }
}
