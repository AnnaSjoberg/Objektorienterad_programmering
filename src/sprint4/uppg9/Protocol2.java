package sprint4.uppg9;

public class Protocol2 {

    private static final int STARTUP = 0;
    private static final int SENTRIDDLE = 1;
    private static final int ANOTHER = 2;

    private String[] riddles = {"Why can’t leopards hide?",
            "What kind of jungle cat is no fun to play games with?",
            "Where do hippopotamuses keep their money?",
            "What do you call a sleeping cow?",
            "Why did the fish blush?",
            "What animal is the best cricket player?"};
    private String[] answers = {"they're always spotted", "A cheetah", "In the riverbank",
                                "A bulldozer", "It saw the ocean's bottom", "A bat"};

    private final int noOfRiddles = riddles.length;
    private int currentRiddle = 0;
    private int state = STARTUP;

    public String processInput(String input) {
        String output = null;
        if (state == STARTUP) {
            state = SENTRIDDLE;
            output = riddles[currentRiddle];
            //System.out.println(rdb.getRiddleAt(currentRiddle).getQuestion());

        } else if (state == SENTRIDDLE) {
            if (answers[currentRiddle].equalsIgnoreCase(input)) {
                output = "Correct! Want another? (y/n)";
                state = ANOTHER;
            } else {
                output = "That's incorrect, try again. \n" + riddles[currentRiddle];
            }
        } else if (state == ANOTHER) {
            if (input.equalsIgnoreCase("y")) {
                if (currentRiddle == (noOfRiddles - 1)) {
                    currentRiddle = 0;
                } else {
                    currentRiddle++;
                }
                output = riddles[currentRiddle];
                state = SENTRIDDLE;
            } else {
                output = "Bye.";
                state = STARTUP;
            }
        }
        return output;

    }

}
