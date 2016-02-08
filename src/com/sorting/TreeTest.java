package com.sorting;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by user on 08.02.2016.
 */
public class TreeTest
{
    public static void main(String[] args)
    {
        new TreeTest().go();
    }

    public void go()
    {
        Book bookOne = new Book("How Cats Work");
        Book bookTwo = new Book("Remix Your Body");
        Book bookThree = new Book("Finding Emo");

        TreeSet<Book> booksSet = new TreeSet<Book>();
        booksSet.add(bookOne);
        booksSet.add(bookTwo);
        booksSet.add(bookThree);
        System.out.println(booksSet);
    }
}
