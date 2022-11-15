package sprint4.uppg9;

public class Riddle {
    private static String question;
    private static String answer;

    public Riddle() {
    }

    public Riddle(String answer) {
        this.answer = answer;
    }

    public Riddle(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
