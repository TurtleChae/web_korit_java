package _01_Print;

public class PersonInfo {
    public static void main() {
        /*
            아래의 데이터를 적절한 자료형과 변수명으로 저장하고,
            각 변수들을 출력하세요
            1. 이름, 2. 출생연도, 3. 키(소수점), 4.혈액형,
            5. 학생여부 (true/false)
         */
        String name = "채정윤";
        int BornYear = 2006;
        double height = 160.9;
        char BloodType = 'B';
        boolean isStudent = true;

        System.out.println("이름 : " + name);
        System.out.println("출생연도 : " + BornYear);
        System.out.println("키 : " + height);
        System.out.println("혈액형 : " + BloodType);
        System.out.println("학생여부 : " + isStudent);
    }
}
