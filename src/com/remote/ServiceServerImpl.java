package com.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

/**
 * Created by user on 10.02.2016.
 */
public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer
{
    HashMap serviceList;

    public ServiceServerImpl() throws RemoteException
    {
        setupServices();
    }

    private void setupServices()
    {
        serviceList = new HashMap();
        serviceList.put("Dice Rolling Service", new DiceService());
        serviceList.put("Day of the Week Service Service", new DayOfTheWeekService());
        serviceList.put("Visual Music Service", new VisualMusicService());
    }

    public Object[] getServiceList()
    {
        System.out.println("in remote");
        return serviceList.keySet().toArray();
    }

    public Service getService(Object serviceKey) throws RemoteException
    {
        Service theService = (Service) serviceList.get(serviceKey);
        return theService;
    }

    public static void main(String[] args)
    {
        try {
            Naming.rebind("ServiceServer", new ServiceServerImpl());
        } catch (Exception ex) { ex.printStackTrace(); }

        System.out.println("Remote service is running");
    }
}
