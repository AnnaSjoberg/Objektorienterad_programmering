package InUppg.Uppg2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Member {
    protected List<PreviousCustomer> allMembers = new ArrayList<>();//lista över de som har giltigt årskort

    /*


        public void ceateAllMembersList(PreviousCustomer input) {
        if (isCardValid(input.getPurchaseDate())) {
            allMembers.add(input);
        }
    }
*/
    public static List<PreviousCustomer> ceateAllMembersList(List<PreviousCustomer> inputList) {
        List<PreviousCustomer> res = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = LocalDate.of(today.getYear() - 1, today.getMonth(), today.getDayOfMonth());
        for (PreviousCustomer element : inputList) {
            if (oneYearAgo.isBefore(LocalDate.parse(element.getPurchaseDate()))) {
                res.add(element);
            }
        }
        return res;
    }



    protected boolean isCardValid(String date) { //testet skrivet innan metoden
        LocalDate today = LocalDate.now();
        LocalDate oneYearAgo = LocalDate.of(today.getYear() - 1, today.getMonth(), today.getDayOfMonth());
        LocalDate purchaseDate = LocalDate.parse(date);
        return oneYearAgo.isBefore(purchaseDate);
    }

    public boolean isOnMembersList(String input) { //testet skrivet innan kod, går ej igemom än då jag fortfarande inte har skapat en lista att jämföra input med
        //jämföra lista med samtliga personer och jämföra om input namn eller personnummer matchar
        for (PreviousCustomer member : allMembers) {
            if (input.equals(member.getFullName()) || input.equals(member.getIdNumber())) {
                return true;
            }
        }
        return false;
    }
}
