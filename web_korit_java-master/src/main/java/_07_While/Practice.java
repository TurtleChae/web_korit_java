package _07_While;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 랜덤
        Random random = new Random();

        // 1 이상 11미만 정수 중 랜덤 하나 뽑기
        int randomNum = random.nextInt(1, 11);
        System.out.println(randomNum);

        while(true) {
            System.out.print("숫자 입력 >>");
            int myGuess = scanner.nextInt();

            if (myGuess == randomNum) {
                System.out.println("정답입니다." + myGuess);
                break;
            } else {
                System.out.println("다시 입려하세요.");
                break;
            }
        }

        //1 ~ 100 사이 랜덤 숫자 뽑은 후, 대입
        int randomInt = random.nextInt(1,101);

        while (true) {
            // 1. 1 ~ 100 사이 정수 입력받기
            // 2. 입력값 > 랜덤값 "down" 출력
            // 3. 입력값 == 랜덤값 "정답" 출력 후 탈출
            // 4. 입력값 < 랜덤값 "Up" 출력
            System.out.print("추측한 숫자 입력 >>");
            int Guess = scanner.nextInt();

            // 입력값 검증 (1 ~ 100)
            if (Guess < 1 || Guess > 100) {
                System.out.println("1 ~ 100 사이의 숫자를 입력하세요.");
                continue;
            }

            if (Guess > randomInt) {
                System.out.println("Down");
            } else if (Guess < randomInt) {
                System.out.println("Up");
            } else {
                System.out.println("정답입니다.");
                break;
            }

        }

    }
}
