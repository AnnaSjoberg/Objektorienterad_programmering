package sprint1.Uppg6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    Bird cuckoo = new Cuckoo();
    Bird owl = new Owl();
    Mammal mouse = new Mouse();
    Mammal lion = new Lion();
    Reptile rattleSnake = new RattleSnake();
    Reptile adder = new Adder();

    List<Animal> animalList = new ArrayList<>();

    Main(){
        animalList.add(cuckoo);
        animalList.add(owl);
        animalList.add(mouse);
        animalList.add(lion);
        animalList.add(rattleSnake);
        animalList.add(adder);

        Collections.shuffle(animalList);

        for (Animal animal:animalList) {
            animal.call();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
