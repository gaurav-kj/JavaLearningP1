package com.Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    private static void performCondinally (List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
    public static void main(String[] args) {
        List<Person> people =  Arrays.asList(
                new Person("Gaurav","jaiswal",22),
                new Person("Ravi","bhushan",24)
        );


        //Todo Sort list by last name
        Collections.sort(people,(p1,p2)->p1.getLastname().compareTo(p2.getLastname()));


        //Todo create a method that prints all element in the list
       performCondinally(people,p->true,(p)-> System.out.println(p));


        //todo creaate a method thst print all people that have lastname begin with j
        performCondinally(people,p->p.getLastname().startsWith("j"),p-> System.out.println(p));

        //todo creaate a method thst print all people that have lastname begin with j
        performCondinally(people,p->p.getLastname().startsWith("j"),p-> System.out.println(p.getFirstName()));

    }
}
