package com.ExeptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead
{
    public static void main(String[] args)
    {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\JIP\\test.txt")))
        {
            String text;
            while ((text = br.readLine()) != null)
                System.out.println(text);
        } catch (IOException ie)
        {
            ie.printStackTrace();
        }
        finally {
            System.out.println("inside finally block");
        }
    }
}