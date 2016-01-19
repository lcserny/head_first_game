package com.chapter01;

/**
 * Created by user on 19.01.2016.
 */
public class BeerSong
{
    protected static String getBottleWord(int num)
    {
        String word = "bottles";
        if (num == 1) {
            word = "bottle";
        }
        return word;
    }

    public static void main(String[] args)
    {
        int beerNum = 99;
        while (beerNum > 0) {
            String word = getBottleWord(beerNum);

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");

            beerNum--;
            if (beerNum > 0) {
                word = getBottleWord(beerNum);
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }

            System.out.println();
        }
    }
}
