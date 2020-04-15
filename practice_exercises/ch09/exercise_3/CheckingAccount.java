/**
    A checking account has a limited number of free deposits and withdrawals.
*/
public class CheckingAccount extends BankAccount
{
    private int withdrawals;
    private int overdrafts;

    /**
        Constructs a checking account with a zero balance.
    */
    public CheckingAccount()
    {
        withdrawals = 0;
        overdrafts = 0;
    }

    public void withdraw(double amount)
    {  
        final int FREE_WITHDRAWALS = 3;
        final int WITHDRAWAL_FEE = 1;
        final int INITIAL_OVERDRAFT_FEE = 20;
        final int SUBSEQUENT_OVERDRAFT_FEE = 30;
        
        withdrawals++;
        if (withdrawals > FREE_WITHDRAWALS)
        {
            super.withdraw(WITHDRAWAL_FEE);  
        }
        
        if (amount > getBalance()) { overdrafts++; }
        if (overdrafts == 1)
        {
            super.withdraw(INITIAL_OVERDRAFT_FEE);  // first overdraft in a month
        }
        else if (overdrafts > 1)
        {
            super.withdraw(SUBSEQUENT_OVERDRAFT_FEE);
        }
        super.withdraw(amount);
    }
    
    public void monthEnd()
    {
        withdrawals = 0;
        overdrafts = 0;
    }
}

