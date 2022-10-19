package InUppg.Uppg22;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class Comparator implements Printable {
// borde fungera att ta bort interface och antingen ha kvar metoden printMe eller flytta in utskriften i compareVisitor.
// om jag flyttar ihop borde det också kunna fungera bättre med att också regga till ptTracking
// Kanske byta namn på klassen till RegistrationDesk?
String ptTrackingFile = "src/InUppg/Uppg22/ptTrackingFile.txt";// bättre att jag lägger Path som variabel till klassen?
    public void compareVisitor(List<Customer> customerList, String visitorInput) {
        String res = "Inte medlem";
        for (Customer element : customerList) {
            if (element.isActiveMember() && (element.getIdNumber().equals(visitorInput) || element.getFullName().equals(visitorInput))) {
                res = "Giltigt årskort. Välkommen!";

                IOHandling.writeToFile(ptTrackingFile,element, LocalDate.now().toString());//om jag  bestämmer mig för att ha utskriften till fil här
                break;
            } else if (element.getIdNumber().equals(visitorInput) || element.getFullName().equals(visitorInput)) {
                res = "Årskortet har gått ut. Gammal medlem";
                break;
            }
        }
        JOptionPane.showMessageDialog(null,res); //om jag tar bort printMessage
        printMessage(res); //ifall jag behåller interface eller separat metod för att göra utskrift
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
    public void printMessage(String message) { //får ligga kvar så länge jag ändå behåller interface. men ska förmodligen städas bort sen
        JOptionPane.showMessageDialog(null, message);
    }
}
