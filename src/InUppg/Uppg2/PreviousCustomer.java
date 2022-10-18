package InUppg.Uppg2;

public class PreviousCustomer {
    private String idNumber;
    private String fullName;
    private String purchaseDate;


    public PreviousCustomer(String idNumber, String fullName, String purchaseDate) {
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
