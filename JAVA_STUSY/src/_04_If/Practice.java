package _04_If;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String realId = "java";
        String realPassword = "qwer1234";

        // 1. 스캐너를 통해 아이디, 패스워드를 입력받는다
        // 2. 입력받은 아이디, 패스워드가 모두 동일하면,
        // 로그인성공 출력, 아니라면 로그인실패 출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디 입력 >");
        String inputId = scanner.nextLine();
        System.out.print("패스워드 입력 >");
        String inputPassword = scanner.nextLine();

        boolean isSameId = realId.equals(inputId);
        boolean isSamePassword = realPassword.equals(inputPassword);
        boolean isValidLogin = isSameId && isSamePassword;

        if(isValidLogin) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }

    }
}