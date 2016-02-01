package com.MusicMachine;

import javax.sound.midi.*;

/**
 * Created by user on 01.02.2016.
 */
public class MiniMusicPlayerOne
{
    public static void main(String[] args)
    {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for (int i = 5; i < 61; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int cond, int chan, int one, int two, int tick)
    {
        MidiEvent event = null;
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(cond, chan, one, two);
            event = new MidiEvent(message, tick);
        } catch (Exception ex) { }
        return event;
    }
}
