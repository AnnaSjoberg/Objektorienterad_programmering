package sprint2.Uppg1;

public class Triangle implements Figure {
    private int length;
    private int width;

    public Triangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double getCircumference() {
        return getWidth() + getLength() * 2;
    }

    @Override
    public double getArea() {
        return (getLength() * getWidth()) / 2;
    }


    @Override
    public String printMe() {
        return "Triangle \n" +
                "Length: " + getLength() + "\n" +
                "Width: " + getWidth() + "\n" +
                "Circumference: " + getCircumference() + "\n" +
                "Area: " + getArea();
    }
}
