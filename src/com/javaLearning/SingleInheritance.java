package com.javaLearning;
class ParentInherit {
    void parentMethod(){
        System.out.println("inside parent method");
    }
}
class Childinherit extends ParentInherit{
    void childMethod(){
        System.out.println(" inside child ");
    }
}
public class SingleInheritance {

    public static void main(String[] args) {
        Childinherit c = new Childinherit();
        c.parentMethod();
        c.childMethod();
    }
}
