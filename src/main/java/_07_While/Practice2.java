package _07_While;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            // 비밀번호 입력받기
            System.out.print("비밀번호를 입력하세요. >>");
            String MyPassword = scanner.nextLine();

            // 맞추면 "문이 열립니다."출력하고 탈출
            if (MyPassword.equals(password)) {
                System.out.println("문이 열립니다.");
                break;
            } else {
                count++;
                // 틀리면 "다시 입력하세요." 출력

                int leftCount = 5 - count;
                System.out.println("남은 횟수 : " + leftCount);

                if (count < 5) {
                    System.out.println("다시 입려하세요.");
                    continue;
                } else {
                    // 5회 틀리면 "문이 잡깁니다." 출력하고 탈출
                    System.out.println("문이 닫힙니다.");
                    break;
                }
            }

        }
    }
}
