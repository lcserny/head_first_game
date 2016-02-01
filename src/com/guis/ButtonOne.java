package com.guis;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 01.02.2016.
 */
public class ButtonOne
{
    public static void main(String[] args)
    {
        ButtonOne buttonOne = new ButtonOne();
        buttonOne.go();
    }

    public void go()
    {
        JFrame frame = new JFrame();

//        JButton button = new JButton("click like you mean it");
//        frame.getContentPane().add(BorderLayout.EAST, button);

//        JButton buttonTwo = new JButton("there is no spoon");
//        frame.getContentPane().add(BorderLayout.NORTH, buttonTwo);

//        JButton buttonBig = new JButton("Click This!");
//        Font bigFont = new Font("DejaVu Sans", Font.BOLD, 20);
//        buttonBig.setFont(bigFont);
//        frame.getContentPane().add(BorderLayout.NORTH, buttonBig);

        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton south = new JButton("South");
        JButton north = new JButton("North");
        JButton center = new JButton("Center");

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
