package com.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by user on 10.02.2016.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote
{
    public MyRemoteImpl() throws RemoteException
    {

    }

    public String sayHello()
    {
        return "Server says 'Hey!'";
    }

    /**
     * Step 1
     * Build me first, then run (from src: rmic com.remote.MyRemoteImpl)
     * Next run in terminal: rmiregistry
     * @param args
     */
    public static void main(String[] args)
    {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Remote_Hello", service);
        } catch (Exception ex) { ex.printStackTrace(); }
    }
}
