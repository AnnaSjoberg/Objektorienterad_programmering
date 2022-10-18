package InUppg.Uppg2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationDeskTest {
    boolean isTest = true;
    List<PreviousCustomer> testFullList = IOHandling.listFromFile("Test/InUppg/Uppg2/testFileRead.txt");
  //  List<PreviousCustomer> testMembersList = Member.ceateAllMembersList(testFullList);
    RegistrationDesk registrationDesk = new RegistrationDesk(testFullList, isTest);


    @Test
    public void registerVisitorTest(){ //test skrivet före kod
        String testInput = "test";
        assert (registrationDesk.registerVisitor(isTest, testInput).equals(testInput));
        assert (!registrationDesk.registerVisitor(isTest, testInput).equals("Något annat"));
    }

    @Test
    public void printMeTest (){
        //undersöka om inmatningen återfinns på membersList eller fileIntoList. returnera string med information
        String testValidMember = "Anna Magdal";
        String testExpiredMember= "Erik Gunnarsson";
        String testNotMember="Påskharen";
        assertTrue (registrationDesk.printMe(testValidMember).equals("Giltig medlem"));
        assertTrue (registrationDesk.printMe(testExpiredMember).equals("Tidigare medlem"));
        assertTrue (registrationDesk.printMe(testNotMember).equals("Icke medlem"));
    }


}
