/**
        A class writen to test the BankAccount class
*/
public class BankAccountTester
{
        public static void main(String[] args)
        {
                BankAccount randomHolder = new BankAccount();
                randomHolder.deposit(1000);
                randomHolder.withdraw(500);
                randomHolder.withdraw(400);
                double balance = randomHolder.getBalance();
                System.out.println(balance);
                System.out.println("Expected: 100");
        }
}