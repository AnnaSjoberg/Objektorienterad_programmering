package InUppg.uppg2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationDeskTest {
    boolean testRun = true;
    String originalFile = "Test/InUppg/Uppg2/testFileRead.txt";
    String fileToWriteTo = "Test/InUppg/Uppg2/testFileWrite.txt";
    RegistrationDesk regDesk = new RegistrationDesk(testRun, originalFile, fileToWriteTo);

    @Test
    void registerVisitorTest() { //Kod före test
        String currentMemberName = "Lena Sjö";
        String currentMemberID = "6203051234";
        String oldMemberName = "Emma Ove";
        String oldMemberID = "8505205678";
        String notMemberName = "Bertil Fil";

        regDesk.registerVisitor(currentMemberName);
        assertTrue(regDesk.getMockOutput().equals("Giltigt årskort. Välkommen!"));
        regDesk.registerVisitor(currentMemberID);
        assertTrue(regDesk.getMockOutput().equals("Giltigt årskort. Välkommen!"));

        regDesk.registerVisitor(oldMemberName);
        assertTrue(regDesk.getMockOutput().equals("Årskortet har gått ut. Före detta medlem."));
        regDesk.registerVisitor(oldMemberID);
        assertTrue(regDesk.getMockOutput().equals("Årskortet har gått ut. Före detta medlem."));

        regDesk.registerVisitor(notMemberName);
        assertTrue(regDesk.getMockOutput().equals("Personen återfinns inte på listan."));

        assertFalse(regDesk.getMockOutput().equals("Giltigt årskort. Välkommen!"));

    }
}