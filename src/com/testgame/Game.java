package com.testgame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

/**
 * Created by user on 18.01.2016.
 */
@SuppressWarnings("serial")
public class Game extends JPanel
{
    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillOval(0, 0, 30, 30);
        g2d.drawOval(0, 50, 30, 30);
        g2d.fillRect(50, 0, 30, 30);
        g2d.drawRect(50, 50, 30, 30);

        g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Plain title");
        frame.add(new Game());
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
