import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<EmployeeA> getEmployees(){
        return Stream.of(new EmployeeA(1,"Ramcharan","A",65000),
                new EmployeeA(2,"NTR","A",55000),
                new EmployeeA(3,"Nani","B",89000),
                new EmployeeA(4,"Bunny","B",76000))
                .collect(Collectors.toList());
    }
}
