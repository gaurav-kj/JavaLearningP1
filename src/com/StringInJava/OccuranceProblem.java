package com.StringInJava;

public class OccuranceProblem {

    public static boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        char[] str = s.toCharArray();
        int occurence = 0;
        for(char ch : str) {
            arr[ch-'a']++;
            occurence = arr[ch-'a'];
        }
        for(int i=0 ;i<26;i++){
            if(arr[i] !=0 && arr[i] != occurence ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean res = areOccurrencesEqual("abaacbc");
        System.out.println(res);
    }
}
