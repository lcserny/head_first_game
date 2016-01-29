package com.guis;

import javax.swing.*;

/**
 * Created by user on 29.01.2016.
 */
public class SimpleGuiOne
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
