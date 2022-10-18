package InUppg.Uppg2;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.Scanner;

public class RegistrationDesk { //klass för interaktion via dialogruta

    private boolean isTest;

    public RegistrationDesk(boolean isTest) {
        this.isTest = isTest;
    }
    public boolean getIsTest() {
        return isTest;
    }

    public String registerVisitor(boolean isTest, String testInput){
        if (isTest){
            return testInput;
        }else {
            return JOptionPane.showInputDialog("Ange namn eller personnummer: ").trim();
        }
    }

/*    public String printMe (String visitorInput){
        if (Member.isOnMembersList(visitorInput))
        return null;
    }


 */

  /*  public boolean isOnMembersList(List<PreviousCustomer> allMembers, String input) { //testet skrivet innan kod
        //jämföra lista med samtliga personer och jämföra om input namn eller personnummer matchar
        for (PreviousCustomer member : allMembers) {
            if (input.equals(member.getFullName()) || input.equals(member.getIdNumber())) {
                return true;
            }
        }
        return false;
    }

   */
}
