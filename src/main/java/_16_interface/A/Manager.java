package _16_interface.A;

public class Manager {
    // 1 면적 당 100원
    public double calcPrice(Shape shape) {
        double price = shape.getArea() * 100;
        return price;
    }
}
