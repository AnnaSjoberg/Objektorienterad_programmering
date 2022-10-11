package sprint2.Uppg1;

public class Square implements Figure {
    private int length;
    private int width;

    public Square(int length, int width) {
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
        return 2 * (getLength() + getWidth());
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }


    @Override
    public String printMe() {
        return "Square \n" +
                "Length: " + getLength() + "\n" +
                "Width: " + getWidth() + "\n" +
                "Circumference: " + getCircumference() + "\n" +
                "Area: " + getArea();
    }
}

