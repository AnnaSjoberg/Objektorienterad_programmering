package InUppg.Uppg2;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistrationDesk {
    private boolean testRun;
    private final String originalFile;
    private final String ptTrackingFile;
    private List<Customer> fileIntoList;
    private String visitorInput;
    private String mockOutput;//för att kunna testa output som annars skulle gått till dialogruta

    public RegistrationDesk(boolean testRun, String originalFile, String ptTrackingFile) {
        this.testRun = testRun;
        this.originalFile = originalFile;
        this.ptTrackingFile = ptTrackingFile;
        this.fileIntoList = IOHandling.listFromFile(this.originalFile);
        //this.fileIntoList=fileIntoList;
        if (!this.testRun) {
            int option = JOptionPane.showConfirmDialog(null, "Datafilen har förts över till en lista. \n" +
                    "Vill du fortsätta med att registrera gäster?", "Start up complete", JOptionPane.YES_NO_OPTION);
            if (option != 0) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas");
                System.exit(0);
            }
        }
    }

    public boolean isTestRun() {
        return testRun;
    }

    public String getOriginalFile() {
        return originalFile;
    }

    public String getPtTrackingFile() {
        return ptTrackingFile;
    }

    public List<Customer> getFileIntoList() {
        return fileIntoList;
    }

    public String getVisitorInput() {
        return visitorInput;
    }


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

    public void registerVisitor(String testInput) {
        setVisitorInput(testInput);
        String res = "Personen återfinns inte på listan.";
        for (Customer element : getFileIntoList()) {
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

    public String getMockOutput() {
        return mockOutput;
    }

}
