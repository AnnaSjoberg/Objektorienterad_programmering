package sprint2.Uppg1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    Figure square = new Square(1,1);
    Figure triangle = new Triangle(1,1);
    Figure circle = new Circle(1);
    List<Figure> figures = new ArrayList<>();

    Main(){
        figures.add(square);
        figures.add(triangle);
        figures.add(circle);

        figures.sort(Comparator.comparing(Figure::getArea));

        for (Figure element:figures) {
            System.out.println(element.printMe());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
