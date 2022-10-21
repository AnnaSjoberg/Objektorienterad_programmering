package InUppg.Uppg2;

import java.time.LocalDate;

public class Customer {
    private String idNumber;
    private String fullName;
    private String purchaseDate;

    public Customer(String IDnumber, String fullName, String purchaseDate) {
        this.idNumber = IDnumber;
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

    public boolean isActiveMember() {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        LocalDate dateOfPurchase = LocalDate.parse(getPurchaseDate());
        return (dateOfPurchase.isAfter(oneYearAgo) || dateOfPurchase.isEqual(oneYearAgo));
    }
}
