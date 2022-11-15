package sprint4.uppg9;

import java.util.ArrayList;
import java.util.List;

public class RiddleDatabase extends Riddle {
    private Riddle r1 = new Riddle("Why can’t leopards hide?", "Because they're always spotted");
    private Riddle r2 = new Riddle("What kind of jungle cat is no fun to play games with?", "A cheetah");
    private Riddle r3 = new Riddle("Where do hippopotamuses keep their money?", "In the riverbank");
    private Riddle r4 = new Riddle("What do you call a sleeping cow?", "A bulldozer");
    private Riddle r5 = new Riddle("Why did the fish blush?", "It saw the ocean's bottom");
    private Riddle r6 = new Riddle("What animal is the best cricket player?", "A bat");


    private List <Riddle> allRiddles = List.of(r1,r2,r3,r4,r5,r6);


    public List allRiddlesAsList() {
        List<Riddle> allRiddles= new ArrayList<>();
        allRiddles.add(r1);
        allRiddles.add(r2);
        allRiddles.add(r3);
        allRiddles.add(r4);
        allRiddles.add(r5);
        allRiddles.add(r6);


        return allRiddles;
    }
/*
    public Riddle getRiddleAt (int i){
        return allRiddles.get(i);
    }

    public String getQuestionAt (int i){
        return allRiddles.get(i).getQuestion();
    }

    public String getAnswerAt (int i){
        return allRiddles.get(i).getAnswer();
    }
 */
}
