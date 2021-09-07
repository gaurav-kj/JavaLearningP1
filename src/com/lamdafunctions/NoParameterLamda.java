package com.lamdafunctions;

interface Greeting{
    public String greet();
}
public class NoParameterLamda{
    public static void main(String[] args) {
        Greeting s=()->{
            return "Hello i have no parameters";
        };
        System.out.println(s.greet());
    }
}