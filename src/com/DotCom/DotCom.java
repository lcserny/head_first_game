package com.DotCom;

import java.util.ArrayList;

/**
 * Created by user on 19.01.2016.
 */
public class DotCom
{
    /*
    DECLARE an int array to hold the location cells. Call it locationCells.
    DECLARE an int to hold the number of hits. Call it numOfHits and SET it to 0.

    DECLARE a checkYourself() method that takes a String for the user’s guess (“1”, “3”, etc.),
    checks it, and returns a result representing a “hit”, “miss”, or “kill”.
    DECLARE a setLocationCells() setter method that takes an int array (which has the three cell
    locations as ints (2,3,4, etc.).

    METHOD: String checkYourself(String userGuess)
        GET the user guess as a String parameter
        CONVERT the user guess to an int
        REPEAT with each of the location cells in the int array
            // COMPARE the user guess to the location cell
            IF the user guess matches
                INCREMENT the number of hits
                // FIND OUT if it was the last location cell:
                IF number of hits is 3, RETURN “kill” as the result
                ELSE it was not a kill, so RETURN “hit”
                END IF
            ELSE the user guess did not match, so RETURN “miss”
            END IF
        END REPEAT
    END METHOD

    METHOD: void setLocationCells(int[] cellLocations)
        GET the cell locations as an int array parameter
        ASSIGN the cell locations parameter to the cell locations instance variable
    END METHOD
     */

    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> cells)
    {
        locationCells = cells;
    }

    public String checkYourself(String userGuess)
    {
        String result = "miss";
        int index = locationCells.indexOf(userGuess);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        System.out.println(result);
        return result;
    }
}
