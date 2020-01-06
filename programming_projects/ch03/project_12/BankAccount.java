/**
        A bank account has a balance that can be changed by
        deposits and withdrawals
*/
public class BankAccount
{
        private double balance;
        private double chargePerTransaction;
        private int freeTransactionCount;
        private int actualTransactionCount;
                
        /**
                Constructs a bank account with a given balance.
                @param initialBalance the initial balance
                @param fee the amount to be deducted per transaction from the holder's account 
        */
        public BankAccount(double initialBalance, double fee)
        {
                balance = initialBalance;
                chargePerTransaction = fee;
                freeTransactionCount = 3;
        }
        
         /**
                Constructs a bank account with a zero balance.
                @param fee the amount to be deducted per transaction from the holder's account
        */
        public BankAccount(double fee)
        {
                this(0, fee);
         }

        
        /**
                Deposits money into the bank account.
                @param amount the amount to deposit
        */
        public void deposit(double amount)
        {
                balance = balance + amount;
                actualTransactionCount = actualTransactionCount + 1;
        }
        
        /**
                Withdraws money from the bank account
                 @param amount the amount to withdraw
        */
        public void withdraw(double amount)
        {
                balance = balance - amount;
                actualTransactionCount = actualTransactionCount + 1;
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
                Deducts a monthly charge after the alloted number of free transactions has been exceeded
        */
        public void deductMonthlyCharge()
        {
                int paidTransactionCount = Math.max(actualTransactionCount, freeTransactionCount) - freeTransactionCount;
                double monthlyCharge = chargePerTransaction * paidTransactionCount;
                balance = balance - monthlyCharge;
                actualTransitionCount = 0;
        }
}