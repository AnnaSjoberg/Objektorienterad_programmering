package InUppg.Uppg2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MemberTest {

    //undersöka om personen har ett giltigt årskort
    Member member = new Member();

    PreviousCustomer validMember = new PreviousCustomer("7703021234","Alhambra Aromes", "2022-07-01");
    PreviousCustomer invalidMember = new PreviousCustomer("8701131234","Anna Panna", "2020-06-21");
    List<PreviousCustomer> input = List.of(validMember,invalidMember);
    List<PreviousCustomer> membersListTest = member.ceateAllMembersList(input);
    @Test
    public void ceateAllMembersListTest (){//testet påbörjat före metoden
        assert (membersListTest.size()==1);
        assert (membersListTest.get(0).getIdNumber()=="7703021234");
        assert (membersListTest.get(0).getFullName()=="Alhambra Aromes");
        assert (membersListTest.get(0).getPurchaseDate()=="2022-07-01");
        assert (membersListTest.get(0).getFullName()!="Anna Panna");
    }

    @Test
    public void isCardValidTest(){ //Använder inte längre metoden i Member
        //om dagens datum är mindre än ett år efter betaldatum
        String testDate1 = "2022-05-25";
        String testDate2 = "2020-05-25";
        assertTrue (member.isCardValid(testDate1));
        assertFalse (member.isCardValid(testDate2));

    }



}
