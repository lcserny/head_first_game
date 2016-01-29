package com.guis;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by user on 29.01.2016.
 */
public class SimpleGuiOne implements ActionListener
{
    JButton button;
    static final String defaultButtonText = "click me";

    public static void main(String[] args)
    {
        SimpleGuiOne guiOne = new SimpleGuiOne();
        guiOne.go();
    }

    public void go()
    {
        JFrame frame = new JFrame();
        button = new JButton(defaultButtonText);
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        if (button.getText().equals(defaultButtonText)) {
            button.setText("I've been clicked");
        } else {
            button.setText(defaultButtonText);
        }
    }
}
