package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by user on 03.02.2016.
 */
public class DailyAdviceClient
{
    public static void main(String[] args)
    {
        DailyAdviceClient adviceClient = new DailyAdviceClient();
        adviceClient.go();
    }

    public void go()
    {
        try {
            Socket socket = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Today you should " + advice);

            reader.close();
        } catch (IOException ex) { ex.printStackTrace(); }
    }
}
