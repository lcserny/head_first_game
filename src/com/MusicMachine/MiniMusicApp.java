package com.MusicMachine;

import javax.sound.midi.*;

/**
 * Created by user on 29.01.2016.
 */
public class MiniMusicApp
{
    public static void main(String[] args)
    {
        MiniMusicApp miniMusicApp = new MiniMusicApp();
        miniMusicApp.play();
    }

    public void play()
    {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = player.getSequence();
            Track track = seq.createTrack();

            ShortMessage firstShort = new ShortMessage();
            firstShort.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(firstShort, 1);
            track.add(noteOn);

            ShortMessage secondShort = new ShortMessage();
            secondShort.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(secondShort, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
