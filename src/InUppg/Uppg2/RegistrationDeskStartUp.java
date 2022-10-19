package InUppg.Uppg2;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class RegistrationDeskStartUp {
    private final String originalFile;
    private final String ptTrackingFile;
    private boolean testRun;
    private String visitorInput;
    private String mockOutput;
    private List<Customer> fileIntoList;

    public RegistrationDeskStartUp(boolean testRun, String orirginalFile, String ptTrackingFile) {
        this.testRun = testRun;
        this.originalFile = orirginalFile;
        this.ptTrackingFile = ptTrackingFile;
        List<Customer> fileIntoList = IOHandling.listFromFile(this.originalFile);

        if (!this.testRun) {
            int option = JOptionPane.showConfirmDialog(null, "Listan har skapats. \n" +
                    "Vill du fortsätta med att registrera gäster?", "Start up complete", JOptionPane.YES_NO_OPTION);
            if (option != 0) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas");
                System.exit(0);
            }
        }
    }

    /*

    public RegistrationDeskStartUp(boolean testRun) {
        this.testRun = testRun;
        if(!this.testRun){
            String originalFile = "src/InUppg/Uppg2/customers.txt";
            this.ptTrackingFile = "src/InUppg/Uppg2/ptTrackingFile.txt";
            List<Customer> fileIntoList = IOHandling.listFromFile(originalFile);

        }
    }
     */


    public String getPtTrackingFile() {
        return ptTrackingFile;
    }

    public boolean isTestRun() {
        return testRun;
    }

    public String getVisitorInput() {
        return visitorInput;
    }

    public String getMockOutput() {
        return mockOutput;
    }//för att kunna testa output som annars skulle gått till dialogruta

    public void setVisitorInput(String testInput) {
        if (testRun) {
            this.visitorInput = testInput.trim();
        } else {
            visitorInput = JOptionPane.showInputDialog("Ange namn eller personnummer:");
            if (visitorInput == null) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas. " +
                        "\nAlla träningspass har registrerats i ptTrackingFile.");
                System.exit(0);
            } else {
                this.visitorInput = visitorInput.trim();
            }
        }
    }

    public void registerVisitor(List<Customer> customerList, String testInput) {
        setVisitorInput(testInput);
        String res = "Personen återfinns inte på listan.";
        for (Customer element : customerList) {
            if (element.isActiveMember() && (element.getIdNumber().equals(visitorInput)
                    || element.getFullName().equals(visitorInput))) {
                res = "Giltigt årskort. Välkommen!";
                IOHandling.writeToFile(ptTrackingFile, element, LocalDate.now().toString());
            } else if (element.getIdNumber().equals(visitorInput) || element.getFullName().equals(visitorInput)) {
                res = "Årskortet har gått ut. Före detta medlem.";
            }
        }
        if (testRun) {
            this.mockOutput = res;
        } else {
            JOptionPane.showMessageDialog(null, res);
        }
    }
}
