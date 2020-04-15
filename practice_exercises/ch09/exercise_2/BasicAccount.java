public class BasicAccount extends BankAccount
{
    /**
        Charges a penalty of $30 if any instance of a 
        withdrawal results in an overdraft.
        @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {
        final double OVERDRAFT_FEE = 30;
        if (getBalance() < amount)
        {
            amount = amount + OVERDRAFT_FEE;
        }
        super.withdraw(amount);
    }
}