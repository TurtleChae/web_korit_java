package _20_Enum;

import lombok.Getter;

@Getter
public class ClassGrade {
    /*
        상수의 한계점
        1. 상수사용을 문법으로 강제할 수 있을까?
        2. 컴파일 할 때 미리 검사할 수 있을까?
        -> 문자열, 숫자 대신에 객체를 상수처럼 사용해야겠다.
        -> ENUM
     */
    public static final String DIAMOND_MEMBER = "DIAMOND";
    public static final String GOLD_MEMBER = "GOLD";
    public static final String SILVER_MEMBER = "SILVER";

    private int discountRate; // 연관된 정보들을 필드로 선언

    public static final ClassGrade SILVER = new ClassGrafe(5);
    public static final ClassGrade GOLD = new ClassGrade(10);
    public static final ClassGrade DIAMOND = new ClassGrade(20);

    // 외부 생성을 막아버림
    private ClassGrade(int discountRate) {
        this.discountRate = discountRate;
    }
}
