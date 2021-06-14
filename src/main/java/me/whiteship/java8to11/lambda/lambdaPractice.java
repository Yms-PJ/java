package me.whiteship.java8to11.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

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

    public void practice2 () {
        // 4. 스태틱 매소드를 ::를 이용하여 가져올수 있다. 위아래 동일
        UnaryOperator<String> hi = (s) -> "hi " + s;
        UnaryOperator<String> hi2 = Greeting::hi;
        // 아래는 스태틱 매소드가 아니라서 에러 발생
//        UnaryOperator<String> hi3 = Greeting::hello;
        //인스턴스 매소드를 사용하기 위해서는 다음과 같이 생성
        //인스턴스 생성이 반드시 필요
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        hello.apply("스태틱 메소드 호출");

        // 5. 생성자 호출
        // 입력값은 없는데 출력값은 있는, 단 이 자체로는 아무 의미가 없다.
        Supplier<Greeting> greeting2 = Greeting::new;
        // get을 해줘야됨
        greeting2.get();
        greeting2.get().hello("생성자 호출");

        // 6. 인수가 존재하는 생성자 호출
        // String을 받는 생성자
        Function<String, Greeting> yangGreeting = Greeting::new;
        yangGreeting.apply("문자를 받는 생성자 참조");
        // Integer를 받는 생성자
        Function<Integer, Greeting> yangAge = Greeting::new;
        yangAge.apply(31);

        // 7. 인스턴스의 특정 인스턴스를 참조하는 방법
        String[] names = {"yang", "kim", "okamura"};
        // Array라는 함수에있는 sort()는 배열을 정렬, 복제, 리스트 변환등의 작업을 쉽게 처리 가능
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

    }
}
