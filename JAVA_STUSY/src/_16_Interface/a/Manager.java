package _16_Interface.a;

public class Manager {

    // 1 면적당 100원
    public double calcPrice(Shape shape) {
        double area = shape.getArea();
        double price = area * 100;
        return price;
    }
}