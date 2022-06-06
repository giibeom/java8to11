package gibeom.study.java8to11.javaFunctionalInterface;

import java.util.function.Function;

public class FunctionExam {
    public static void main(String[] args) {

        /*
          Function<T,R>
          Function이라는 함수 인터페이스에는 추상메서드가 정의되어있다.
            - apply
            - compose
            - andThen
        * */

        // 이런식으로 클래스를 따로 선언하여 쓸 수도 있지만 람다로 바로 구현하여 사용할수도 있음
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        // 람다로 바로 구현하여 리턴하는 함수 생성 후 변수에 할당
        Function<Integer, Integer> plus20 = i -> (i + 20);
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        // 함수 T를 받아 R로 리턴하는 메서드 : apply(T)
        System.out.println(plus20.apply(1));
        System.out.println(multiply2.apply(1));

        // 함수와 함수를 조합하는 메서드 : A.compose(B)
        // B를 실행 한 다음 A가 실행
        // multiply2 -> 곱한값을 그대로 plus20에다 전달 -> 결과
        Function<Integer, Integer> multiply2AndPlus20 = plus20.compose(multiply2);
        System.out.println(multiply2AndPlus20.apply(2));

        // 함수와 함수를 조합하는 메서드 : A.andThen(B)
        // A를 실행 한 다음 B가 실행
        Function<Integer, Integer> plus20AndMultiply2 = plus20.andThen(multiply2);
        System.out.println(plus20AndMultiply2.apply(2));


    }
}
