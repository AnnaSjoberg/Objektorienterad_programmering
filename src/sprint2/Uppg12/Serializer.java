package sprint2.Uppg12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializer {
    private String fileName;

    public void serializeList(List<Vehicle> list, String fileName) {
        this.fileName = "src/sprint2/Uppg12/" + fileName + ".ser";
        System.out.println("Complete filePath: " +this.fileName);
        try (ObjectOutputStream obOutStream = new ObjectOutputStream
                (new FileOutputStream(this.fileName))) {

            obOutStream.writeObject(list);
            System.out.println("Serialization successful");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<Vehicle> DeserializeList() {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        try (FileInputStream fileIn = new FileInputStream(this.fileName);
             ObjectInputStream obIn = new ObjectInputStream(fileIn);) {

            vehicles = (List<Vehicle>) obIn.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return vehicles;
    }
}
