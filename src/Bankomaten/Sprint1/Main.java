package Bankomaten.Sprint1;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("anna", "123", "hemma", 25000, "bankir");
        Employee e2 = new Employee("emma", "456", "nypan", 35000, "bankir");

        Loan loan = new Loan("1",1000, 5, e1);
        loan.changeInterest(4,e2);
        loan.changeInterest(2,e1);
        loan.changeInterest(8,e2);
        loan.changeInterest(7,e1);
        System.out.println(loan.interestHistorytoString());
    }
}
/*
Ni har fått i uppgift att designa ett banksystem.
Systemet behöver hålla reda på följande
• Vilka kunder banken har
• Bankens personal, med personuppgifter och lön
• Vilka konton och lån varje kund har (en kund kan ha flera konton och lån)
• Räntesats och saldo på varje konto
• Räntesats och belopp på varje lån
• Det ska gå att se vilken anställd som har beviljat varje lån
• Det ska finnas historik över ränteändringar och vilken anställd som beviljade ändringen
Gör diagram över vilka klasser och interface som behöver finnas
I varje klass, skriv ut vilka instansvariabler och instansmetoder som ska finnas. Markera om de är
private/public eller protected
Implementera objektmodellen till ditt system, alltså, skriv alla klasser och interface i kod
 */