package _25_Stream;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

public class Practice01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 5, 15, 30, 50);
        List<String> names = Arrays.asList(
                "김자바", "이파이썬", "박스프링",
                "정코틀린", " 김고", "최러스트"
        );

        // 1. num에서 홀수만 골라내고, 제곱한 결과를 순서대로 출력
        nums.stream()
                .filter(n -> n % 2 == 1)
                .forEach(n -> {
                    n *= n;
                    System.out.println("제곱한 결과 : " + n);
                });

        // 2. names에 있는 이름들 중 3글자 초과만 모두 Person 객체로 바꾸기
        @Data
        class Person {
            private final String name;
            private int age = 20;
        }
        List<Person> over3s = names.stream()
                .filter(name -> name.length() > 3)
                .map(name -> new Person(name))
                .toList();

        System.out.println(over3s);
    }
}
