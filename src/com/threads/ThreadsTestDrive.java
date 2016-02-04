package com.threads;

/**
 * Created by user on 04.02.2016.
 */
public class ThreadsTestDrive
{
    public static void main(String[] args)
    {
        Runnable job = new MyRunnable();
        Thread worker = new Thread(job);
        worker.start();
        System.out.println("back to main I go");
    }
}
