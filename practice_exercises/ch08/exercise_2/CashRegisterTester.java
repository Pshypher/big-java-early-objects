/**
    A class to test the CashRegister class.
*/
public class CashRegisterTester
{
    public static void main(String[] args)
    {
        final Coin DOLLAR = new Coin(1.0, "Dollar");
        final Coin QUARTER = new Coin(0.25, "Quarter");
        final Coin DIME = new Coin(0.10, "Dime");
        final Coin NICKEL = new Coin(0.05, "Nickel");
        final Coin PENNY = new Coin(0.01, "Penny");
        

        CashRegister register = new CashRegister();

        register.recordPurchase(1.95);
        register.recordPurchase(1.40);
        register.receivePayment(3, DOLLAR);
        register.receivePayment(2, QUARTER);
        
        register.calculateAmountDue();

        int dollars = register.giveChange(DOLLAR);
        int quarters = register.giveChange(QUARTER);
        int dimes = register.giveChange(DIME);
        int nickels = register.giveChange(NICKEL);
        int pennies = register.giveChange(PENNY);

        System.out.println(dollars + " dollar(s)");      
        System.out.println("Expected: 0");
        System.out.println();
        System.out.println(quarters + " quarter(s)");
        System.out.println("Expected: 0");
        System.out.println();
        System.out.println(dimes + " dime(s)");
        System.out.println("Expected: 1");
        System.out.println();
        System.out.println(nickels + " nickel(s)");
        System.out.println("Expected: 1");
        System.out.println();
        System.out.println(pennies + " pennie(s)");
        System.out.println("Expected: 0");          
    }
}
