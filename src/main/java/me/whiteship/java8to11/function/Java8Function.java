package me.whiteship.java8to11.function;

import java.util.function.Function;

// Function<A,B>
public class Java8Function {

    //    Function<A,B> Foo = (i) -> i + n;
    // .apply는 Function의 결과를 출력하는 함수
    public void plus(Integer integer){
        //    A는 인수, B는 리턴값 / i를 넣었을때 i+n을 반환한다.
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        System.out.println(plus10.apply(integer));
    }
    // compose는 인수로 함수를 받아서, 해당 함수를 먼저 계산 후, 본 함수를 실행
    public void compose(Integer integer){
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiple2 = (i) -> i * 2;

        // 여기서는 *2를 먼저 진행한후 +10을 더한 리턴값
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiple2);
        System.out.println(multiply2AndPlus10.apply(integer));
    }

    // .andThen은 본 함수를 먼저 계산하고 이후에 인수함수를 계산
    public void andThen(Integer integer) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiple2 = (i) -> i * 2;

        // 여기서는 +10을 먼저 진행한후 *2를 진행
        Function<Integer, Integer> plus10Andmultiple2 = plus10.andThen(multiple2);
        System.out.println(plus10Andmultiple2.apply(integer));
    }
}
