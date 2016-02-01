package com.guis;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 01.02.2016.
 */
public class SimpleAnimation
{
    int x = 70;
    int y = 70;

    public static void main(String[] args)
    {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;

            drawPanel.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) { }
        }
    }

    class MyDrawPanel extends JPanel
    {
        public void paintComponent(Graphics graphics)
        {
            graphics.setColor(Color.white);
            graphics.fillRect(0, 0, this.getWidth(), this.getHeight());

            graphics.setColor(Color.green);
            graphics.fillOval(x, y, 40, 40);
        }
    }
}
