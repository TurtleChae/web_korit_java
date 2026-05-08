package _16_Interface.a;

public class Triangle implements Shape {
    private int height;
    private int width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width * 0.5;
    }
}