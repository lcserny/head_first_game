package com.guis;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 29.01.2016.
 */
public class MyDrawPanel extends JPanel
{
    public void paintComponent(Graphics graphics)
    {
        graphics.setColor(Color.orange);
        graphics.fillRect(20, 50, 100, 100);
    }

    public static void main(String[] args)
    {
        MyDrawPanel panel = new MyDrawPanel();
        JFrame frame = new JFrame();

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300, 300);
    }
}
