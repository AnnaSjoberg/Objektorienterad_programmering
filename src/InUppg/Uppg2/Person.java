package InUppg.Uppg2;

public class Person {
    protected String idNumber;
    protected String fullName;
    protected String purchaseDate;

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
