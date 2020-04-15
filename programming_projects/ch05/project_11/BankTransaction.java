import java.util.Scanner;

/**
        This program simulates a bank transaction
*/
public class BankTransaction
{
        public static final int DEPOSIT = 0;
        public static final int WITHDRAWAL = 1;
        public static final int TRANSFER = 2;

        public static final int CHECKING = 0;
        public static final int SAVINGS = 1;
                
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Enter the initial balance of the account: ");
                double balance = in.nextDouble();
                System.out.print("Enter the transaction options(0 deposit, 1 withdrawal, 2 transfer): ");
                int transaction = in.nextInt();
                System.out.print("Enter the account options(0 checking, 1 savings): ");
                int accountType = in.nextInt();
                
                
                if (balance < 0)
                {
                        System.out.println("Error: Initial balance should be a positive real number");
                }
                else
                {
                        if (accountType == CHECKING || accountType == SAVINGS)
                        {
                                BankAccount account = new BankAccount(balance, accountType);
                                double amount;
                                switch (transaction)
                                {
                                        case DEPOSIT:
                                                System.out.print("Enter amount you want to deposit: ");
                                                amount = in.nextDouble();
                                                account.deposit(amount); 
                                                balance = account.getBalance(); 
                                                break;
                                        case WITHDRAWAL:
                                                System.out.print("Enter the amount you want to withdraw: ");
                                                amount = in.nextDouble();
                                                account.withdraw(amount); 
                                                balance = account.getBalance(); 
                                                break;
                                        case TRANSFER:        
                                                System.out.print("Enter the amount you want transferred: ");
                                                amount = in.nextDouble();
                                                BankAccount receiver = new BankAccount();
                                                account.transfer(amount, receiver);
                                                balance = account.getBalance();
                                                break;
                                        default:
                                                amount = 0;
                                                balance = account.getBalance();
                                                break;                                                                                
                                }
                        }                                                                                  
                        else
                                System.out.print("Error: Bank Account should be either 0 CHECKING or 1 SAVINGS");
                                
                        System.out.println("Balance: " + balance);                                                             
                }
        }       
}