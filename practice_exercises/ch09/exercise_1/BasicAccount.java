/**
    A holder of a basic account cannot withdraw more
    money than the available balance
*/
public class BasicAccount extends BankAccount
{
    
    public void withdraw(double amount)
    {
        if (getBalance() >= amount)
        {
            super.withdraw(amount);
        } 
    }
}