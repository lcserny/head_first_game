package com.threads;

/**
 * Created by user on 04.02.2016.
 */
public class RunThreads implements Runnable
{
    public static void main(String[] args)
    {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        alpha.setName("Alpha");
        beta.setName("Beta");

        alpha.start();
        beta.start();
    }

    public void run()
    {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is currently running");
        }
    }
}
