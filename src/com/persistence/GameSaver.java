package com.persistence;

import java.io.*;

/**
 * Created by user on 02.02.2016.
 */
public class GameSaver
{
    public static void main(String[] args)
    {
        GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big axe"});
        GameCharacter three = new GameCharacter(120, "Human", new String[] {"spells", "invisibility", "sword"});

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("data"));
            outputStream.writeObject(one);
            outputStream.writeObject(two);
            outputStream.writeObject(three);
            outputStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data"));
            GameCharacter oneRestored = (GameCharacter) inputStream.readObject();
            GameCharacter twoRestored = (GameCharacter) inputStream.readObject();
            GameCharacter threeRestored = (GameCharacter) inputStream.readObject();

            File dataFile = new File("data");
            dataFile.delete();

            System.out.println("One's type: " + oneRestored.getType());
            System.out.println("Two's type: " + twoRestored.getType());
            System.out.println("Three's type: " + threeRestored.getType());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
