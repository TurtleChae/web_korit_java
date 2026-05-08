package _07_While;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int maxCount = 5;

        while(true) {
            // 비밀번호 입력받기
            System.out.print("비밀번호 입력 >");
            String inputPW = scanner.nextLine();

            // 맞추면 "문이 열립니다" 출력하고 탈출
            // 틀리면, "다시 입력하세요" 출력
            if(inputPW.equals(password)) {
                System.out.println("문이 열립니다");
                break;
            } else {
                System.out.println("다시 입력하세요");
                count++;
            }

            // 5회 틀리면, "문이 잡깁니다" 출력하고 탈출
            if(count == maxCount) {
                System.out.println("문이 잠깁니다");
                break;
            } else {
                int leftTrial = maxCount - count;
                System.out.println("남은시도횟수: " + leftTrial);
            }
        }
    }
}