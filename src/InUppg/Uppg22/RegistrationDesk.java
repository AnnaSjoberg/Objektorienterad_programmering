package InUppg.Uppg22;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class RegistrationDesk {
    private final String ptTrackingFile;
    private boolean testRun;
    private String visitorInput;
    private String mockOutput;


    public RegistrationDesk(String ptTrackingFile, boolean testRun) {
        this.ptTrackingFile = ptTrackingFile;
        this.testRun = testRun;
    }

    public String getPtTrackingFile() {
        return ptTrackingFile;
    }

    public boolean isTestRun() {
        return testRun;
    }

    public String getVisitorInput() {
        return visitorInput;
    }

    public void setVisitorInput(String testInput) {
        if (testRun) { //måste hitta ett sätt att ange strängen när det är test
            this.visitorInput=testInput;
        } else {
            this.visitorInput = JOptionPane.showInputDialog("Ange namn eller personnummer:");
            if (this.visitorInput == null) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas.");
                System.exit(0);
            }
        }
    }

    public void registerVisitor(List<Customer> customerList, String testInput) {
        setVisitorInput(testInput);
        String res = "Personen återfinns inte på listan.";
        for (Customer element : customerList) {
            if (element.isActiveMember() && (element.getIdNumber().equals(visitorInput.trim())
                    || element.getFullName().equals(visitorInput.trim()))) {
                res = "Giltigt årskort. Välkommen!";
                IOHandling.writeToFile(ptTrackingFile, element, LocalDate.now().toString());
            } else if (element.getIdNumber().equals(visitorInput) || element.getFullName().equals(visitorInput)) {
                res = "Årskortet har gått ut. Före detta medlem.";
            }
        }
        if (testRun) {
            this.mockOutput=res;
        }else{
            JOptionPane.showMessageDialog(null, res);
        }
    }

    public String getMockOutput() {
        return mockOutput;
    }
}
