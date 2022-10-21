package sprint2.Uppg12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {

    public Deserializer (){
        try (ObjectInputStream obInStream = new ObjectInputStream(new FileInputStream("src/sprint2/Uppg12/serializedVehicles.ser"))){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
