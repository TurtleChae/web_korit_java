package _01_Print;

public class PersonInfo {
    public static void main(String[] args) {
        /*
            아래의 데이터를 적절한 자료형과 변수명으로 저장하고,
            각 변수들을 출력해 주세요
            1. 이름, 2. 출생연도, 3.키(소숫점), 4.혈액형
            5. 학생여부(true/false)
        */

        String myName = "홍길동";
        int birthYear = 2001;
        double myHeight = 173.5;
        char bloodType = 'B';
        boolean isStudent = true;

        System.out.println("이름: " + myName);
        System.out.println("출생연도: " + birthYear);
        System.out.println("키: " + myHeight);
        System.out.println("혈액형: " + bloodType);
        System.out.println("학생여부: " + isStudent);

    }
}