package _06_For;

public class NestedFor {
    public static void main(String[] args) {
        // 2중 for문

        for (int day = 1; day <= 7; day++) {
            System.out.println(day +"일 지났습니다.");
        }

        // 한달
        // 바깥 반복이 한번돌때, 안쪽 반복은 전체반복
        for (int week = 1; week <=4; week++) {
            System.out.println(week + "주 시작");
            // 7일(일주일) 살기\
            for (int day = 1; day <= 7; day++) {
                System.out.println("     " + day + "일 살았습니다.");
            }
            System.out.println(week + "주 끝");
        }

        // 구구단
        /*
            2단 시작!
                2 x 1 = 2
         */
        System.out.println(2 + "단 시작!");
        for (int i = 0; i < 10; i++) {
            System.out.println("    " + 2 + " x " + i + " = " + 2*i);
        }

        for (int i = 2; i < 10; i++) {
            System.out.println(i +"단 시작!");
            for (int j = 1; j < 10; j++) {
                System.out.println("    " + i +" x "+ j + " = " + i*j);
            }
            System.out.println(i + "단 끝!");
        }


    }
}
