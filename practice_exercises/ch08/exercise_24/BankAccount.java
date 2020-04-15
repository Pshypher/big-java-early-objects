import java.util.ArrayList;

/**
    A bank account has a balance that can be changed by 
    deposits and withdrawals.
*/
public class BankAccount
{  
    private double balance;
    private ArrayList<Double> statement;

    /**
        Constructs a bank account with a zero balance.
    */
    public BankAccount()
    {   
        balance = 0;
        statement = new ArrayList<Double>();
    }

    /**
        Constructs a bank account with a given balance.
        @param initialBalance the initial balance
    */
    public BankAccount(double initialBalance)
    {     
        this();
        balance = initialBalance;
    }

    /**
        Deposits money into the bank account.
        @param amount the amount to deposit
    */
    public void deposit(double amount)
    {  
        balance = balance + amount;
        statement.add(amount);
    }

    /**
        Withdraws money from the bank account.
        @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {   
        balance = balance - amount;
        statement.add(-1 * amount);
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
        Gets the statement of the bank account
        @return the bank account's statement
    */
    public ArrayList<Double> getStatement()
    {
        return statement;
    }
    
    /**
        Removes records of deposits and withdrawals from
        the statement
    */
    public void clearStatement()
    {
        while (statement.size() > 0)
        {
            statement.remove(0);
        }
    }
}
