/**
    Customer class designed towards a customer loyalty program
    used to track purchases and apply discounts accordingly.
*/
public class Customer
{
    private static final double PURCHASES_BASELINE = 100; // purchases made 
                                                // before discount is applied
    private static final double DISCOUNT_AMOUNT = 10;
    
    private double purchases;
    private int discounts;
    
    /**
        Constructor a prospective customer yet to make
        a purchase.
    */
    public Customer()
    {
        purchases = 0;
        discounts = 0;
    }
    
    /**
        Add amount of purchase made to the total purchases
        made by this customer.
        @param amount amount in a single purchase made by this 
        cutomer.
    */
    public void makePurchase(double amount)
    {
        purchases = purchases + amount;
        if (discountReached()) 
        {
            purchases = purchases - DISCOUNT_AMOUNT;
            discounts++;
        }
    }
    
    /**
        Get the purchases made by this customer.
        @return total purchases made by this customer.
    */
    public double getPurchases()
    {
        return purchases;
    }
    
    /**
        Get the total number discounts applied.
        @return discounts applied to reward customer.
    */
    public int getDiscounts()
    {
        return discounts;            
    }       
    
    /**
        Checks if the purchases made by this customer are about the same value
        as the amount of the limit set for purchases before applying a discount.
        @return true if a discount should be applied, otherwise false.     
    */
    public boolean discountReached()
    {
        double divisor = (discounts + 1) * PURCHASES_BASELINE;
        int quotient = (int) (purchases / divisor);
        return quotient > 0;
    }
}