/**
        A unit-test written to check the SavingsAccount class
*/
public class SavingsAccountTester
{
        public static void main(String[] args)
        {       
                // Constructs a savings account with an initial balance of 1000 
                SavingsAccount savings = new SavingsAccount(1000, 10);    // and an interest rate of 10%
                savings.addInterest();
                
                System.out.print("actual: ");
                System.out.println(savings.getBalance());
                System.out.print("expected: 1100");
        }
}