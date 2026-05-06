package _19_NestedClass;

import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        // 중첩 클래스
        /*
            1. 메서드 안에서 class 선언 - 지역 클래스
            -> 메서드 안에서만 클래스 역할 가능
            2. 익명 클래스
            3. 내부 클래스 - 일반내부(X), static(O)
         */

        // 익명 클래스 - 추상체(추상 클래스, 인터페이스)
        // -> 추상체로는 new가 불가능

        // Character를 상속받는 익명 클래스 정의와 동시에 생성까지
        // ch는 Character 객체X
        // ch는 그냥 익명객체 - Character를 상속받음.
        // 항상 업캐스팅 되어있음
        Character ch = new Character("익명", 99, 99) {
            private String a;
            private String b;

            @Override
            public void attack(Character target) {
                System.out.println("익명사용자 공격");
            }
        };
        System.out.println("익명 클래스의 진짜 이름음?");
        System.out.println(ch.getClass().getName()); // 익명

        // 추상체는 익명개체 생성 가능
        Yes y = new Yes() {
          @Override
          public void yes() {
              System.out.println("넵!");
          }
        };
        y.yes();

        Reservstion r = Reservstion.builder() // 깡통빌더객체 리턴
                .username("홍길동") // username초기화된 빌더객체
                .date("2026-04-30") // date 초기화된 빌더객체
                .personCount(4)
                .price(89000)
                .build(); // Reservation 생성자를 내부에서 호출

        LombokUser u = LombokUser.builder()
                .username("롬복")
                .password("lombok")
                .build();

        System.out.println(u.getUsername);
        System.out.println(u.getPassword("롬복이다!"));
    }
}
