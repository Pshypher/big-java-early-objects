public class BankAccount
{
    public static int lastAssignedNumber;
    
    private double balance;
    private int accountNumber;
    
    static 
    {
        lastAssignedNumber = 1000;
    }
    
    /**
        Construct a BankAccount with the specified amount.
        @param initialBalance the initial balance.
        @param existing a boolean flag that indicates an existing or 
        new account.
    */
    public BankAccount(double initialBalance, boolean existing)
    {
        balance = initialBalance;
        if (!existing)
        {
            lastAssignedNumber++;
            accountNumber = lastAssignedNumber;
        }
    }
    
    /**
        Construct a new account with no initial balance.
    */
    public BankAccount()
    {
        this(0, false);
    }
    
    /**
        Deposits the  given amount  and returns another BankAccount
        with the appropriate balance.
        @param amount the amount to be deposited in this BankAccount.
        @return a BankAccount whose balance is increased by the given amount.
    */
    public BankAccount deposit(double amount)
    {
        BankAccount account = new BankAccount(balance + amount, true);
        account.accountNumber = accountNumber;
        return account; 
    }
    
    /**
        Withdraw specified amount from this BankAccount and returns
        another BankAccount object whose balance is decreased.
        @param amount the amount to be removed from this BankAccount.
        @return BankAccount object with the appropriate balance.
    */
    public BankAccount withdraw(double amount)
    {
        BankAccount account = new BankAccount(balance - amount, true);
        account.accountNumber = accountNumber;
        return account;
    }
    
    /**
        Get the current balance within this BankAccount
        @return the current balance of this account
    */
    public double getBalance()
    {
        return balance;
    }
}