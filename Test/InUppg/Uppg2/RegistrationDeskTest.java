package InUppg.Uppg2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationDeskTest {
    boolean isTest = true;
    List<PreviousCustomer> testList = IOHandling.listFromFile("Test/InUppg/Uppg2/testFileRead.txt");
    RegistrationDesk registrationDesk = new RegistrationDesk(isTest);


    @Test
    public void registerVisitorTest(){
        String testInput = "test";
        assert (registrationDesk.registerVisitor(isTest, testInput).equals(testInput));
    }

    @Test
    public void printMeTest (){
        //undersöka om inmatningen återfinns på membersList eller fileIntoList. returnera string med information
        String testValidMember = "Anna Magdal";
        String testExpiredMember= "Erik Gunnarsson";
        String testNotMember="Påskharen";
        assertTrue (registrationDesk.printMe(testValidMember).equals("Giltig medlem"));
        assertTrue (registrationDesk.printMe(testExpiredMember).equals("Tidigare medlem"));
        assertTrue (registrationDesk.printMe(testNotMember).equals("Inte medlem"));
    }


}
