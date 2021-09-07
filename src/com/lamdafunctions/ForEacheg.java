package com.lamdafunctions;

import java.util.*;
public class ForEacheg{
    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.forEach(
                (n)->System.out.println(n)
        );
    }
}