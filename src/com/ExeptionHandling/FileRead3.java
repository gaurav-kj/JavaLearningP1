package com.ExeptionHandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead3
{
    public static void main(String[] args)
    {
        BufferedReader br = null;
        FileReader fr = null;
        try
        {
            fr = new FileReader("C:\\JIP\\test.txt");
            br = new BufferedReader(fr);

            System.out.println(1/0);

            String text;
            while ((text = br.readLine()) != null)
                System.out.println(text);
        } catch (IOException | ArithmeticException e )
        {
            e.printStackTrace();
        }
    }
}