package _18_Singleton;

public class Logger {
    /*
        디자인패턴 - 싱글톤 (스프링쿠부트에서 자주 등장)
        서버 전체에서 단 하나의 객체(instance)를 공유하게 하고싶다

        1. 생성자 - 외부에서 new하지 못하게 private로 제한
        2. public 메서드로 객체 하나만 돌려쓰기 구현
        3. 외부에 공유할 단 하나의 객체를 필도로 가진다.
     */

    private static Logger instance;

    // 생성자의 접근제한자를 private -> 외부에서 new 불가
    private Logger() {}

    // 외부접근용 메서드
    public static Logger getInstance() {
        // 단 하나의 객체를 사용하게 끔
        if (instance == null) { // 저장된 주소가 없다면
            instance = new Logger();
        }
        return instance;
    }
}
