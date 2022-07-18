package gibeom.study.java8to11.Chapter1.javaFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerExam {
    public static void main(String[] args) {

        /*
            Consumer<T>
            T 타입의 값을 받아 아무값도 리턴하지 않는 함수
            - accept(T) : T 값을 받아 넘긴다. (리턴 x)

            함수 조합용 메소드
            - andThen
       * */

        Consumer<Integer> printAge = (i) -> System.out.printf("내 나이는 %d살 이다.", i);
        Consumer<Integer> printName = (i) -> System.out.printf("내 이름은 기범이다. ");

        printAge.accept(26); // 내 나이는 26살 이다.


        Consumer<Integer> printNameAndAge = printName.andThen(printAge);
        printNameAndAge.accept(26); // 내 이름은 기범이다. 내 나이는 26살 이다.

    }
}
