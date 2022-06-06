package gibeom.study.java8to11.javaFunctionalInterface;

import java.util.function.Predicate;

public class PredicateExam {
    public static void main(String[] args) {

        /*
            Predicate<T>
            어떠한 인자값을 받아서 true/false를 리턴해주는 함수 인터페이스이다.
            - boolean test(T t)

            함수 조합용 메소드
            - And
            - Or
            - Negate
        * */

        Predicate<String> startsWithA = (s) -> s.startsWith("a");
        System.out.println(startsWithA.test("abc"));


        Predicate<Integer> isEven = (i) -> i % 2 == 0;
        Predicate<Integer> bigger10 = (i) -> i > 10;

        // T 값이 A 함수와 B 함수가 모두 true 일때(&&) : A.and(B).test(T)
        System.out.println(isEven.and(bigger10).test(4));
        System.out.println(isEven.and(bigger10).test(12));

        // T값이 A함수 결과의 반대를 리턴 : A.negate().test(T)
        System.out.println(isEven.negate().test(4));
    }
}
