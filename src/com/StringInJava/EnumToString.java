package com.StringInJava;
enum Fruits {
    Orange,
    Apple,
    Banana,
    Mango;
}
public class EnumToString {
    public static void main(String[] args) {
        System.out.println(Fruits.Orange.toString());
        System.out.println(Fruits.Apple.toString());

        System.out.println(Fruits.Banana.toString());

        System.out.println(Fruits.Mango.toString());

    }
}
