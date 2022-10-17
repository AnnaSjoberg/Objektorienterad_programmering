package InUppg.Uppg2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MemberTest {

    //undersöka om personen har ett giltigt årskort

    Member s = new Member();

    @Test
    public void isMemberTest(){
        //om input med namn/p-nr kan återfinnas i listan över medlemmar
        String nameInput = "Alhambra Aromes"; //ändrs så det istället hämtas från filen?
        String IDNumInput = "7703021234";// -"-
        String wrongName = "Anna Panna";
        String wrongNumber = "1234678900";
        assertTrue (s.isMember(nameInput));
        assertTrue (s.isMember(IDNumInput));
        assertFalse (s.isMember(wrongName));
        assertFalse (s.isMember(wrongNumber));
    }
    @Test
    public void isValidTest (){
        //om dagens datum är mindre än ett år efter betaldatum
        String testDate1 = "2022-05-25";
        String testDate2 = "2020-05-25";
        assertTrue (s.isValid(testDate1));
        assertFalse (s.isValid(testDate2));

    }
}
