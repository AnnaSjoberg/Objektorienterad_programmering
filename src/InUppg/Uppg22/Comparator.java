package InUppg.Uppg22;

import javax.swing.*;
import java.util.List;

public class Comparator implements Printable {

    public void compareVisitor(List<Customer> customerList, String visitorInput) {
        String res = "";
        for (Customer element : customerList) {
            if (element.isActiveMember() && (element.getIdNumber().equals(visitorInput) || element.getFullName().equals(visitorInput))) {
                res = "Giltigt årskort. Välkommen!";
                break;
            } else if (element.getIdNumber().equals(visitorInput) || element.getFullName().equals(visitorInput)) {
                res = "Årskortet har gått ut. Gammal medlem";
                break;
            }else {
                res = "Inte medlem";
            }
        }
        printMessage(res);
        return;
    }

    /*
    for (Customer element:fileIntoList) { //ger utskrifter för (enbart) nuvarande och föredetta medlemmar. Skriver till fil
            if (element.getIdNumber().equals(visitorInput) || element.getFullName().equals(visitorInput)){
                if (element.isActiveMember()){
                    JOptionPane.showMessageDialog(null, "Giltigt årskort. Välkommen!");
                    IOHandling.writeToFile(ptTrackingFile,element, LocalDate.now().toString());
                }else {
                    JOptionPane.showMessageDialog(null, "Årskortet har gått ut. Gammal medlem");
                }
            }
        }
     */

    @Override
    public void printMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
