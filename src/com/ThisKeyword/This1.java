package com.ThisKeyword;

public class This1 {
    private  String firstName,lastName;
    This1(String firstName, String lastName){
        firstName = firstName;
        lastName = lastName;
    }

    void display(){
        System.out.println(firstName+" "+lastName);
    }

    public static void main(String[] args) {
        This1 p = new This1("Gaurav", "jaiswal");
        p.display();
    }
}
