package gibeom.study.java8to11.Chapter1.javaFunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionExam {
    public static void main(String[] args) {

        /*
            BiFunction<T, U, R>
            BiFunction은 두개의 값을 받아 하나의 값으로 리턴
                - (Function은 하나의 값을 받아서 값을 하나의 값으로 리턴)
            - R apply(T, U) : T, U 값을 받아 R로 리턴

        * */

        BiFunction<Integer, Integer, Integer> plus = (i, j) -> i + j;
        System.out.println(plus.apply(20, 30));

    }
}
