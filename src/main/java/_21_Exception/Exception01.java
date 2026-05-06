package _21_Exception;

import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        // 자바의 예외
        // Error(예측X)
        // Exception (이미 정의되어 있는 상황)
        int a = 10;
        int b = 0;
        System.out.println("나누기 연산 실행합니다.");
        // 자동으로 예외객체를 생성
        // JVM은 예외객체를 감지하고, 코드진행을 즉시 멈춤

        // 예외상황들을 미리 알고, 처리할 수 있음
        try{ // try - catch - finally => 예외 처리 문법
            // 예외가 일어날 가능성 있는 코드
            int result = a/b;
            // a/b에서 예외객체 생성
            // JVM은 해당 예외타입을 잡아줄 catch를 찾으러 감
            System.out.println("저는 실행될까요?");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없어요");
        } catch (Exception e) {
            // Exception타입은 모든 예외클래스의 부모클래스
            // 구체적인 자식 예외 클래스부터 차례대로 작성하는 것을 권장.
        } finally {
            // 예외가 발생하건, 안하건 언제나 실행되는 블럭
            System.out.println("저는 항상 실행됩니다.");
        }

        // 아래의 코드에서 예외처리를 적용
        String[] colors = {"black", "white", "blue", "red"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("색상을 골라주세요 (0 ~ 3)");
        int pickNum = scanner.nextInt();
        String pickColor = colors[pickNum];
        System.out.println("선택한 색상 : " + pickColor);

        try {

        } catch() {

        } finally {

        }
    }
}
