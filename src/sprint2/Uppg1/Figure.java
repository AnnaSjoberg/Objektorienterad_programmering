package sprint2.Uppg1;

public interface Figure {
default int convertAreaToInt(){
    return (int) getArea();
}
    double getCircumference();
    double getArea();

    String printMe();
}
