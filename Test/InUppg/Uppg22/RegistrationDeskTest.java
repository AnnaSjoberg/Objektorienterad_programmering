package InUppg.Uppg22;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationDeskTest {
    boolean testRun = true;
    List<Customer> fileIntoList = IOHandling.listFromFile("Test/InUppg/Uppg22/testFileRead.txt");
    String fileToWriteTo = "Test/InUppg/Uppg22/testFileWrite.txt";
    RegistrationDesk regDesk = new RegistrationDesk(fileToWriteTo,testRun);

    @Test
    void registerVisitor() { //Kod skriven före test
        String currentMemberName = "Lena Sjö";
        String currentMemberID = "6203051234";
        String oldMemberName = "Emma Ove";
        String oldMemberID = "8505205678";
        String notMemberName = "Bertil Fil";
        regDesk.registerVisitor(fileIntoList,currentMemberName);
        assertTrue(regDesk.getMockOutput().equals("Giltigt årskort. Välkommen!"));
        regDesk.registerVisitor(fileIntoList,currentMemberID);
        assertTrue(regDesk.getMockOutput().equals("Giltigt årskort. Välkommen!"));
        regDesk.registerVisitor(fileIntoList,oldMemberName);
        assertTrue(regDesk.getMockOutput().equals("Årskortet har gått ut. Före detta medlem."));
        regDesk.registerVisitor(fileIntoList,oldMemberID);
        assertTrue(regDesk.getMockOutput().equals("Årskortet har gått ut. Före detta medlem."));
        regDesk.registerVisitor(fileIntoList,notMemberName);
        assertTrue(regDesk.getMockOutput().equals("Personen återfinns inte på listan."));
        assertFalse(regDesk.getMockOutput().equals("Giltigt årskort. Välkommen!"));

    }
}