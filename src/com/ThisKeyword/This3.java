package com.ThisKeyword;
class A3{
    A3(){System.out.println("hello from a3");}
    A3(int x){
        this();
        System.out.println(x);
    }
}
public class This3 {
    public static void main(String[] args) {
        A3 a = new A3(20);
    }
}
