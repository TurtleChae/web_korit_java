package _16_interface.A;

public class Triangle implements Shape{
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height * 0.5;
    }
}
