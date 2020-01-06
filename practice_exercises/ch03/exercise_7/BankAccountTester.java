/**
        A Demo of the BankAccount class.
*/
public class BankAccountTester
{
        public static void main(String[] args)
        {
                // constructs a BankAccount object
                BankAccount momsSavings = new BankAccount(1000);
                
                // displays the current balance before the interest run is applied
                System.out.println("balance: " + momsSavings.getBalance());
                System.out.println("Expected: " + 1000.0);
                
                // after the interest run is applied to the BankAccount
                momsSavings.addInterest(10);
                System.out.println("after: " + momsSavings.getBalance());
                System.out.println("Expected: " + 1100.0);
        }
}  