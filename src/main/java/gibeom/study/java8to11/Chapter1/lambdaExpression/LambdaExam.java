package gibeom.study.java8to11.Chapter1.lambdaExpression;

import java.util.function.*;

public class LambdaExam {
    public static void main(String[] args) {

        /*
            람다 : (인자 리스트) -> {바디}

            인자 리스트
            - 인자가 없을 때 : ()
            - 인자가 한개일 때 : (i) or i
            - 인자가 여러개일 떄 : (i, j, k)
            - 인자의 타입은 컴파일러가 추론할 수 있어 생략이 가능하지만 명시할 수 도 있음
            - ex : (Integer i, Integer j)

            바디
            - 화살표 오른쪽에 함수 본문을 정의함
            - 함수 내 정의가 여러줄인 경우에는 {} 를 사용해서 묶어야 한다.
            - 함수 내 정의가 한줄인 경우
                - {} 생략가능
                - return도 생략 가능

         */

        Supplier<Integer> get10 = () -> 10;

        // 타입이 제네릭으로 추론이 가능하기 때문에 인자에 생략 가능
        // 한줄일 경우 return도 생략 가능
        BinaryOperator<Integer> sum = (a, b) -> a + b;

        LambdaExam lambdaExam = new LambdaExam();
        lambdaExam.run();


    }

    /*
        [로컬 클래스, 익명 클래스, 람다]

        공통점 : 클래스 외부의 final변수를 참조 할 수 있다.
                사실상 final (effective final)도 가능 -> 선언부 제외 변경하는 곳이 없을경우 final 생략가능

        차이점 : 로컬 클래스와 익명 클래스는 변수 섀도잉이 가능하다. (감싸고있는 영역과 내부는 다른 스콥이기 때문)
                람다는 람다를 감싸고있는 영역과 스콥이 동일하여 변수의 섀도윙이 불가능하다.

       섀도윙 : 감싸고 있는 영역(클래스 외부)에 선언된 변수와 동일한 변수명을 클래스 내부에 선언할 경우 외부 변수가 가려진다.
    * */
    private void run() {
        int baseNumber = 10;
        // 로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                System.out.println(baseNumber);
            }
        }

        // 익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        // 람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }

}
