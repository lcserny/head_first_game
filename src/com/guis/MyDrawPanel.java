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
        Graphics2D graphics2D = (Graphics2D) graphics;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradientPaint = new GradientPaint(70, 70, startColor, 150, 150, endColor);

        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(70, 70, 100, 100);
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
