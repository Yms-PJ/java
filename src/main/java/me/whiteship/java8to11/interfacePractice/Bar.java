package me.whiteship.java8to11.interfacePractice;

public interface Bar extends Foo{

    /**
     * @implSpec 이 구현체는 getName()으로 가져온 문장을 대문자로 출력한다.
     */
    default void printNameUpperCase(){
        System.out.println("Bar");
    }
}
