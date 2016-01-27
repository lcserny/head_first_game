package com.DotCom;

import java.util.ArrayList;

/**
 * Created by user on 20.01.2016.
 */
public class DotComBust
{
    /*
    DECLARE and instantiate the GameHelper instance variable, named helper.
    DECLARE and instantiate an ArrayList to hold the list of DotComs (initially three) Call it dotComsList.
    DECLARE an int variable to hold the number of user guesses (so that we can give the user a
    score at the end of the game). Name it numOfGuesses and set it to 0.

    DECLARE a setUpGame() method to create and initialize the DotCom objects with names
    and locations. Display brief instructions to the user

    METHOD: void setUpGame()
        // make three DotCom objects and name them
        CREATE three DotCom objects.
        SET a name for each DotCom.
        ADD the DotComs to the dotComsList ( the ArrayList).
        REPEAT with each of the DotCom objects in the dotComsList array
            CALL the placeDotCom() method on the helper object, to get a randomly-selected
            location for this DotCom (three cells, vertically or horizontally aligned, on a 7 X 7 grid).
            SET the location for each DotCom based on the result of the placeDotCom() call.
        END REPEAT
    END METHOD


    DECLARE a startPlaying() method that asks the player for guesses and calls the
    checkUserGuess() method until all the DotCom objects are removed from play.

    METHOD: void startPlaying()
        REPEAT while any DotComs exist
            GET user input by calling the helper getUserInput() method
            EVALUATE the user’s guess by checkUserGuess() method
        END REPEAT
    END METHOD


    DECLARE a checkUserGuess() method that loops through all remaining DotCom objects and
    calls each DotCom object’s checkYourself() method.

    METHOD: void checkUserGuess(String userGuess)
        // find out if there’s a hit (and kill) on any DotCom
        INCREMENT the number of user guesses in the numOfGuesses variable
        SET the local result variable (a String) to “miss”, assuming that the user’s guess will be a miss.
        REPEAT with each of the DotObjects in the dotComsList array
            EVALUATE the user’s guess by calling the DotCom object’s checkYourself() method
            SET the result variable to “hit” or “kill” if appropriate
            IF the result is “kill”, REMOVE the DotCom from the dotComsList
        END REPEAT
        DISPLAY the result value to the user
    END METHOD


    DECLARE a finishGame() method that prints a message about the user’s performance, based
    on how many guesses it took to sink all of the DotCom objects.

    METHOD: void finishGame()
    DISPLAY a generic “game over” message, then:
        IF number of user guesses is small,
            DISPLAY a congratulations message
        ELSE
            DISPLAY an insulting one
        END IF
    END METHOD
     */

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame()
    {
        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotCom : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom();
            dotCom.setLocationCells(newLocation);
        }
    }

    private void startPlaying()
    {
        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String guess)
    {
        numOfGuesses++;
        String result = "miss";

        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(guess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(result);
    }

    private void finishGame()
    {
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args) throws Exception
    {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
