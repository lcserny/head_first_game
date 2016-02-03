package com.networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by user on 03.02.2016.
 */
public class DailyAdviceServer
{
    String[] advices = {
        "Take smaller bytes", "Go for the tight jeans. No they do not make you look fat", "One word: inappropriate",
        "Just for today, be honest. Tell your boss what you *really* think", "You might want to rethink that haircut"
    };

    public static void main(String[] args)
    {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    public void go()
    {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {
                Socket socket = serverSocket.accept();

                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();

                System.out.println(advice);
            }
        } catch (IOException ex) { ex.printStackTrace(); }
    }

    private String getAdvice()
    {
        int ranmdom = (int) (Math.random() * advices.length);
        return advices[ranmdom];
    }
}
