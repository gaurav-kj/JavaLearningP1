package com.JavaCollectionFramework.ArrayList;

import java.util.*;
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class ArrayList9 {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<Book>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        list.add(b1);
        list.add(b2);
        list.add(b3);


        List<Book> list2 = Arrays.asList(
                new Book(101,"Let us C","Yashwant Kanetkar","BPB",8),
                new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4),
                new Book(103,"Operating System","Galvin","Wiley",6)
        );
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

        for(Book c :list2){
            System.out.println(c.id+" "+c.name+" "+c.author+" "+c.publisher+" "+c.quantity);
        }
    }
}
