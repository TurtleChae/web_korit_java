package _06_For;

public class Star {
    public static void main(String[] args) {
        /*
            *****
            ***** 5번 출력
         */
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.println("*");
            } //한 줄 출력
            System.out.println(); // 엔터
        }

        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
