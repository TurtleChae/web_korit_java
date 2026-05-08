package _07_While;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 랜덤
        Random random = new Random();

        // 1이상 11미만 정수 중 랜덤 하나 뽑은 후, 대입
        int randomNum = random.nextInt(1, 11);

        System.out.println(randomNum);

        while(true) {
            System.out.print("숫자 입력 >");
            int myGuess = scanner.nextInt();

            if(myGuess == randomNum) {
                System.out.println("정답입니다: " + myGuess);
                break;
            } else {
                System.out.println("다시 입력하세요!");
            }
        }

        // 1~100사이 랜덤숫자 뽑은 후, 대입
        int randomInt = random.nextInt(1, 101);

        while(true) {
            System.out.print("정수 입력(1~100) >");
            int myGuess = scanner.nextInt();

            // 입력값 검증(1~100 값)
            if(myGuess < 1 || myGuess > 100) {
                System.out.println("1~100사이 값을 입력하세요");
                continue;
            }

            if(myGuess > randomInt) {
                System.out.println("down");
            } else if(myGuess < randomInt) {
                System.out.println("up");
            } else {
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}