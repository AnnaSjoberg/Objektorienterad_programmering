package sprint4.uppg9;

import java.util.List;

public class Protocol {
    private static final int STARTUP = 0;
    private static final int SENTRIDDLE = 1;
    private static final int ANOTHER = 2;

    private Riddle r1 = new Riddle("Why can’t leopards hide?", "Because they're always spotted");
    private Riddle r2 = new Riddle("What kind of jungle cat is no fun to play games with?", "A cheetah");
    private Riddle r3 = new Riddle("Where do hippopotamuses keep their money?", "In the riverbank");
    private Riddle r4 = new Riddle("What do you call a sleeping cow?", "A bulldozer");
    private Riddle r5 = new Riddle("Why did the fish blush?", "It saw the ocean's bottom");
    private Riddle r6 = new Riddle("What animal is the best cricket player?", "A bat");


    private List <String> allQuestions = List.of(r1.getQuestion(),r2.getQuestion(),r3.getQuestion(),r4.getQuestion(),r5.getQuestion(),r6.getQuestion());
    private List <String> allAnswers = List.of(r1.getAnswer(),r2.getAnswer(),r3.getAnswer(),r4.getAnswer(),r5.getAnswer(),r6.getAnswer());
    private final int numOfRiddles = allQuestions.size();
    private int state = STARTUP;
    private int currentRiddle = 0;

    public String processInput(String input) {
        String output = null;
        if (state == STARTUP) {
            state = SENTRIDDLE;
            output = allQuestions.get(currentRiddle);
            //System.out.println(rdb.getRiddleAt(currentRiddle).getQuestion());

        } else if (state == SENTRIDDLE) {
            if (allAnswers.get(currentRiddle).equalsIgnoreCase(input)) {
                output = "Correct! Want another? (y/n)";
                state = ANOTHER;
            } else {
                output = "That's incorrect, try again." + allQuestions.get(currentRiddle);
            }
        } else if (state == ANOTHER) {
            if (input.equalsIgnoreCase("y")) {
                if (currentRiddle == (numOfRiddles - 1)) {
                    currentRiddle = 0;
                } else {
                    currentRiddle++;
                }
                output = allQuestions.get(currentRiddle);
                state = SENTRIDDLE;
            } else {
                output = "Bye.";
                state = STARTUP;
            }
        }
        return output;

    }
}
