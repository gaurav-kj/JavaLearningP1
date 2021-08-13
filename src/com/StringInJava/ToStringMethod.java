package com.StringInJava;

public class ToStringMethod {


    String firstName;
    String lastName;

    ToStringMethod( String firstName, String lastName){

        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String toString(){
        return firstName+" "+lastName;
    }
    public static void main(String args[]){
        ToStringMethod p1=new ToStringMethod("Gaurav","Jaiswal");
        ToStringMethod p2=new ToStringMethod("Jon ","Doe");

        System.out.println(p1);//compiler writes here s1.toString()
        System.out.println(p2);//compiler writes here s2.toString()
    }
}
