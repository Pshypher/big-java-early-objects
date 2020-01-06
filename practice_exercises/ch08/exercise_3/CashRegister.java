/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
    
    private double purchase;
    private double payment;
    private double change;

    /**
        Constructs a cash register with no money in it.
    */
    public CashRegister()
    {
        purchase = 0;
        payment = 0;
    }

    /**
        Records the purchase price of an item.
        @param amount the price of the purchased item
    */
    public void recordPurchase(double amount)
    {
        purchase = purchase + amount;
    }
   
    /**
        Enters the payment received from the customer.
        @param coinCount the number of coins received
        @param coinType the type of coin that was received
    */
    public void receivePayment(int currencyCount, Currency currency)
    {
        payment = payment + currencyCount * currency.getValue();         
    }
    
    /**
        Calculate the total amount due at the end of a purchase.
    */
    public void calculateAmountDue()
    {
        change = Math.round(payment * Currency.PENNIES - 
            purchase * Currency.PENNIES);
    }
   
    /**
        Computes quantity of a coin to be received from the change due
        @return the amount of coins given as change
    */
    public int giveChange(Currency currency)
    {
        double pennies = currency.getValue() * Currency.PENNIES;
        int currencyAmount = (int) (change / pennies);
        change = change % pennies;
        return currencyAmount;
    }
    
    /**
        Resets the machine for the next customer
    */
    public void clear()
    {
        purchase = 0;
        payment = 0;
        change = 0;
    }
}
