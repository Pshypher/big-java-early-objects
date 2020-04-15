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
        change = 0;
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
    public void receivePayment(int coinCount, Coin coinType)
    {
        payment = payment + coinCount * coinType.getValue();         
    }
    
    /**
        Calculate the total amount due at the end of a purchase.
    */
    public void calculateAmountDue()
    {
        change = Math.round((payment - purchase) * Coin.PENNIES);
    }
   
    /**
        Computes quantity of a coin to be received from the change due
        @return the amount of coins given as change
    */
    public int giveChange(Coin coinType)
    {
        double pennies = coinType.getValue() * Coin.PENNIES;
        int coinCount = (int) (change / pennies);
        change = change % pennies;
        return coinCount;
    }
    
    /**
        Resets the register for the next customer
    */
    public void clear()
    {
        purchase = 0;
        payment = 0;
        change = 0;
    }
}
