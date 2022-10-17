package InUppg.Uppg2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member {
    protected List<Person> allMembers = new ArrayList<>();

    public boolean isMember (String input){ //testet skrivet innan kod, går ej igemom än då jag fortfarande inte har skapat en lista att jämföra input med
        //jämföra lista med samtliga personer och jämföra om input namn eller personnummer matchar
        for (Person member:allMembers) {
            if (input.equals(member.getFullName())||input.equals(member.getIdNumber())){
                return true;
            }
        }
        return false;
    }
    public boolean isValid (String date){ //testet skrivet innan metoden
        //ta in dagens datum. true om input-datum är mindre än ett år före dagens datum
        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = LocalDate.of(today.getYear()-1, today.getMonth(),today.getDayOfMonth());
        LocalDate purchaseDate = LocalDate.parse(date);
        return oneYearAgo.isBefore(purchaseDate);
    }
}
