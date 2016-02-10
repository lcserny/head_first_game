package com.remote;

import java.rmi.Naming;

/**
 * Created by user on 10.02.2016.
 */
public class MyRemoteClient
{
    /**
     * Step 2
     * Build me second and run!
     * @param args
     */
    public static void main(String[] args)
    {
        new MyRemoteClient().go();
    }

    public void go()
    {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote_Hello");
            String hello = service.sayHello();

            System.out.println(hello);
        } catch (Exception ex) { ex.printStackTrace(); }
    }
}
