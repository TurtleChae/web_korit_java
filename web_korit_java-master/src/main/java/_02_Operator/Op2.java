package _02_Operator;

public class Op2 {
    static void main(String[] args) {
        // 5. 논리연산자 - boolean 타입끼리 연산
        // 연산결과도 boolean 타입

        boolean hasLicense = true;
        int age = 21;
        // &&(and연산자) : 둘 다 true일 때 true
        boolean canDrive = hasLicense && age > 18;

        // ||(or연산자) : 둘 중 하나라도 true면 true
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isRestday = isWeekend || isHoliday;

        // !(not연산자) : boolean값을 반전
        boolean isLogin = true;
        boolean isLogoff = !isLogin;

        // 0 < a < 10 연산불가
        int a = 5;
        boolean sample = (a > 0) && (a < 10);
        boolean sample2 = !((a>0) && (a < 10)); // 결과가 어떻게 될 지 고민
        System.out.println(sample2);

        // 6. 삼항연산자
        // boolean 데이터 ? true일 때의 값 : false일 때의 값
        int x = 100;
        int y = 10;
        int max = x > y ? x : y;
        System.out.println(max);

        // ? 이후의 데이터 타입이 동일 해야한다.
        boolean isSame = x == y ? true : false;
        String sameStr = x == y ? "같아요" : "달라요";

        // 실습1) height이 restrict 이상이면
        // "탑승가능", 아니면 "탑승불가능" 출력
        int height = 120;
        int restrict = 150;
        String OX = height >= restrict ? "탑승가능" : "탑승불가능";
        System.out.println(OX);

        // 실습2) 50000원 이상이면 10프로 할인가격, 아니라면 원래가격 출력
        double price = 60000.0;
        double dc = price * 0.9;
        double discount = 0.1;
        // double dc = price - price * 0.1 // 이 식이 더 좋음!! why?? 변수 변경이 쉬움.
        // double dc = price - price * discount;
        double re = price >= 50000 ? dc : price;
        System.out.println(re);

        // 중첩 가능 = 삼항"연산자" (결과가 값)
        age = 17;
        String ticketName = age >= 20 ? "성인요금" : age >= 14 ? "청소년요금" : "어린이요금";
        // 왠만하면 안하는게 좋음.


    }
}
