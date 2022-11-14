package sprint4.uppg8;

import java.util.List;

public class Database {
    private Buddy b1 = new Buddy("Theo", "Lagerlundavägen 6A", "070-123456", "5/3");
    private Buddy b2 = new Buddy("Viggo", "Lagerlundavägen 6A", "073-456789", "8/6");
    private Buddy b3 = new Buddy("Hugo", "Hasselvägen 9", "070-987654", "22/5");
    private Buddy b4 = new Buddy("Ture", "Krokis", "073-210987", "15/3");

    private List<Buddy> myBuddies = List.of(b1, b2, b3, b4);

    public Buddy getBuddy(String input) {
        for (Buddy b : myBuddies) {
            if (b.getName().equalsIgnoreCase(input.trim())||b.getAddress().equalsIgnoreCase(input.trim())||
                    b.getPhoneNumber().equalsIgnoreCase(input.trim())||b.getbDay().equalsIgnoreCase(input.trim())) {
                return b;
            }
        }
        return null;
    }

    private String compileString(Buddy b) {
        return b.getName() + " " + b.getAddress() + " " + b.getPhoneNumber() + " " + b.getbDay();
    }

}
