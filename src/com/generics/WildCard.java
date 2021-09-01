package com.generics;

import java.util.*;
abstract class Animal{
    abstract void speak();
}
class Dog extends Animal{
    void speak(){System.out.println("bow wow");}
}
class Cat extends Animal{
    void speak(){System.out.println("meau meauuu");}
}
class WildCard{

    public static void animalSpeak(List<? extends Animal> lists){
        for(Animal s:lists){
            s.speak();
        }
    }
    public static void main(String args[]){
        List<Dog> list1=new ArrayList<Dog>();
        list1.add(new Dog());

        List<Cat> list2=new ArrayList<Cat>();
        list2.add(new Cat());
        list2.add(new Cat());

        animalSpeak(list1);
        animalSpeak(list2);
    }}