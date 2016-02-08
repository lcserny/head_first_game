package com.sorting;

/**
 * Created by user on 08.02.2016.
 */
public class Song implements Comparable<Song>
{
    String title;
    String artist;
    String rating;
    String bpm;

    public Song(String title, String artist, String rating, String bpm)
    {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    public boolean equals(Object obj)
    {
        Song song = (Song) obj;
        return getTitle().equals(song.getTitle());
    }

    public int hashCode()
    {
        return title.hashCode();
    }

    public int compareTo(Song song)
    {
        return title.compareTo(song.getTitle());
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getRating()
    {
        return rating;
    }

    public String getBpm()
    {
        return bpm;
    }

    public String toString()
    {
        return title;
    }
}
