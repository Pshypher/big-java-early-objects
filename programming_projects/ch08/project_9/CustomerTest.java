import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CustomerTest 
{
    private static final double EPSILON = 1E-12;
    
    @Test public void noDiscount() 
    {
        Customer cust = new Customer();
        cust.makePurchase(50.25, 1);
        cust.makePurchase(45.79, 1);
        cust.makePurchase(23.96, 2);
        double expected = 120;
        double purchases = cust.getPurchases();
        Assert.assertEquals(purchases, expected, EPSILON);
    }
    
    @Test public void singleDiscount()
    {
        Customer cust = new Customer();
        cust.makePurchase(60.25, 12);
        cust.makePurchase(75.79, 9);
        cust.makePurchase(53.96, 18);
        double expected = 180;
        double purchases = cust.getPurchases();
        Assert.assertEquals(purchases, expected, EPSILON);
    }
    
    @Test public void multipleDiscounts()
    {
        Customer cust = new Customer();
        cust.makePurchase(60.25, 7);
        cust.makePurchase(75.79, 5);
        cust.makePurchase(53.96, 17);
        cust.makePurchase(49.99, 8);
        cust.makePurchase(0.99, 20);
        cust.makePurchase(6.52, 9);
        cust.makePurchase(12.09, 14);
        double expected = 239.59;
        double purchases = cust.getPurchases();
        Assert.assertEquals(purchases, expected, EPSILON);
    }
}
