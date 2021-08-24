package com.JavaCollectionFramework.ArrayList;

import java.util.*;
class ArrayList8 {

    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("p1");
        al.add("p2");
        al.add("p3");
        al.add("p4");
        al.add("p5");
        System.out.println("An initial list of elements: "+al);
        al.remove("p5");
        System.out.println("After invoking remove(object) method: "+al);
        al.remove(0);
        System.out.println("After invoking remove(index) method: "+al);

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("p7");
        al2.add("p8");
        al.addAll(al2);
        System.out.println("Updated list : "+al);
        al.removeAll(al2);
        System.out.println("After invoking removeAll() method: "+al);
        al.removeIf(str -> str.contains("p4"));   //Here using Lambda expression
        System.out.println("After invoking removeIf() method: "+al);
        al.clear();
        System.out.println("After invoking clear() method: "+al);
    }
}