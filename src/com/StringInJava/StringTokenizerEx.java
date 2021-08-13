package com.StringInJava;
import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("hello-i-am-a-developer","-");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
