import org.junit.Assert;
import org.junit.Test;

public class TaxReturnTest
{
    @Test public void singleBelowIncomeLimit()
    {
        final double EPSILON = 1E-14;
        double expected = 1635.0;
        int status= 1;
        double income = 16350;
        TaxReturn aTaxReturn = new TaxReturn(income, status);
        Assert.assertEquals(expected, aTaxReturn.getTax(), EPSILON);
    }
    
    @Test public void singleAboveIncomeLimit()
    {
        final double EPSILON = 1E-14;
        double expected = 6450.0;
        int status = 1;
        double income = 45000;
        TaxReturn aTaxReturn = new TaxReturn(income, status);
        Assert.assertEquals(expected, aTaxReturn.getTax(), EPSILON);
    }
    
    @Test public void marriedAboveIncomeLimit()
    {
        final double EPSILON = 1E-14;
        double expected = 9812.50;
        int status = 2;
        double income = 77650;
        TaxReturn aTaxReturn = new TaxReturn(income, status);
        Assert.assertEquals(expected, aTaxReturn.getTax(), EPSILON);
    }
}