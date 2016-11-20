package com.mycompany.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Edmundo on 17/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        Chain chain = new Chain();
        while (true)
        {
            System.out.print("Press ");
            get_line();
            chain.use();
        }
    }

    static String get_line()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in))
                ;
        String line = null;
        try
        {
            line = in.readLine();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return line;
    }
}