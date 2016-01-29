package com.MusicMachine;

import javax.sound.midi.*;

/**
 * Created by user on 29.01.2016.
 */
public class MusicTestOne
{
    public void play()
    {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a Sequencer");
        } catch (MidiUnavailableException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        MusicTestOne test = new MusicTestOne();
        test.play();
    }
}
