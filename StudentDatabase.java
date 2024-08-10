import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StudentDatabase {

    public static List<Student> getStudents(){
        //creating the student class objects
        Student s1 = new Student("Amine","Ousmane","Computer Science",
                Map.of("Algorithms",90,"Data Structures",80,"Calculus",85));
        Student s2 = new Student("Lily-Ann","Smith","Mathematics",
                Map.of("Algorithms",80,"Data structures",75,"Calculus",88));
        Student s3 = new Student("Li","Wei","Computer Science",
                Map.of("Algorithms",92,"Data structures",89,"Calculus",88));
        Student s4 = new Student("Jessica","Rodriguez","Mathematics",
                Map.of("Algorithms",85,"Data Structures",80,"Calculus",89));
        return Arrays.asList(s1,s2,s3,s4);
    }
}
