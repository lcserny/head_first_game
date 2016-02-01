package com.MusicMachine;

import javax.sound.midi.*;

/**
 * Created by user on 01.02.2016.
 */
public class MiniMusicPlayerTwo implements ControllerEventListener
{
    public static void main(String[] args)
    {
        MiniMusicPlayerTwo musicPlayerTwo = new MiniMusicPlayerTwo();
        musicPlayerTwo.go();
    }

    public void go()
    {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);

            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();

            for (int i = 5; i < 61; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
            }

            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void controlChange(ShortMessage message)
    {
        System.out.println("1a");
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
