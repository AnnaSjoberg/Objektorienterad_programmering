package InUppg.Uppg2;

public class Person {
    private String idNumber;
    private String fullName;
    private String purchaseDate;

    public Person(String idNumber, String fullName, String purchaseDate) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.purchaseDate = purchaseDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }
}
