package sprint2.Uppg1;

public class Circle implements Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getCircumference() {
        return 2* getRadius() * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(getRadius(),2) * Math.PI;
    }

    @Override
    public String printMe() {
        return "Circle \n" +
                "Radius: " + getRadius() + "\n" +
                "Circumference: " + getCircumference() + "\n" +
                "Area: " + getArea();
    }
}
