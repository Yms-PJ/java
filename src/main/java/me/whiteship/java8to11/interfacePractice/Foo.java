package me.whiteship.java8to11.interfacePractice;

public interface Foo {
    void printName();

    // default 매서드
    /**
     * @implSpec 이 구현체는 getName()으로 가져온 문장을 대문자로 출력한다.
     */
    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase());
    }

    static void printAnything(){
        System.out.println("Foo");
    }

    String getName();
}
