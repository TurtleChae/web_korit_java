package _14_Inheritance.shape;

public class Triangle extends Shape{
    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double getArea() {
        double area = (width * height) / 2.0;
        return area;
    }
}
