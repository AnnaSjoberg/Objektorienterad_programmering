package Bankomaten.Sprint1;

public class Employee extends Person{
    private int pay;
    private String title;

    public Employee(String fullName, String idNumber, String address, int pay, String title) {
        super(fullName, idNumber, address);
        this.pay = pay;
        this.title = title;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
