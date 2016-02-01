package com.MusicMachine;

import com.guis.MyDrawPanel;
import com.sun.prism.*;

import javax.sound.midi.*;
import java.awt.Graphics;
import java.io.*;
import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 01.02.2016.
 */
public class MiniMusicPlayerThree
{
    static JFrame frame = new JFrame("My first Music Video");
    static MyDrawPanel drawPanel;

    public static void main(String[] args)
    {
        MiniMusicPlayerThree musicPlayer = new MiniMusicPlayerThree();
        musicPlayer.go();
    }

    public void setupGui()
    {
        drawPanel = new MyDrawPanel();
        frame.setContentPane(drawPanel);
        frame.setBounds(30, 30, 300, 300);
        frame.setVisible(true);
    }

    public void go()
    {
        setupGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(drawPanel, new int[] {127});
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 0; i < 60; i+= 4) {
                r = (int) ((Math.random() * 50) + 1);
                track.add(makeEvent(144,1,r,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,r,100,i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.start();
            sequencer.setTempoInBPM(120);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick)
    {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        }catch(Exception e) { }
        return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener
    {
        boolean message = false;

        public void controlChange(ShortMessage event)
        {
            message = true;
            repaint();
        }

        public void paintComponent(Graphics graphics)
        {
            if (!message) {
                return;
            }

            Graphics2D graphics2D = (Graphics2D) graphics;
            int red = (int) (Math.random() * 250);
            int green = (int) (Math.random() * 250);
            int blue = (int) (Math.random() * 250);
            int height = (int) ((Math.random() * 120) + 10);
            int width = (int) ((Math.random() * 120) + 10);
            int x = (int) ((Math.random() * 40) + 10);
            int y = (int) ((Math.random() * 40) + 10);

            graphics2D.setColor(new Color(red, green, blue));
            graphics2D.fillRect(x, y, height, width);

            message = false;
        }
    }
}
