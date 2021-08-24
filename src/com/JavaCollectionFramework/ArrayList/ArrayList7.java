package com.JavaCollectionFramework.ArrayList;

import java.util.*;
class ArrayList7{
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        System.out.println("Initial list "+al);
        al.add("p1");
        al.add("p2");
        al.add("p3");
        System.out.println("After invoking add(E e) method: "+al);
        al.add(1, "p4");
        System.out.println("After invoking add(int index, E element) method: "+al);
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("p5");
        al2.add("p6");
        al.addAll(al2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);
        ArrayList<String> al3=new ArrayList<String>();
        al3.add("p7");
        al3.add("p8");
        al.addAll(1, al3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);

    }
}
