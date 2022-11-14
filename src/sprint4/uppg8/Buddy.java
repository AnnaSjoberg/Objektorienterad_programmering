package sprint4.uppg8;

import java.io.Serializable;

public class Buddy implements Serializable {
    private String name;
    private String address;
    private String phoneNumber;
    private String bDay;

    public Buddy(String name, String address, String phoneNumber, String bDay) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bDay = bDay;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getbDay() {
        return bDay;
    }
}
