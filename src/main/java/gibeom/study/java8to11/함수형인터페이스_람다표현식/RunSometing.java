package gibeom.study.java8to11.함수형인터페이스_람다표현식;

@FunctionalInterface
public interface RunSometing {

    // abstract 추상메소드 (생략되어있음)
    int doIt(int number);

    // 다른형태의 메소드가 존재해도 추상메소드가 단 1개라면 함수형 인터페이스이다!
    // 따라서 추상메소드가 2개 이상일 시 FunctionalInterface 위반이므로 컴파일 에러 발생
//    void testAddAbstractMethod();

    // java8 부터 interface임에도 불구하고 static 메소드를 정의할 수 있음
    // public 생략 가능
    static void printName() {
        System.out.println("Giibeom");
    }


    default void printAge() {
        System.out.println("26");
    }

}
