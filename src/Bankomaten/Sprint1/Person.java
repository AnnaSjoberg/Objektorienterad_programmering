package Bankomaten.Sprint1;

public class Person {
    private String fullName;
    private final String idNumber;
    private String address;

    public Person(String fullName, String idNumber, String address) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
