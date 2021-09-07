package com.lamdafunctions;
interface SingleGreeting{
    public String greet(String s);
}
public class SingleParameter {
    public static void main(String[] args) {
        SingleGreeting g = s->s+" extraa ";
        System.out.println(g.greet("hello from single parameter"));
    }
}
