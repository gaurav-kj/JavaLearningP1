package com.ExeptionHandling;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead2
{
    public static void main(String[] args)
    {
        BufferedReader br = null;
        FileReader fr = null;
        try
        {
            fr = new FileReader("C:\\JIP\\test.txt");
            br = new BufferedReader(fr);

            String text;
            while ((text = br.readLine()) != null)
                System.out.println(text);
        } catch (FileNotFoundException fe)
        {
            fe.printStackTrace();
        } catch (IOException ie)
        {
            System.out.println("IOException has occured");
        }
    }
}
