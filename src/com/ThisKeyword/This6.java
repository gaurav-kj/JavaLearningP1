package com.ThisKeyword;
class A6{
    A6 getA(){
        return this;
    }
    void msg(){System.out.println("Hello java");}
}
public class This6 {
    public static void main(String[] args) {
        new A6().getA().msg();
    }
}
