/**
        A class used to represent a savings account
*/
public class SavingsAccount
{

        private double balance;
        private double rate;
        /**
                Constructs an object of a savings account
                @param initialBalance the amount used to create the account
                @param interestRate the interest rate on the account
        */
        public SavingsAccount(double initialBalance, double interestRate)
        {
                balance = initialBalance;
                rate = interestRate;
        }
        
        /**
                Adds the interest to the balance of the savings account
        */
        public void addInterest()
        {
                double interest = rate / 100 * balance;
                balance = balance + interest;
        }
        
        /**
                Returns the balance of the savings account
                @return the balance of the savings account
        */
        public double getBalance()
        {
                return balance;
        }
}