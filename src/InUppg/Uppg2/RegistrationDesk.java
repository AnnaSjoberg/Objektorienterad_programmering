package InUppg.Uppg2;

import javax.swing.JOptionPane;
import java.util.List;

public class RegistrationDesk { //klass för interaktion via dialogruta
    //List<PreviousCustomer> membersList = Member.ceateAllMembersList(fileIntoList);
    private List<PreviousCustomer> previousCustomerList;
    private boolean isTest;

    public RegistrationDesk(List<PreviousCustomer> previousCustomerList, boolean isTest) {
        this.previousCustomerList = previousCustomerList;
        this.isTest = isTest;
    }

    public List<PreviousCustomer> getPreviousCustomerList() {
        return previousCustomerList;
    }

    public boolean getIsTest() {
        return isTest;
    }

    public String registerVisitor(boolean isTest, String testInput) {
        if (isTest) {
            return testInput;
        } else {
            return JOptionPane.showInputDialog("Ange namn eller personnummer: ").trim();
        }
    }



    public String printMe (String visitorInput){
        String res="";
        for (PreviousCustomer temp:previousCustomerList) {
            if (temp.getFullName().equals(visitorInput)||temp.getIdNumber().equals(visitorInput)){
              //  if()

            }else {
                res="Icke medlem";
            }
        }


        return null;
    }




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
