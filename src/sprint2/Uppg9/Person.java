package sprint2.Uppg9;

public class Person {
    private String fullInformation;
    private String secondLine;
    private String fullName;
    private String address;
    private int age;
    private int weight;
    private int height;

    public Person(String informationFromFile) {
        fullInformation = informationFromFile;
    }

    public String getFullInformation() {
        return fullInformation;
    }
    public String getSecondLine(){
        return getFullInformation().substring(getFullInformation().indexOf('\n') + 1).trim();
    }

    public String getFullName() {
        return getFullInformation().substring(0, getFullInformation().indexOf(',')).trim();
    }

    public String getAddress() {
        return getFullInformation().substring(getFullInformation().indexOf(',') + 1, getFullInformation().indexOf('\n')).trim();
    }

    public int getAge() {
        return Integer.parseInt(getSecondLine().substring(0, getSecondLine().indexOf(',')));
    }

    public int getWeight() {
        return Integer.parseInt(getSecondLine().substring(getSecondLine().indexOf(' '), getSecondLine().lastIndexOf(',')).trim());
    }
    public int getHeight() {
        return Integer.parseInt(getSecondLine().substring(getSecondLine().lastIndexOf(' ')).trim());
    }

}
