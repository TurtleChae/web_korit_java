package _16_interface.A;

public class Square implements Shape {
    private double width;
    private double height;

    public Square (double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
