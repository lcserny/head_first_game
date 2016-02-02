package com.guis;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 01.02.2016.
 */
public class PanelOne
{
    public static void main(String[] args)
    {
        PanelOne panel = new PanelOne();
        panel.go();
    }

    public void go()
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        panel.add(buttonTwo);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
