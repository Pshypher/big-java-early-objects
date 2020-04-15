import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CustomerTest 
{
    private static final double EPSILON = 1E-12;
    
    @Test public void noDiscount() 
    {
        Customer cust = new Customer();
        cust.makePurchase(50.25);
        cust.makePurchase(45.79);
        double expected = 96.04;
        double purchases = cust.getPurchases();
        Assert.assertEquals(purchases, expected, EPSILON);
    }
    
    @Test public void singleDiscount()
    {
        Customer cust = new Customer();
        cust.makePurchase(60.25);
        cust.makePurchase(75.79);
        cust.makePurchase(53.96);
        double expected = 180;
        double purchases = cust.getPurchases();
        Assert.assertEquals(purchases, expected, EPSILON);
    }
    
    @Test public void multipleDiscounts()
    {
        Customer cust = new Customer();
        cust.makePurchase(60.25);
        cust.makePurchase(75.79);
        cust.makePurchase(53.96);
        cust.makePurchase(49.99);
        double expected = 219.99;
        double purchases = cust.getPurchases();
        Assert.assertEquals(purchases, expected, EPSILON);
    }
}
