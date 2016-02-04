package com.threads;

/**
 * Created by user on 04.02.2016.
 */
public class MyRunnable implements Runnable
{
    public void run()
    {
        go();
    }

    public void go()
    {
        doSomething();
    }

    public void doSomething()
    {
        System.out.println("top o' the stack");
    }
}
