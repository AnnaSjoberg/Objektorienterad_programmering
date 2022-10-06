package Bankomaten.Sprint1;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person{
    List<Account> accountList; //bör listorna vara med i konstruktorn egentligen?
    // om en ny kund skulle startas skulle de ju kanske vara tomma...
    List<Loan> loanList = new ArrayList<>(); //ska detta göras här?

    public Client(String fullName, String idNumber, String address, List<Account> accountList, List<Loan> loanList) {
        super(fullName, idNumber, address);
        this.accountList = accountList;
        this.loanList = loanList;
    }

}
