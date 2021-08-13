package com.javaLearning;
abstract class AbsClass //abstract class
{
    abstract void display();
}

public class AbstractMethod  extends  AbsClass{
    @Override
    void display() {
        System.out.println("Gaurav Jaiswal");
    }

    public static void main(String[] args) {
        AbsClass ab = new AbstractMethod();
        ab.display();
    }
}
