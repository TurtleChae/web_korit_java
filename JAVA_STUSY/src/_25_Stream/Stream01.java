package _25_Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Stream01 {
    public static void main(String[] args) {
        //  스트림 - java 8부터 지원
        // 1. 원본을 변경하지 않고, new로 새로운 컬렉션을 리턴
        // 2. 파이프라인구조(체이닝) - 자기자신을 리턴

        // List.of() -> 불변객체(조회만 가능)
        // Array.asList() -> 크기변경x, 업데이트 가능
        List<String> names = Arrays.asList(
                "김자바", "이파이썬", "박스프링",
                "정코틀린", "김고", "최러스트"
        );

        // 스트링을 생성하는 방법
        // 1. 컬렉션.stream() - List, Set 등에서 생성
        // 2. Array.stream() - 배열에서 생성

        names.stream()
                .filter(s -> s.length() >= 3) // Stream<String> -> Stream<String>
                .forEach(s -> System.out.println(s));

        // filter, forEach 메서드들을 스트림연산이라고 함
        // 종류
        // 1. 중간연산 - 체이닝 가능

        // filter(Predicate<T> p) - true인 결과 데이터만 남김
        List<String> kims = names.stream()
                .filter(s-> s.startsWith("김"))
                .toList(); // 최종 연산
        System.out.println(kims);

        // map(Function<T, R> f) - 데이터를 변환(자료형 변환 포함)할 때 사용
        List<String> nims = names.stream()
                .map(name -> name + "님")
                .toList();
        System.out.println(nims);

        // names의 이름들을 문자열 길이로 다 변환시키기
        // 홍길동 -> 3
        List<Integer> makeInt = names.stream()
                .map(name -> name.length())
                .toList();
        System.out.println(makeInt);


        // 2. 최종연산 - 마무리, 체이닝불가능(스트림을 소모)

        // forEach(Consumer<T> c)
        makeInt.stream()
                .forEach(n -> {
                    if ( n % 2 == 0) {
                        System.out.println("짝수");
                    } else {
                        System.out.println("홀수");
                    }
                });

        // toList() 최종 연산 -> List 반환

        // 중간연산은 여러번 가능
        names.stream()
                .filter(name -> name.length() > 3)
                .filter(name -> name.startsWith("김"))
                .map(name -> name + "님")
                .forEach(name -> System.out.println(name));
    }
}
