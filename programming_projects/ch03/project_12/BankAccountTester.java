/**
        A class that unit-tests the BankAccount class
*/
public class BankAccountTester
{
        public static void main(String[] args)
        {
                // Construct a BankAccount object
                BankAccount harrysChecking = new BankAccount(11.05, 0.15);
                
                harrysChecking.deposit(8.95);
                harrysChecking.deposit(5);
                harrysChecking.withdraw(2.5);   // balance remaining is now $22.50
                
                System.out.print("actual: ");
                System.out.println(harrysChecking.getBalance());
                System.out.println("expected: 22.50");    
                
                harrysChecking.withdraw(17);
                harrysChecking.withdraw(3.5);
                harrysChecking.deposit(6.25);  
                harrysChecking.deductMonthlyCharge();   // remaining balance is now $7.80
                
                System.out.print("actual: ");
                System.out.println(harrysChecking.getBalance());
                System.out.println("expected: 7.80");
        }
}