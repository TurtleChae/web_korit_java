package _13_Final;

import java.util.Scanner;

public class FinalMain {
    public static void main(String[] args) {
        //변수에 final 지정 가능
        // 1회만 초기화할 수 있음
        final int data1 = 10;
        //data1 = 20;
        final int data2;
        //data = 30;

        FinalStudent st1 = new FinalStudent("김자바",001,20);

        st1.setAge(21);
        st1.printInfo("자바고");
        //왜 final인데, 객체의 상태가 변경됨?
        // 결론 : final 스택의 값을 변경하지 못하게 막는 것

        // 퀴즈) final로 재대입을 막는 것은?
        // 1. JVM    2.컴파일러(O)

        // 매직넘버, 매직스트링 : 하드코딩 되어있는 숫자, 문자열
        // 이 숫자(문자열)이 뭘 의미? 궁금해지면
        System.out.println("게임이름 : " + Constant.GAME_NAME);
        System.out.println("게임모드 : " + Constant.GAME_MODE);
        System.out.println("플레이어 수 : " + Constant.MAX_PLAYER_COUNT);

        int playerLevel = 18;

        if(playerLevel + 1 > Constant.MAX_LEVEL) {
            System.out.println("이미 최대레벨을 달생하였습니다.");
        } else {
            playerLevel++;
        }

        int price = 100000; // 외부 입력값
        // 5만원이 넘어가면 10프로 할인된 가격을 출력
        // 상수를 사용해서! 5만원(기준), 10프로(할인률)
        System.out.print("사용할 금액 : ");
        Scanner scanner = new Scanner(System.in);
        double Spend_Money = scanner.nextDouble();

        if(price > Constant.DISCOUNT_THRESHOLD) {
            double discount =  price*Constant.DIS_MONEY;
            discount = price - discount;
        }


    }
}
