package com.ExeptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowFile
{
    public static void main(String[] args) throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\JIP\\test.txt")))
        {
            String text;
            while ((text = br.readLine()) != null)
                System.out.println(text);
        } catch (FileNotFoundException fe)
        {
            throw new FileNotFoundException("File not present");
        } catch (IOException ie)
        {
            System.out.println("IOException has occured");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
