package InUppg.Uppg2;

import java.util.List;

public class Main {

    public Main() {
        boolean testRun = false;
        String originalFile = "src/InUppg/Uppg2/customers.txt";
        String ptTrackingFile = "src/InUppg/Uppg2/ptTrackingFile.txt";

        RegistrationDesk registrationDesk = new RegistrationDesk(testRun, originalFile, ptTrackingFile);

        while (true) {//kommer fortsätta tills användaren trycker på avbryt i dialogrutan
            registrationDesk.registerVisitor(null);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
