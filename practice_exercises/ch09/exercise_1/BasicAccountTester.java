/**
    This program tests the BasicAccount class.
*/
public class BasicAccountTester
{
    public static void main(String[] args)
    {
        BasicAccount account = new BasicAccount();
        account.deposit(225.75);
        account.deposit(2.99);
        account.withdraw(105.25);
        account.withdraw(149.99);
        
        System.out.println(account.getBalance());
        System.out.println("Expected: 123.49");
    }
}