package _02_Operator;

public class Op1 {
    public static void main(String[] args) {
        // 연산자 : 계산을 수행하는 기호 ex) +, -
        // 3 + 4 -> "+" : 연산자, 3, 4 : 피연산자
        // a + b -> 변수들도 피연산자 가능

        // 1. 산술연산자
        int num1 = 3;
        int num2 = 2;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);

        // int끼리 연산결과는 int -> 소수점 버림 발생
        System.out.println(num1 / num2); // 몫 연산 : 1
        System.out.println(num1 % num2); // 나머지 연산 : 1

        // 2. 비교연산자
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        boolean isSame = num1 == num2;

        System.out.println(num1 > 0); // 초과
        System.out.println(num1 < 0); // 미만
        System.out.println(num1 >= 0); // 이상
        System.out.println(num1 <= 0); // 이하
        // 0 < num1 < 10 : Java는 불가능

        // 짝수 판단
        System.out.println(num1 % 2 == 0);
        // 홀수 판단
        System.out.println(num1 % 2 != 0);

        // 22시에서 50시간을 더한 시각을 코드를 구현해서 출력해주세요.
        int now = 22;
        int hour = 50;

        int total = (now + hour) % 24;

        System.out.println("최종시간 : " + total);

        // 3. 단항연산자
        int a = 1;

        // 후위증감
        int b = a++; // 대입되고 나서 1 증가 시켜라
        System.out.println(b);

        a = 1;
        // 전위증감
        b = ++a; // 대입전에 1 증가 시켜라
        System.out.println(b);

        a =1;
        // 후위감소
        b = a--;
        System.out.println(b);

        a = 1;
        // 전위감소
        b = --a;
        System.out.println(b);

        // 단독사용시 전위/후위 결과 동일
        a++; ++a;

        // 4. 대입연산자
        a = 5; // 메모리(ram) : 어딘가에 데이터를 복사하는 연산

        a = a + 3; // 대입연산은 제일 마지막 순위
        // 복합대입연산자
        a += 3;
        a -= 3; // a = a - 3;
        a *= 3; // a = a * 3;
        a /= 3; // a = a / 3;
        a %= 3; // a = a % 3;



    }
}
