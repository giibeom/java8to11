package gibeom.study.java8to11.Chapter1.javaFunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExam {
    public static void main(String[] args) {

        /*
            UnaryOperator<T>
            입력값이 하나이면서 입력값과 리턴값 타입이 동일할때 사용

            Function<T,R>를 상속받기 때문에 Function의 메서드를 모두 사용 가능
            - apply
            - compose
            - andThen
        * */

//        Function<Integer, Integer> plus20 = i -> (i + 20);
        // 위에것을 아래로 변환 가능 (입력,반환 타입이 Integer로 동일하기 때문)
        UnaryOperator<Integer> plus20 = i -> (i + 20);

//        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        UnaryOperator<Integer> multiply2 = i -> (i * 2);

        System.out.println(plus20.andThen(multiply2).apply(10));
    }
}
