package com.JavaCollectionFramework.ArrayDeque;

import java.util.*;
public class ADQExample1 {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("todo1");
        deque.add("todo2");
        deque.add("todo3");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
