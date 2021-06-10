package me.whiteship.java8to11;

import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        /*
        Java8
        Function<A,B> Foo = (i) -> i + n;
        A는 인수, B는 리턴값 / i를 넣었을때 i+n을 반환한다.
         */
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiple2 = (i) -> i * 2;

        // compose는 인수로 함수를 받아서, 해당 함수를 먼저 계산 후, 본 함수를 실행
        // 여기서는 *2를 먼저 진행한후 +10을 더한 리턴값
        Function<Integer,Integer> multiply2AndPlus10 = plus10.compose(multiple2);
        System.out.println(multiply2AndPlus10.apply(10));


    }

}
