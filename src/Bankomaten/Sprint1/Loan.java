package Bankomaten.Sprint1;

import java.util.ArrayList;
import java.util.List;

public class Loan {
    private final String number;
    private double amount;
    private double interest;
    private final Employee grantedBy;

    private List<InterestHistory> interestHistoryList = new ArrayList<>();

    public Loan(String number, double amount, double interest, Employee grantedBy) {
        this.number = number;
        this.amount = amount;
        this.interest = interest;
        this.grantedBy = grantedBy;
        this.interestHistoryList.add(new InterestHistory(interest,grantedBy));
    }

    public String getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public Employee getGrantedBy() {
        return grantedBy;
    }

    public List<InterestHistory> getInterestHistoryList() {
        return interestHistoryList;
    }

    public void changeInterest (double interest, Employee grantedBy){
        setInterest(interest);
        this.interestHistoryList.add(new InterestHistory(interest,grantedBy));
    }

    public String interestHistorytoString() {
        String message = "Interest history for loan with ID number " + getNumber() + ":";
        for (InterestHistory element:interestHistoryList) {
            message +="\n" + element.getDateOfChange() + "\t" + element.getInterest() + "% \t Change granted by "
                    + element.getGrantedBy().getFullName();
        }
        return message;
    }
}
