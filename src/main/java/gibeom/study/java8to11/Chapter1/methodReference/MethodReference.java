package gibeom.study.java8to11.Chapter1.methodReference;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReference {
    public static void main(String[] args) {

        // ::(콜론 2개) 는 메소드 레퍼런스를 의미

//        UnaryOperator<String> hi = (s) -> "hi " + s;
        // static 메소드를 람다에서 레퍼런스 하는 방법 : Greeting.hi();
        UnaryOperator<String> hi = Greeting::hi;

        // 특정한 인스턴스의 메소드를 사용하는 방법 (static x) : 인스턴스 생성 후 메서드
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("gibeom"));

        // 객체의 생성자를 메소드 레퍼런스로 만드는 방법
        // Supplier 자체는 Greeting이 아니다
        Supplier<Greeting> newGreeting = Greeting::new;
        // Supplier.get을 해야 Greeting이 반환됨
        Greeting greeting1 = newGreeting.get();

        // 입력값을 받는 생성자
        // 위 생성자와 다른 생성자를 참조함
        Function<String, Greeting> gibeomGreeting = Greeting::new;

        Greeting giibeom = gibeomGreeting.apply("giibeom");
        System.out.println(greeting1.getName()); // null
        System.out.println(giibeom.getName()); // giibeom


        // 특정 타입의 불특정 다수를 인스턴스 메서드를 참조하는 방법
        // 임의 객체의 인스턴스 메소드 참조
        String[] names = {"keesun", "whiteship", "toby"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

    }
}

