package _03_Scanner;

// import - 어딘가 작성된 코드를 빌려온다.
import java.util.Scanner;

public class ScannerStudy {
    static void main(String[] args) {
        // Scanner타입의 scanner 변수 생성
        Scanner scanner = new Scanner(System.in);

        // 출력 (java에서 콘솔로 데이터 출력)
        System.out.println("hello World");

        // 입력 (콘솔로 java에 데이터 입력)
        // nextLine() -> 문자열입력(엔터키까지 인식.)
        // nextLine()만 enter키를 잘라간다.
        System.out.print("이름을 입력하세요. >> ");
        String name = scanner.nextLine();
        System.out.println("이름 : " + name);

        System.out.print("나이를 입력하세요. >> ");
        int age = scanner.nextInt();
        System.out.println("나이 : " + age);
        // nextInt는 숫자만 인식. 엔터키 무시
        scanner.nextLine(); // 참고)) 입력 버터에 남아있는 엔터기 제거용도로 사용!!

        System.out.print("주소를 입력하세요. >> ");
        // nextInt에서 남긴 엔터키가 nextLine()에 바로 들어감. 그래서 오류발생.
        String address = scanner.nextLine();
        System.out.println("주소 : " + address);
    }
}
