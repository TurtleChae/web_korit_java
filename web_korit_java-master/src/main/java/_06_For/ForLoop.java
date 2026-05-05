package _06_For;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
            반복문 - for문

            for(변수선언 - 초기식; 조건식; 증감식) {
                반복될 코드
            }
            for문의 코드 진행 순서
            초기식 ->(조건식검사 -> true면 코드실행 -> 증감식) * n
            -> 조건식검사 결과가 false면 for 중괄호 탈출
         */

        // "안녕하세요." 5번 출력
        for (int i = 1; i < 6; i++)
        {
            System.out.println("안녕하세요");
        }

        // 초기식 생략시
        int a = 0;
        for (;a < 5; a++) {
            System.out.println("안녕하세요.");
        }
        // 중간코드
        int b = 0;
        for (; a < 10; a++){
            b++;
        }
        System.out.println(a + b); // 출력값을 작성하시오.

        for (int j = 1; j < 6; j++) {
            System.out.println("사람" + j);
        }

        // 1단계 ) 1 ~ 10 출력
        for (int num1 = 1; num1 < 11; num1++) {
            System.out.println(num1);
        }

        // 2단계) 1 ~ 10 중 짝수만
        for (int num2 = 1; num2 < 11; num2++) {
            if (num2 % 2 == 0) {
                System.out.println(num2);
            }
        }

        // 3단계) 1 ~ 100 합한 값 출력
        int sum = 0; // 외부 변수
        for (int num3 = 1; num3 < 101; num3++) {
            sum += num3;
        }
        System.out.println("최종 결과: " + sum);

        // I love you, Guys


        // 4단계) 1 ~ 100까지 수 중에서
        // 3의배수, 5의 배수가 각각 몇개인지 출력
        int count3 = 0;
        int count5 = 0;
        for (int k = 1; k < 101; k++) {
            if(k % 3 == 0) {
                count3++;
            } else if (k % 5 == 0) {
                count5++;
            }
        }
        System.out.println("3의 배수 : " + count3);
        System.out.println("5의 배수 : " + count5);

        for (int i = 1; i <= 10; i++) {
            // 짝수면 출력해
            // 홀수면 출력하지마
            if (i % 2 != 0) {
                System.out.println("홀수발견");
                continue; // 다음 반복으로 스킵
            } else {
                System.out.println(i);
            }
        }

        // 1 ~ 10 더하다가 20이 넘어가는 순간 탈출
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 += 1;
            if (sum2 > 20) {
                System.out.println("20 초과! : " + sum2);
                break; // 반복중단 -> for문 중괄호 즉시탙출
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력받으세요 ( 1 ~ 100 ) >> ");
        // 입력받은 숫자를 찾으면, 탈출하면서 누적합 출력

        int numin = scanner.nextInt();
        boolean isExist = false;
        int total = 0;

        for (int i = 1; i <= 100; i++) { // 입력받은 숫자를 1 ~ 100 for문으 돌며 탐색
            total += i; // 매 반복마다 누적합
            if (numin == i) {
                System.out.println("누적합 : " + total);
                isExist = true;
                break;
            }
        }
        // 만약에 못 찾으면, "찾을 수 없습니다." 출력
        if (!isExist) {
            System.out.println("찾을 수 없습니다.");
        }

        // 1 ~ 100 반복중
        // 누적합
        // 누적합이 2000이 넘어가고,
        // i가 짝수일 때 탈출하고,  i와 누적합 출력
        int sum5 = 0;

        for (int i = 1; i <= 100; i++) {
            sum5 += i;
            if (sum5 > 2000 && i % 2 == 0) {
                System.out.println("i의 값 : " + i);
                System.out.println("누적합 : " + sum5);
                break;
            }
        }













    }
}
