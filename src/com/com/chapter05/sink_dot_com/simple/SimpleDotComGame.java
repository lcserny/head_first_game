package com.com.chapter05.sink_dot_com.simple;

/**
 * Created by user on 20.01.2016.
 */
public class SimpleDotComGame
{
    /*
    METHOD public static void main (String [] args)
X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X
        DECLARE an int variable to hold the number of user guesses, named numOfGuesses
        DECLARE a new var for a new game obj
        DECLARE an int array to hold 3 consecutive random cells for the correct location in the allowed int limits 0-6
        DECLARE an int array with the guessed values already
        COMPUTE a random number between 0 and 4 that will be the starting location cell position

        WHILE the dot com is still alive :
            GET user input from the command line
            DECLARE a string result that holds by default "miss"
            INCREMENT the num of guesses

            CHECK if the user guess is a hit and it isn't in the int array with the guessed values

            IF it is then
                ADD the guess in the int array with the correct guessed values
                CHANGE the result string to "hit"
            END IF

            IF the int array that holds the correct values length is equal to the int array with the int array length with the random consecutive cells
                CHANGE the result string to "kill"
                GAME is won
                BREAK
            END IF
        END WHILE

        DISPLAY the winning statement
        DISPLAY the number of guesses it took to sink the DotCom
X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X-X

        DECLARE an int variable to hold the number of user guesses, named numOfGuesses, set it to 0.
        MAKE a new SimpleDotCom instance
        COMPUTE a random number between 0 and 4 that will be the starting location cell position
        MAKE an int array with 3 ints using the randomly-generated number, that number incremented by 1,
        and that number incremented by 2 (example: 3,4,5)
        INVOKE the setLocationCells() method on the SimpleDotCom instance
        DECLARE a boolean variable representing the state of the game, named isAlive. SET it to true

        WHILE the dot com is still alive (isAlive == true) :
            GET user input from the command line
            // CHECK the user guess
            INVOKE the checkYourself() method on the SimpleDotCom instance
            INCREMENT numOfGuesses variable
            // CHECK for dot com death
            IF result is “kill”
                SET isAlive to false (which means we won’t enter the loop again)
                PRINT the number of user guesses
            END IF
        END WHILE

    END METHOD
     */

    public static void main(String[] args) throws Exception
    {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom dotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        dotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Enter a number");
            String result = dotCom.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
