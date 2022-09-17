package com.company;
public class BankAccount
{
    // the attributes
    private String accountNumber;
    private String accountName;
    private double balance;
    private static double interestRate;

// the methods

    // the constructor
    public BankAccount(String numberIn, String nameIn)
    {
        accountNumber = numberIn;
        accountName = nameIn;
        balance = 0;
    }

    // methods to read the attributes
    public String getAccountName()
    {
        return accountName;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    // methods to deposit and withdraw money
    public void deposit(double amountIn)
    {
        balance = balance + amountIn;
    }
    public boolean withdraw(double amountIn)
    {
        if(amountIn > balance)
        {
            return false; // no withdrawal was made
        }
        else
        {
            balance = balance - amountIn;
            return true; // money was withdrawn successfully
        }
    }
    public static void setInterestRate(double rateIn)
    {
        interestRate = rateIn;
    }

    public static double getInterestRate()
    {
        return interestRate;
    }

    public void addInterest()
    {
        balance = balance + (balance * interestRate)/100;
    }

}