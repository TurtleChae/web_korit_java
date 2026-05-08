package _25_Stream;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

public class Stream02 {
    public static void main(String[] args) {
        // 정렬
        List<Integer> nums = Arrays.asList(1, 10, 5, 3, 2);
        List<Integer> sortedNums = nums.stream()
                // 버전마다 각자 다른 정렬알고리즘 구현되어있음.

                // 기준 : 오름차순
                // n1 - n2를 리턴하면 오름차순(기본구현)
                // n2 - n1을 리턴하면 내림차순
                // n1과 n2가 같다면 0을 리턴하게 구현
                .sorted((n1, n2) -> n1 - n1)
                .toList();
        System.out.println(sortedNums);

        @Data
                class Person {
            private final String name;
            private final int age;
        }

        List<Person> people = Arrays.asList(
                new Person("김하나", 25),
                new Person("김둘", 16),
                new Person("김셋", 37)
        );

        List<Person> oderedPeople = people.stream()
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .toList();

        // 참고) 다양한 중간 연산자
        // distinct() - 중복제거 (객체의 경우, equals() 비교)
        // limit(개수) - 개수 제한
        nums.stream()
                .distinct() // 중복 모두제거
                .sorted((n1, n2) -> n2 - n1)
                .limit(1)
                .forEach(n -> System.out.println(n));

        // 참고) reduce(최종연산자) - 누적합
        // stream은 외부변수 개입이 x
        // reduce(누적변수 초기값, (누적할변수, 리스트 요소) -> 연산식)
        int total = nums.stream()
                .reduce(0, (sum , n) -> {
                    return sum + n; // 리턴되면 다음 반복 sum의 초기값으로 들어감
                });
        System.out.println(total);

        // people에 있는 person 객체들의 나이들의 총합을
        // reduce로 구하기
        int ageSum = people.stream()
                .map(p -> p.getAge()) // reduce는 타입변환x
                .reduce(0, (aSum, n) -> {
                   for (Person p : people) {
                       aSum += n;
                   }
                   return aSum;
                });
    }
}
