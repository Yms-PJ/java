package me.whiteship.java8to11.lambda;

public class Greeting {
    private String name;
    private Integer age;

    public Greeting() {}

    public Greeting(String name) {
        this.name = name;
    }

    public Greeting(Integer age) {
        this.age = age;
    }

    public String hello(String name) {
        return "Hello" + name;
    }

    public static String hi(String name) {
        return "hi " + name;
    }
}
