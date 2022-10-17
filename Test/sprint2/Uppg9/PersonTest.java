package sprint2.Uppg9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {


    Person tallPerson = new Person("Rulle Rullson, Xvägen 3, 12345 Ystad\n" +
            "56, 35, 201");
    Person shortPerson = new Person("Gulle Gullson, Xvägen 6, 12345 Ystad\n" +
            "47, 75, 161");

    @Test
    public void getFullNameTest() {

        assertTrue(tallPerson.getFullName().equals("Rulle Rullson"));
        assertTrue(shortPerson.getFullName().equals("Gulle Gullson"));
        assertFalse(tallPerson.getFullName().equals("Karolina"));
    }

    @Test
    public void getAddressTest() {

        assertTrue(tallPerson.getAddress().equals("Xvägen 3, 12345 Ystad"));
        assertTrue(shortPerson.getAddress().equals("Xvägen 6, 12345 Ystad"));
        assertFalse(tallPerson.getAddress().equals("Hemma"));
    }

    @Test
    public void getAgeTest (){

        assertTrue(tallPerson.getAge()==56);
        assertTrue(shortPerson.getAge()==47);
        assertFalse(tallPerson.getAge()==15);
    }

    @Test
    public void getWeightTest (){
        assertTrue(tallPerson.getWeight()==35);
        assertTrue(shortPerson.getWeight()==75);
        assertFalse(tallPerson.getWeight()==15);
    }

    @Test
    public void getHeightTest (){
        assertTrue(tallPerson.getHeight()==201);
        assertTrue(shortPerson.getHeight()==161);
        assertFalse(tallPerson.getHeight()==15);
    }
}
