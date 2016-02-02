package com.persistence;

import java.io.Serializable;

/**
 * Created by user on 02.02.2016.
 */
public class GameCharacter implements Serializable
{
    private int power;
    private String type;
    private String[] weapons;

    public GameCharacter(int power, String type, String[] weapons)
    {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower()
    {
        return power;
    }

    public String getType()
    {
        return type;
    }

    public String getWeapons()
    {
        String weaponsString = "";
        for (int i = 0; i < weapons.length; i++) {
            weaponsString += weapons[i] + " ";
        }
        return weaponsString;
    }
}
