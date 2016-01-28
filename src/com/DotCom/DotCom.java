package com.DotCom;

import java.util.ArrayList;

/**
 * Created by user on 19.01.2016.
 */
public class DotCom
{
    private ArrayList<String> locationCells;
    private String name;

    public void setName(String someName)
    {
        name = someName;
    }

    public void setLocationCells(ArrayList<String> cells)
    {
        locationCells = cells;
    }

    public String checkYourself(String userGuess)
    {
        String result = "miss";
        int index = locationCells.indexOf(userGuess.toLowerCase());

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sank " + name + " :(");
            } else {
                result = "hit";
            }
        }

        return result;
    }
}
