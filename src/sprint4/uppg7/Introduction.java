package sprint4.uppg7;

import java.io.Serializable;

public class Introduction implements Serializable {
    private String greeting ="Connection established. Enter your search: ";

    public String getGreeting() {
        return greeting;
    }
}
