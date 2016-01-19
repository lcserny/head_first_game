package com.com.chapter05.sink_dot_com.simple;

/**
 * Created by user on 19.01.2016.
 */
public class SimpleDotComTestDrive
{
    /*
    1. Instantiate a SimpleDotCom object.
    2. Assign it a location (an array of 3 ints, like {2,3,4}).
    3. Create a String to represent a user guess (“2”, “0”, etc.).
    4. Invoke the checkYourself() method passing it the fake user guess.
    5. Print out the result to see if it’s correct (“passed” or “failed”).
     */

    public static void main(String[] args)
    {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}