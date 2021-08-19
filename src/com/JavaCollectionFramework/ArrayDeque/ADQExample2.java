package com.JavaCollectionFramework.ArrayDeque;

import java.util.*;
public class ADQExample2 {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("todo1");
        deque.offer("todo2");
        deque.add("todo3");
        deque.offerFirst("todo4");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        //deque.poll();
        //deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
    }
}
