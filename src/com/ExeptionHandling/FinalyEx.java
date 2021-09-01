package com.ExeptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinalyEx
{
    public static void main(String[] args) throws IOException
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
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fr != null)
                fr.close();
            if( br != null)
                br.close();

        }
    }
}