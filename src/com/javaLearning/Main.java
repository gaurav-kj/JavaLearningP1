package com.javaLearning;

public class Main {

    public static void main(String[] args) {
        //TODO add a Loop here
        // - for loop
        // - while loop
        // - do while loop
        // - foreach loop

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i+1;
        }

        for (int x :
                arr) {
            System.out.print(x);
        }

        inheritance in = new inheritance();
        in.inherit();


       // System.out.println("Hello world !");
    }
}
