package InUppg.Uppg2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MemberTest {

    //undersöka om personen har ett giltigt årskort
    Member member = new Member();

    @Test
    public void ceateAllMembersListTest (){//testet skrivet före metoden
        PreviousCustomer validMember = new PreviousCustomer("7703021234","Alhambra Aromes", "2022-07-01");
        PreviousCustomer invalidMember = new PreviousCustomer("8701131234","Anna Panna", "2020-06-21");
        member.ceateAllMembersList(validMember);
        member.ceateAllMembersList(invalidMember);
        assert (member.allMembers.size()==1);
        assert (member.allMembers.get(0).getIdNumber()=="7703021234");
        assert (member.allMembers.get(0).getFullName()=="Alhambra Aromes");
        assert (member.allMembers.get(0).getPurchaseDate()=="2022-07-01");
        assert (member.allMembers.get(0).getFullName()!="Anna Panna");
    }

    @Test
    public void isCardValidTest(){
        //om dagens datum är mindre än ett år efter betaldatum
        String testDate1 = "2022-05-25";
        String testDate2 = "2020-05-25";
        assertTrue (member.isCardValid(testDate1));
        assertFalse (member.isCardValid(testDate2));

    }

    @Test
    public void isOnMemberListTest(){
        //om input med namn/p-nr kan återfinnas i listan över medlemmar
        String nameInput = "Alhambra Aromes";
        String IDNumInput = "7703021234";
        String wrongName = "Anna Panna";
        String wrongNumber = "1234567890";
        assertTrue (member.isOnMembersList(nameInput));
        assertTrue (member.isOnMembersList(IDNumInput));
        assertFalse (member.isOnMembersList(wrongName));
        assertFalse (member.isOnMembersList(wrongNumber));
    }

}
