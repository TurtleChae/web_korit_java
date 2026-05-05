package _14_Inheritance.shape;

import java.util.Scanner;

public class ShapeMain {
    public static void printArea(Shape s) {
        double area = s.getArea();
        // Shape을 상속받고 오버라이딩만 하면
        // 여러가지 도형을 추가하더라도, 코드변경 X
        System.out.println("면적 : " + area);
    }

    public static void main(String[] args) {
        // Squate - width, height ,getArea() 오버라이딩
        // Triangle - width, height, getArea() 오버라이딩
        // 클래스를 작성해 주세요
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        System.out.print("가로 입력 : ");
        System.out.println();
    int height = scanner.nextInt();
        System.out.print("높이 입력 : ");

}
}
