package me.whiteship.java8to11.interfacePractice;

public class InterfaceMethod {
     public static void main(String[] args) {
          // 자바8의 interface추가기능
          // 1. default변수가 지정 가능해짐, 예전의 인터페이스는 상태를 가질수 없었으나
          // default의 선언으로 사용 가능해짐
          Foo foo = new DefaultFoo("yang");
          foo.printName();
          // foo의 default변수, DefaultFoo에서 오버라이딩을 하지 않아도 호출이 된다.
          // 물론 오버라이딩도 가능
          foo.printNameUpperCase();
          // static메서드도 사용 가능해짐
          Foo.printAnything();
     }
}
