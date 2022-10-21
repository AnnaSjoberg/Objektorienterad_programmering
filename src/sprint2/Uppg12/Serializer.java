package sprint2.Uppg12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serializer {

    public Serializer(List<Vehicle>list) {

        try (ObjectOutputStream obOutStream = new ObjectOutputStream
                (new FileOutputStream("src/sprint2/Uppg12/serializedVehicles.ser"))) {

            for (Vehicle element:list) {
                obOutStream.writeObject(element);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
