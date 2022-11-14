package sprint4.uppg7;

import java.io.Serializable;

public class Response implements Serializable {
    private boolean found;
    private Buddy person;
    private String response;

    public Response() {
    }

    public Response(boolean found) {
        this.found = found;
    }

    public Response(boolean found, Buddy person) {
        this.found = found;
        this.person = person;
    }

    public boolean isFound() {
        return found;
    }

    public Buddy getPerson() {
        return person;
    }

    public String getResponse() {
        if (!isFound()){
            return "Not found in phonebook";
        }else {
            return person.getName() + " " + person.getAddress() + " " + person.getPhoneNumber() + " " + person.getbDay();
        }
    }
}