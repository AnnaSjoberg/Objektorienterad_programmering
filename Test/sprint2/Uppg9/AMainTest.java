package sprint2.Uppg9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AMainTest {
    AMain a = new AMain();


    @Test
    public void getPersonToStringVarTest (){
        //ge en fil att läsa från
        //skicka in filen i metoden
        //returnera en string som ser ut som s1
    }


    @Test
    public void heightToIntTest(){
        String s1 = "Full Name, House 34, 12345, town, 20, 80, 187";
        String s2 = "Full Name, House 45, 12345, Town, 33, 90, 203";
        assert (a.heightToInt(s1)==187);
        assert (a.heightToInt(s2)==203);
        assert (a.heightToInt(s1)!=230);
    }

    @Test
    public void isOver2MetersTest(){
        int i1 = 187;
        int i2 = 203;
        assertFalse (a.isOver2Meters(i1));
        assertTrue(a.isOver2Meters(i2));
        assertTrue(!a.isOver2Meters(i1));
    }
/*    @Test
    public void copyTallPersonToFileTest(){
        String s1 = "Full Name, House 34, 12345, town, 20, 80, 187";
        String s2 = "Full Name, House 45, 12345, Town, 33, 90, 203";
        a.heightToInt(s2);
        assert (a.copyTallPersonToFile(s2))
    }

 */
}
