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
        GradientPaint gradientPaint = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);

        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(70, 70, 100, 100);

        graphics.setColor(Color.orange);
        graphics.fillRect(130, 130, 100, 100);
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
