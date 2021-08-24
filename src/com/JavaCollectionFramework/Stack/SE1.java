package com.JavaCollectionFramework.Stack;

import java.util.Iterator;
import java.util.Stack;

public class SE1 {
    public static void main(String[] args)
    {
        Stack<String> stk= new Stack<>();
        stk.push("Apple");
        stk.push("Grapes");
        stk.push("Mango");
        stk.push("Orange");

        System.out.println("Stack: " + stk);
        String fruits = stk.peek();
        System.out.println("Element at top: " + fruits);

        int location = stk.search("Apple");
        System.out.println("Location of Apple: " + location);
        stk.pop();
        stk.forEach(n ->
        {
            System.out.println(n);
        });

        //iteration over the stack
        Iterator iterator = stk.iterator();
        while(iterator.hasNext())
        {
            Object values = iterator.next();
            System.out.println(values);
        }


        boolean rslt = stk.empty();
        System.out.println("Is the stack empty or not? " +rslt);
        int x=stk.size();
        System.out.println("The stack size is: "+x);
    }
}
