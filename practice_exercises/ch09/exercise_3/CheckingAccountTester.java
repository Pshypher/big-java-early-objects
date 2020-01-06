/**
    This program tests the CheckingAccount class.
*/
public class CheckingAccountTester
{
    public static void main(String[] args)
    {
        CheckingAccount account = new CheckingAccount();
        account.deposit(1500);
        account.withdraw(200);
        account.withdraw(750);
        account.withdraw(450);
        account.withdraw(155);
        account.withdraw(50);
        
        System.out.println(account.getBalance());
        System.out.println("Expected: -157");
        
        account.monthEnd();
        account.deposit(320.75);
        account.withdraw(575.65);
        
        System.out.println(account.getBalance());
        System.out.println("Expected: -431.9");
    }
}