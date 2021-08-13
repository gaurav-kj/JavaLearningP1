package com.javaLearning;
class GrandParent {
    void gmethod(){
        System.out.println(" inside grand parent");
    }
}
class ParentInherit1 extends GrandParent{
    void parentMethod(){
        System.out.println("inside parent method");
    }
}
class Childinherit1 extends ParentInherit1{
    void childMethod(){
        System.out.println(" inside child ");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Childinherit1 c = new Childinherit1();
        c.gmethod();
        c.parentMethod();
        c.childMethod();
    }
}
