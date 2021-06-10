package me.whiteship.java8to11.function;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BiFunctionAndConsumerAndSupplier {

    // BiFunction<인수1, 인수2, 결과값>
    // 인수를 2개 가지는 Function
    public void BiFunction(Integer integer, String string) {
        BiFunction<Integer, String, String> intStr = (i, j) -> i + j;
        System.out.println(intStr.apply(integer, string));
    }

    // Consumer<인수>
    // 인수만 존재하는 void, 결과를 반환하지 않음
    // .accept는 실행
    public void Consumer(String str) {
        Consumer<String> consumer = (i) -> System.out.println(i);
        consumer.accept(str);
    }

    // Supplier<결과값>
    // 인수가 없고 결과만
    public void Supplier() {
        Supplier<String> sup = () -> "Supplier는 결과만 있어.";
        System.out.println(sup.get());
    }

}
