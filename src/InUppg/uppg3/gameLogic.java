package InUppg.uppg3;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gameLogic extends MouseAdapter {
    List<JButton> sortedButtonList = new ArrayList<>(); //om denna -> använda konstruktor för att sätta värdena
    protected final List<String> sortedStringList = List.of("1","2,","3","4","5","6","7","8"
                                                                ,"9","10","11","12","13","14","15","");

    public List<String> getSortedStringList() {
        return sortedStringList;
    }

    public boolean isSorted (List<String> inputList){
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) != sortedStringList.get(i)){
                return false;
            }
        }
        return true;
    }
    public List<String> randomizeList (){
        List<String> rList = getSortedStringList();
         Collections.shuffle(rList);
        System.out.println(rList.size());
         return rList;
    }

    public void randomizeListV (List<String> input){
        Collections.shuffle(input);
    }

    // en mouseClicked med lambdas för Nytt spel som randomiserar alla knappar
    @Override
    public void mouseClicked(MouseEvent e) {


      //  if (e.getSource()) //knapparna inuti spelet, när man flyttar runt knapparna.
    }
}
//om klick bredvid tomma rutan (lodrät/vågrät) byta plats
// Scanna av alla knappar efter varje drag för att se om det är rätt ordning en lista med

//             - X -
//               |