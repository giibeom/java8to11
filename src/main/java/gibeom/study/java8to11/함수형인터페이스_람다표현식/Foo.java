package gibeom.study.java8to11.함수형인터페이스_람다표현식;

public class Foo {

    public static void main(String[] args) {

        final int baseNumber = 10;

        // 익명 내부 클래스 -> anonymous inner class
        // 람다로 선언 시 코드가 두줄 이상일 시에는 {} 로 묶어줘야 한다.
        // 함수형 메소드이지만 자바는 객체지향이기 때문에 "함수 자체를" 변수에 할당, 메소드 파라미터로 전달, 리턴도 모두 가능
        RunSometing runSometing = number -> number + baseNumber; // 함수 밖의 변수값을 참조해서 사용하는 경우 순수함수라고 보기 어렵다.


        /*
        순수 함수 : 입력받은 값이 동일한 경우, 결과는 항상 같아야한다.
        결과가 항상 같은 상황이 보장이 되지 않는다면 함수형 프로그래밍이라고 보기 어렵다.
        * */
        System.out.println(runSometing.doIt(1));
        System.out.println(runSometing.doIt(1));
        System.out.println(runSometing.doIt(1));
        System.out.println(runSometing.doIt(1));

        System.out.println(runSometing.doIt(2));
        System.out.println(runSometing.doIt(2));
        System.out.println(runSometing.doIt(2));

    }
}
