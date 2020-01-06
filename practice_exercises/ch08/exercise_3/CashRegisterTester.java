/**
    A class to test the CashRegister class.
*/
public class CashRegisterTester
{
    public static void main(String[] args)
    {
        final Currency DOLLAR = new Currency(1.0, "Dollar", Currency.BILL);
        final Currency QUARTER = new Currency(0.25, "Quarter", Currency.COIN);
        final Currency DIME = new Currency(0.10, "Dime", Currency.COIN);
        final Currency NICKEL = new Currency(0.05, "Nickel", Currency.COIN);
        final Currency PENNY = new Currency(0.01, "Penny", Currency.COIN);
        

        CashRegister register = new CashRegister();

        register.recordPurchase(7.19);
        register.recordPurchase(0.65);
        register.receivePayment(5, DOLLAR);
        register.receivePayment(1, DOLLAR);
        register.receivePayment(1, DOLLAR);
        register.receivePayment(2, QUARTER);
        register.receivePayment(6, DIME);        
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
        System.out.println("Expected: 1");
        System.out.println();
        System.out.println(dimes + " dime(s)");
        System.out.println("Expected: 0");
        System.out.println();
        System.out.println(nickels + " nickel(s)");
        System.out.println("Expected: 0");
        System.out.println();
        System.out.println(pennies + " pennie(s)");
        System.out.println("Expected: 1");          
    }
}