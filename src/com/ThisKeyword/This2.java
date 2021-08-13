package com.ThisKeyword;
class A{
    void m(){System.out.println("hello from m");}
    void n(){
        System.out.println("hello from n");

        this.m();
    }
}
public class This2 {
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}
