package gibeom.study.java8to11.javaFunctionalInterface;

import java.util.function.Supplier;

public class SupplierExam {
    public static void main(String[] args) {

        /*
            Supplier<T>
            어떠한 값을  가져오는 인터페이스 이다.
            받아올 값의 타입을 정의한다.
            - T get()
        * */

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());
    }
}
