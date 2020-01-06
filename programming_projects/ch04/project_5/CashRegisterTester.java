/**
        A class to test the CashRegister class.
*/
public class CashRegisterTester
{
        public static void main(String[] args)
        {
                CashRegister register = new CashRegister();

                register.recordPurchase(29.50);
                register.recordPurchase(9.25);
                
                Coin dollars = new Coin("Dollars", 1);
                Coin quarters = new Coin("Quarters", 0.25);
                Coin dimes = new Coin("Dimes", 0.10);
                Coin nickels = new Coin("Nickels", 0.05);
                Coin pennies = new Coin("Pennies", 0.01);
                 
                register.receivePayment(dollars, 49);
                register.receivePayment(quarters, 2);
                register.receivePayment(dimes, 3);
                register.receivePayment(nickels, 3);
                register.receivePayment(pennies, 5);

                double change = register.giveChange();
        
                System.out.println(change);      
                System.out.println("Expected: 11.25");          
        }    
}
