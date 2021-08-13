package com.javaLearning;

public class StaticCounter {

    static int count=0;

    StaticCounter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args){
//creating objects
        StaticCounter c1=new StaticCounter();
        StaticCounter c2=new StaticCounter();
        StaticCounter c3=new StaticCounter();
    }
}
