package com.SimpleDotCom;

/**
 * Created by user on 20.01.2016.
 */
public class GameTest
{
    public static void main(String[] args)
    {
        Game game = new Game();
        try {
            game.main(args);
        } catch (Exception e) {
            // don't know how to test this
            System.out.println(e.getMessage());
        }
    }
}
