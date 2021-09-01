package com.JavaCollectionFramework.PriorityQueue;

import java.util.*;
class PQExample1{
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();


        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}