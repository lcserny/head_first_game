package com.com.chapter05.sink_dot_com.simple;

/**
 * Created by user on 20.01.2016.
 */
public class SimpleDotComGameTest
{
    public static void main(String[] args)
    {
        SimpleDotComGame game = new SimpleDotComGame();
        try {
            game.main(args);
        } catch (Exception e) {
            // don't know how to test this
            System.out.println(e.getMessage());
        }
    }
}
