package com.threads;

/**
 * Created by user on 08.02.2016.
 */
public class BankAccount
{
    private int balance = 100;

    public int getBalance()
    {
        return balance;
    }

    public void withdraw(int amount)
    {
        balance -= amount;
    }
}
