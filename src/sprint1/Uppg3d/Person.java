package sprint1.Uppg3d;

public class Person {
    private String name;
    private String idNumber;
    private String address;

    public Person(String name, String idNumber, String address) {
        this.name = name;
        this.idNumber = idNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getAddress() {
        return address;
    }
}
