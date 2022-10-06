package Bankomaten.Sprint1;

import java.time.LocalDate;
import java.util.Calendar;

public class InterestHistory {
    private LocalDate dateOfChange;
    private double interest;
    private Employee grantedBy;

    public InterestHistory(double interest, Employee grantedBy) {
        this.interest = interest;
        this.grantedBy = grantedBy;
        this.dateOfChange = LocalDate.now();
    }

    public LocalDate getDateOfChange() {
        return dateOfChange;
    }

    public double getInterest() {
        return interest;
    }

    public Employee getGrantedBy() {
        return grantedBy;
    }
}
