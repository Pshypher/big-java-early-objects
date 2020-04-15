/**
    A checking account has a limited number of free deposits and withdrawals.
*/
public class CheckingAccount extends BankAccount
{
    private int transactions;

    /**
        Constructs a checking account with a zero balance.
    */
    public CheckingAccount()
    {
        transactions = 0;
    }
    
    public void deposit(double amount)
    {
        super.deposit(amount);
        endTransaction();
    }

    public void withdraw(double amount)
    {
        super.withdraw(amount);
        endTransaction();
    }
    
    public void monthEnd()
    {
        transactions = 0;
    }
    
    /**
        At the end of every deposits or withdrawals, deduct a fee 
        after exhausting the free transactions allowed per month.
    */
    public void endTransaction()
    {
        final int FREE_TRANSACTIONS = 3;
        final int TRANSACTION_FEE = 1;
        
        transactions++;
        if (transactions > FREE_TRANSACTIONS)
        {
            super.withdraw(TRANSACTION_FEE);
        }   
    }
}

