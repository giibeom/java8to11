package gibeom.study.java8to11.javaFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExam {
    public static void main(String[] args) {

        /*
            BinaryOperator<T>
            입력값이 두개이면서 모든 입력값 타입과 반환값 타입이 모두 동일한 경우 사용 가능
            
            BiFunction<T, U, R> 을 상속받음
        * */


//        BiFunction<Integer, Integer, Integer> plus = (i, j) -> i + j;
        // 위에것을 아래로 변환 가능 (입력,반환 타입 모두가 Integer로 동일하기 때문)
        BinaryOperator<Integer> plus = (i, j) -> i + j;

        System.out.println(plus.apply(20, 30));

    }
}
