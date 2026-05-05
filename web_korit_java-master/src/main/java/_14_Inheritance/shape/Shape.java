package _14_Inheritance.shape;

public class Shape {
    // 면적을 구하는 메서드
    protected int width;
    protected int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        int area = width * height;
        return 0;
    }
}
