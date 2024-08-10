import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
//https://www.youtube.com/watch?v=8yyHwQtnOj4
public class MapAndCollect {
    public static void main(String[] args){
        List<User> users = new ArrayList<User>();
        users.add(new User(1,"Virat","secrete","virat@gmail.com"));
        users.add(new User(2,"Sachin","secrete","sachin@gmail.com"));
        users.add(new User(3,"Dhoni","secrete","dhoni@gmail.com"));
        users.add(new User(4,"Jadeja","secrete","jadeja@gmail.com"));

        //In traditional way map User object to UserDTO object
        List<UserDTO> usersDTO = new ArrayList<UserDTO>();
        for(User user: users){
            usersDTO.add(new UserDTO(user.getId(),user.getUserName(),user.getEmail()));
        }

        for(UserDTO dto: usersDTO){
            System.out.println(dto);
        }
        //Map User Object to UserDTO object using map method of stream-- stream().map()
        //anonymous implementation of Functional Interfcae
        users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
            }
        });
        //use Lambda expression to implement above functional interface
        users.stream().map((User userx)-> new UserDTO(userx.getId(),userx.getUserName(),userx.getEmail()))
                .forEach((userdto) ->{System.out.println(userdto);});

        //list
        List<UserDTO> userDTOs = users.stream().map((User usery)-> new UserDTO(usery.getId(),usery.getUserName(),usery.getEmail()))
                .collect(Collectors.toList());
        userDTOs.forEach(System.out::println);

    }
}

class UserDTO{
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}