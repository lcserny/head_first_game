package com.persistence;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by user on 02.02.2016.
 */
public class Box implements Serializable
{
    private int width;
    private int height;

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public static void main(String[] args)
    {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(20);

        try {
            FileOutputStream outputStream = new FileOutputStream("data");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(myBox);
            objectOutputStream.close();
        } catch (Exception ex) { ex.printStackTrace(); }
    }
}
