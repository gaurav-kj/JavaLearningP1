package com.javaLearning;

interface Writeable
{
    void writes();
}
interface Readable
{
    void reads();

}
public class MultipleInheritance implements Writeable,Readable{
    public void reads()
    {
        System.out.println("I can resd");
    }
    public void writes()
    {
        System.out.println("i can write");
    }

    public static void main(String args[])
    {
        MultipleInheritance s = new MultipleInheritance();
        s.reads();
        s.writes();
    }
}
