package InUppg.Uppg22;

import java.util.List;

public class Main {

    public Main() {
        boolean testRun = false;
        String originalFile = "src/InUppg/Uppg22/customers.txt";
        String ptTrackingFile = "src/InUppg/Uppg22/ptTrackingFile.txt";
        List<Customer> fileIntoList = IOHandling.listFromFile(originalFile);
        RegistrationDesk registrationDesk = new RegistrationDesk(ptTrackingFile,testRun);
        while (true) {
            registrationDesk.registerVisitor(fileIntoList,null );
        }//kommer fortsätta tills användaren trycker på avbryt i dialogrutan
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
}
