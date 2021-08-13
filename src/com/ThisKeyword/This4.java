package com.ThisKeyword;

public class This4 {
    void m(This4 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        This4 s1 = new This4();
        s1.p();
    }
}
