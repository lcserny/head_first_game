package com.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by user on 10.02.2016.
 */
public interface ServiceServer extends Remote
{
    Object[] getServiceList() throws RemoteException;

    Service getService(Object serviceKey) throws RemoteException;
}
