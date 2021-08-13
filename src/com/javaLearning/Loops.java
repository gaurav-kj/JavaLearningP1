package com.javaLearning;
import java.util.Scanner;

public class Loops {

    boolean armstrong(int num){
        int t = num;
        int sum = 0;
        do{
            int r = t%10;
            sum += (r*r*r);
            t=t/10;
        }while(t>0);
        return num==sum;
    }

    static void printPyramid(int height){
        for(int i = 1 ; i <= height ; i++){
            for (int j = 1; j <= i; j++) {
                if(j==3){
                    continue;
                }
                System.out.print("*");

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check for armstrong");
        int input = s.nextInt();
        Loops l = new Loops();

        if(l.armstrong(input) == true){
            System.out.println("yes "+ input + " is an Armstrong Number");
        }else{
            System.out.println("No "+ input+ " is not an armsrtong number");
        }

        printPyramid(5);


    }
}
