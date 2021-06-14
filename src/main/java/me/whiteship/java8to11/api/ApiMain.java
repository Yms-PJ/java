package me.whiteship.java8to11.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class ApiMain {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("yang");
        name.add("kim");
        name.add("park");
        name.add("lee");
        // 자바8 추가기능
        // 1. .forEach();
        // .forEach(); 내부에는 Consumer 인터페이스가 들어온다.
        // Consumer는 입력값은 있으나 출력값은 없음
        name.forEach((s) -> {
            System.out.println(s);
        });
        // 인자가 하나이기에 생략 가능하고, 메소드 레퍼런스를 활용해서 더 간결하게 생략 가능
        // 위아래는 동일
        name.forEach(System.out::println);
        //기본적으로 for를 이용하면 아래와 같다.
        for (String n : name) {
            System.out.println(n);
        }

        // 2. .spliterator();
        // 이 기능은 잘 모르겠다.. 걍 쪼개는 기능이라는데..
        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println)) ;
        System.out.println("==========spliterator========");
        while (spliterator1.tryAdvance(System.out::println)) ;

        // 3. .stream();
        List<String> k = name.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("Y")).collect(Collectors.toList());
        System.out.println("=============stream===============");
        k.forEach(System.out::println);

        // 4. .removeIf();
        // 해당 조건을 제외하는 기능
        name.removeIf(s -> s.startsWith("y"));
        System.out.println("===============removeIf==============");
        name.forEach(s -> System.out.println(s));
    }
}
