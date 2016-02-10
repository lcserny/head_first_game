package com.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by user on 10.02.2016.
 */
public interface MyRemote extends Remote
{
    public String sayHello() throws RemoteException;
}
