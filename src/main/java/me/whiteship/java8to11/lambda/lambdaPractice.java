package me.whiteship.java8to11.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class lambdaPractice {

    // 람다함수의 특징
    public void practice1 () {
        // 1. 기본적으로 (인수) -> {상태(결과)}로 이루어짐
        Supplier<Integer> test1 = () -> {
            return 10;
        };
        // 단, {}에 넣을 내용이 한줄이면 {}은 생략가능
        Supplier<Integer> test2 = () -> 10;

        // 2. 인자의 값이 두개이상의 경우
        BinaryOperator<Integer> test3 = (i1, i2) -> i1 + i2;

        // 3. 변수캡쳐기능
        // 람다식 밖에 있는 변수를 참조할수 있다.
        int baseNum = 10;
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNum);
        };

    }
}
