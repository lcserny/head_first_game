package com.networking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by user on 03.02.2016.
 */
public class SimpleChatClientA
{
    JTextField outgoing;
    PrintWriter writer;
    Socket socket;

    public static void main(String[] args)
    {
        new SimpleChatClientA().go();
    }

    public void go()
    {
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");

        setupNetworking();

        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    private void setupNetworking()
    {
        try {
            socket = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) { ex.printStackTrace(); }

            outgoing.setText("");
            outgoing.requestFocus();
        }
    }
}
