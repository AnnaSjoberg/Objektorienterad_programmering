package InUppg.Uppg22;

import java.time.LocalDate;

public class Customer {
    private String idNumber;
    private String fullName;
    private String purchaseDate;
  //  private boolean activeMember;

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
        LocalDate today = LocalDate.now();
        LocalDate dateOfPurchase = LocalDate.parse(getPurchaseDate());
        return (dateOfPurchase.isAfter(LocalDate.of((today.getYear()-1), today.getMonth(), today.getDayOfMonth())));
    }

}
