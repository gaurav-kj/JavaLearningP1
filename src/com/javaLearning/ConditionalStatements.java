package com.javaLearning;

public class ConditionalStatements {
    public static void main(String[] args) {
        if (true){
            System.out.println("this will called always");
        }else{
            System.out.println("this will never get called");
        }

        int val = 4;

        switch (val){
            case 1:
                System.out.println(" 1 ");
                break;
            case 2:
                System.out.println(" 2 ");
                break;
            case 3:
                System.out.println(" 3 ");
                break;
            case 4:
                System.out.println(" 4 ");
                break;
            default:
                System.out.println(" default value here");
                break;
        }
    }
}
