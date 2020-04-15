/**
        The BankAccount class simulates a bank account with an initial
        balance, account is either a CHECKING or SAVINGS account
*/
public class BankAccount
{
        public static final int CHECKING = 0;
        public static final int SAVINGS = 1;
        
        public enum BankAccountClass {CHECKING, SAVINGS};
        
        private double balance;
        private BankAccountClass type;
        
        /**
                Constructs an object of the BankAccount class
                @param initialBalance the initial amount in a recent account
                @param accountType can either be a CHECKING or SAVINGS account
        */
        public BankAccount(double initialBalance, int accountType)
        {
                balance = initialBalance;
                type = (accountType == 0) ? BankAccountClass.CHECKING :
                        BankAccountClass.SAVINGS;
        }
        
        /**
                Default constructor of an object of the BankAccount class
        */
        public BankAccount()
        {
                type = BankAccountClass.SAVINGS;
        }
        
        /**
                Returns the account balance of an account holder
                @return the amount held in the account of holder
        */
        public double getBalance()
        {
                return balance;
        }
        
        /**
                Sends the detail regarding the account type of holder
                @return either Checking or Savings account type
        */
        public String getAccountType()
        {
                return "" + type;                        
        }
        
        /**
                Adds to the current balance in the holders account
                @param amount the amount added to the current balance
        */
        public void deposit(double amount)
        {
                balance = balance + amount;
        }
        
        /**
                Withdraws an amount less than or equivalent to the balance
                @param amount the amount to be withdrawn
        */
        public void withdraw(double amount)
        {
                if (amount > balance)
                        System.out.println("Error: Transactions that overdraw an account cannot be executed");
                else
                        balance = balance - amount;                        
        }
        
        /**
                Transfers a certain amount not greater than the balance
                @param amount the amount transferred
                @param holder BankAccount object of holder that receives the transferred amount
        */
        public void transfer(double amount, BankAccount holder)
        {
                if (amount > balance)
                        System.out.println("Error: Transactions that overdraw an account cannot be executed");
                else
                        balance = balance - amount;
                        holder.deposit(amount);
        }
}
