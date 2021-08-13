package com.javaLearning;

public class CopyConstructor {
    int id;
    String name;
    CopyConstructor(int i,String n){
        id = i;
        name = n;
    }
    CopyConstructor(CopyConstructor s){
        id = s.id;
        name =s.name;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        CopyConstructor p1 = new CopyConstructor(123,"gj");
        CopyConstructor p2 = new CopyConstructor(p1);
        p1.display();
        p2.display();
    }
}
