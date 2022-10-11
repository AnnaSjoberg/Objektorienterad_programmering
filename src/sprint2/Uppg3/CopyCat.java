package sprint2.Uppg3;

public class CopyCat {
    private String input;

    public CopyCat() {}

    public CopyCat(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public String printCopy (){
        return ("Du skrev: " + getInput()).trim();
    }
}
