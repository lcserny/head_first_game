package com.sorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * Created by user on 08.02.2016.
 */
public class JukeBox2
{
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args)
    {
        new JukeBox2().go();
    }

    public void go()
    {
        getSongs();

        Collections.sort(songList);
        System.out.println(songList);

        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    void getSongs()
    {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    void addSong(String lineToParse)
    {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);

        songList.add(nextSong);
    }

    class ArtistCompare implements Comparator<Song>
    {
        public int compare(Song one, Song two)
        {
            return one.getArtist().compareTo(two.getArtist());
        }
    }
}
