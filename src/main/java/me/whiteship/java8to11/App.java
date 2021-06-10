package me.whiteship.java8to11;

import me.whiteship.java8to11.function.BiFunctionAndConsumerAndSupplier;
import me.whiteship.java8to11.function.Java8Function;
import me.whiteship.java8to11.function.PredicateAndUnaryOperatorAndBinaryOperator;

public class App {

    public static void main(String[] args) {
        // Function<인수, 결과값>
        Java8Function test1 = new Java8Function();
        // 결과: 20
        test1.plus(10);
        // 결과: 30
        test1.compose(10);
        // 결과: 40
        test1.andThen(10);

        // BiFunction<인수, 인수2, 결과값>
        BiFunctionAndConsumerAndSupplier test2 = new BiFunctionAndConsumerAndSupplier();
        // 결과: 80kg이 되었다.
        test2.BiFunction(80, "kg이 되었다.");

        // Consumer<인수>
        test2.Consumer("다이어트해야지");

        // Supplier<결과>
        // 결과 : supplier는 결과만 있어
        test2.Supplier();

        // Predicate<인수>
        // 결과 : 성은 양씨, 나이는 32
        PredicateAndUnaryOperatorAndBinaryOperator test3 = new PredicateAndUnaryOperatorAndBinaryOperator();
        test3.predicate("양민수", 32);

        // UnaryOperator<인자>
        // 결과 : 졸리다. 자러가야지
        test3.unaryOperator("졸리다. ");

        // BinaryOperator<인자>
        // 결과 : 1더하기 2는 3
        test3.binaryOperator(1,2);
    }




}
