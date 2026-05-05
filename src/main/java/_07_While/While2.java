package _07_While;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        /*
            while(조건식) {} : (조건 -> 코드실행) x n
            do {} while(조건식) : (코드실행 -> 조건) x n
            - 최소 한번은 실행되는 반복문
         */
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        int balance = 100000;

        //메뉴 선택 시
        do {
            System.out.println("--메뉴선택--");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액확인");
            System.out.println("0. 종료");

            System.out.print("메뉴를 선택하세요. >>");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("입금할 금액 :");
                int money = scanner.nextInt();
                balance += money;
                System.out.println(money + "원 입금완료");

            } else if (choice == 2) {
                System.out.print("출금할 금액");
                int minMoney = scanner.nextInt();
                // 출금 구현 ("잔액이 부족합니다.)
                if (minMoney > balance) {
                    System.out.println("잔액이 부족합니다.");
                } else {
                    balance -= minMoney;
                    System.out.println(minMoney +"원 출금완료");
                }
            } else if (choice == 3) {
                System.out.println("현재 잔액 >>" + balance);
            } else {
                System.out.println("해당 메뉴에 존재하지 않는 숫자입니다. 다시 입력해주세요.");
            }



        } while(choice != 0); // choice == 0이면 탈출

        System.out.println("ATM 종료");
    }
}
