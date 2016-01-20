package com.com.chapter05.SimpleDotCom;

import java.io.*;

/**
 * Created by user on 20.01.2016.
 */
public class GameHelper
{
    public String getUserInput(String prompt)
    {
        String inputLine = null;
        System.out.print(prompt + " ");

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOExcetion: " + e);
        }

        return inputLine;
    }
}
