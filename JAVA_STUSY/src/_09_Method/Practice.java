package _09_Method;

public class Practice {

    // 등급을 구하는 메서드
    // 평균을 매개변수로 전달받아, 학점을 리턴
    // 90이상 A, 80이상90미만 B, 70이상80미만 C, 나머지 D
    public static String getGrade(double avg) {
        if(avg >= 90) {
            return "A";
        } else if(avg >= 80) {
            return "B";
        } else if(avg >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void printStudentInfo
            (String name, int[] scores)
    {
        // 총점
        double scoreSum = 0.0;
        for(int score : scores) {
            scoreSum += score;
        }
        // 평균
        double average = scoreSum / scores.length;
        // 등급
        String grade = getGrade(average);

        System.out.println("이름: " + name);
        System.out.println("총점: " + scoreSum);
        System.out.println("평균: " + average);
        System.out.println("등급: " + grade);
    }

    public static void main(String[] args) {
        // 학생이름, 국,영,수 점수를 배열로 매개변수로 넘기면,
        // 이름, 총점, 평균, 등급을 출력하는 메서드
        int[] scores = {80, 90, 70};
        printStudentInfo("홍길동", scores);
    }
}