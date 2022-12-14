package InUppg.uppg2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {
    String mockName = "Ture Mackapär";
    String mockID = "1603151234";
    String mockDateValid = LocalDate.now().minusDays(7).toString();
    String mockDateExpired = "2018-06-08";

    Customer c1 = new Customer(mockID, mockName, mockDateValid);
    Customer c2 = new Customer(mockID, mockName, mockDateExpired);

    @Test
    public void isActiveMemberTest() { //Test före äldre version av kod (som sedan ändrats något)
        assertTrue(c1.isActiveMember());
        assertFalse(c2.isActiveMember());
        assertTrue(!c2.isActiveMember());
    }

}
