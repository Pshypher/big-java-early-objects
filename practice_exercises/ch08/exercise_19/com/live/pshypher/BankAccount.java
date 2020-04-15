package com.live.pshypher;

/**
    A bank account has a balance that can be changed by 
    deposits and withdrawals.
*/
public class BankAccount
{  
    private double balance;
    
    /**
        Constructs a bank account with a zero balance.
    */
    public BankAccount()
    {   
        balance = 0;
    }

    /**
        Constructs a bank account with a given balance.
        @param initialBalance the initial balance
    */
    public BankAccount(double initialBalance)
    {   
        balance = initialBalance;
    }
    
    /**
        Deposits money into the bank account.
        @param amount the amount to deposit
    */
    public void deposit(double amount)
    {  
        balance = balance + amount;
    }
    
    /**
        Withdraws money from the bank account.
        @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {   
        balance = balance - amount;
    }
    
    /**
        Gets the current balance of the bank account.
        @return the current balance
    */
    public double getBalance()
    {   
        return balance;
    }
    
    /**
        Transfers money from this account and tries to add it
        @param amount the amount of money to transfer
        @param otherBalance balance to add the amount to
    */
    void transfer(double amount, double otherBalance) 
    {
        balance = balance - amount;
        otherBalance = otherBalance + amount;
        // Won’t update the argument
    }  

    /**
        Transfers money from this account to another.
        @param amount the amount of money to transfer
        @param otherAccount account to add the amount to
    */
    public void transfer(double amount, BankAccount otherAccount) 
    {
        balance = balance - amount;
        otherAccount.deposit(amount);
    } 

    public void transfer2(double amount, BankAccount otherAccount)
    {
        balance = balance - amount;
        double newBalance = otherAccount.balance + amount;
        otherAccount = new BankAccount(newBalance); // Won’t work
    }
}
