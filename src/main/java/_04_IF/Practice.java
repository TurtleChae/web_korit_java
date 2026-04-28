package _04_IF;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String realId = "java";
        String realPassword = "qwer1234";

        // 1. 스캐너를 통해 아이디, 패스워드르 입력받는다.
        // 2. 입력받은 아이디, 패스워드가 모두 동일하면.
        // 로그인 성공 출력, 아니라면 로그인실패 출력

        Scanner scanner = new Scanner(System.in);

        System.out.print("아이디를 입력하세요 >> ");
        String realId1 = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요 >> ");
        String realPassword1 = scanner.nextLine();

        boolean isSameId = realId.equals(realId1);
        boolean isSamePassword = realPassword.equals(realPassword1);
        boolean isValidLogin = isSameId && isSamePassword;

        if (isValidLogin) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
