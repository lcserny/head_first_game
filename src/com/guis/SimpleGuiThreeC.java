package com.guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by user on 29.01.2016.
 */
public class SimpleGuiThreeC implements ActionListener
{
    JFrame frame;

    public static void main(String[] args)
    {
        SimpleGuiThreeC guiThreeC = new SimpleGuiThreeC();
        guiThreeC.go();
    }

    public void go()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        frame.repaint();
    }
}
