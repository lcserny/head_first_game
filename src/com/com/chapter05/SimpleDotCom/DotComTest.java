package com.com.chapter05.SimpleDotCom;

/**
 * Created by user on 19.01.2016.
 */
public class DotComTest
{
    /*
    1. Instantiate a DotCom object.
    2. Assign it a location (an array of 3 ints, like {2,3,4}).
    3. Create a String to represent a user guess (“2”, “0”, etc.).
    4. Invoke the checkYourself() method passing it the fake user guess.
    5. Print out the result to see if it’s correct (“passed” or “failed”).
     */

    public static void main(String[] args)
    {
        DotCom dot = new DotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";

        if (result.equals("hit") || result.equals("kill")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
