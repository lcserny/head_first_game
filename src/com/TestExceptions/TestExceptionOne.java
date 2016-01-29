package com.TestExceptions;

/**
 * Created by user on 29.01.2016.
 */
public class TestExceptionOne
{
    public static void main(String[] args)
    {
        String test = "yes";

        try {
            System.out.println("start try");
            doRisky(test);
            System.out.println("end try");
        } catch (Exception ex) {
            System.out.println("exception thrown!");
        } finally {
            System.out.println("finally entered");
        }

        System.out.println("end of main");
    }

    static void doRisky(String test) throws Exception
    {
        System.out.println("Started doRisky");
        if ("yes".equals(test)) {
            throw new Exception();
        }

        System.out.println("Ended doRisky");
        return;
    }
}
