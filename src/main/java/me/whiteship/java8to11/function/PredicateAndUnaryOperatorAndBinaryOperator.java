package me.whiteship.java8to11.function;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PredicateAndUnaryOperatorAndBinaryOperator {

    // Predicate<인자>
    // 인자를 받아서 true or false를 리턴
    // (인자) -> 조건
    public void predicate(String string, Integer integer) {
        Predicate<String> str = (s) -> s.startsWith("양");
        Predicate<Integer> inte = (i) -> i == 32;
        if (str.test(string) && inte.test(integer)) {
            System.out.println("성은 양씨, 나이는 32");
        } else {
            System.out.println("제대로 입력해라");
        }
    }

    // UnaryOperator<인자(결과)>
    // 인자와 결과값의 데이터형이 일치할경우 사용 가능, 기본적으론 function<a,b>와 동일하나 반드시 데이터형이 일치해야됨
    public void unaryOperator(String string) {
        UnaryOperator<String> str = (i) -> i + "자러 가야지";
        System.out.println(str.apply(string));
    }

    // BinaryOperator<인자(인자1,2,결과)>
    // 인자1, 인자2, 결과값의 데이터형이 모두 일치할경우 사용가능, 기본적으로 BiFunction<a,b,c>와 동일
    public void binaryOperator(Integer int1, Integer int2) {
        BinaryOperator<Integer> inti = (i1, i2) -> i1 + i2;
        System.out.println(int1 + "더하기 " + int2 + "는 " + inti.apply(int1, int2));
    }
}
