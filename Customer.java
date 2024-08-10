import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String location;
    private String emailId;
    private String contactNo;
    private List<Address> address;

    //Default constructor
    public Customer() {
    }

    //parameterized constructor

    public Customer(int id, String name, String location, String emailId, String contactNo, List<Address> address) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", emailId='" + emailId + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address=" + address +
                '}';
    }
}
