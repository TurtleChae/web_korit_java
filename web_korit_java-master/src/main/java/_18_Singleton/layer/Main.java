package _18_Singleton.layer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        // 스프린부트 맛보기
        /*
            Controller - 사용자의 데이터를 받아주는 창구
            -> www.naver.com : 서버 주소
            -> www.naver.com/news?pages=1
               : 서버주소 이후에 등장하는 /는 컨트롤러 경로
            Service - 비즈니스 로직을 작성
            Repository - 데이터베이스 연결(+ 쿼리)
         */

        // 1. 사용자 입력 - Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. 의존성주입 main에서 Singleton 객체들을 생성 및 조립

        // 인터페이스를 통해서 결합도를 낮추는 것이 권장됨
        UserRepo userRepository = UserRepository.getInstance();
        // UserRepo userRepoJDBC = new UserRepoJDBC();
        UserService userService = UserService.getInstance(userRepository);

        while(true) {
            System.out.println("==== 회원가입 서버 ====");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 회원목록");
            System.out.println("0. 종료");

            System.out.print("메뉴 선택 >> ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.println("아이디 입력 >> ");
                String username = scanner.nextLine();
                System.out.println("비밀번호 입력 >> ");
                String password = scanner.nextLine();

                SingupReqDto reqDto = new SingupReqDto(username, password);
                userService.signup(reqDto);
            } else if (menu == 2) {
                System.out.print("아이디 >> ");
                String username = scanner.nextLine();
                System.out.print("패드워드 >> ");
                String password = scanner.nextLine();

                String msg = userService.signin(username, password);
                System.out.println(msg);
            } else if (menu == 3) {
                userService.showAllUsers();
            } else if (menu == 0) {
                break;
            } else {
                System.out.println("유효하지 않는 숫자를 입력하였습니다.");
                return;
            }
        }


    }
}
