/**
    A tax return of a taxpayer in 2008.
*/
public class TaxReturn
{       
    private static final double RATE1 = 0.10;
    private static final double RATE2 = 0.25;
    private static final double RATE1_SINGLE_LIMIT = 32000;
    private static final double RATE1_MARRIED_LIMIT = 64000;
    
    private static final double SOCIAL_SECURITY_RATE = 0.062;
    private static final double SOCIAL_SECURITY_LIMIT = 102000;
        
    public static double getFederalTax(double income, int status)
    {   
        double tax1 = 0;
        double tax2 = 0;
                
        if (status == Student.SINGLE)
        {
            if (income <= RATE1_SINGLE_LIMIT)
            {
                tax1 = RATE1 * income; 
            }
            else
            {
                tax1 = RATE1 * RATE1_SINGLE_LIMIT;
                tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
            }
        }
        else
        {
            if (income <= RATE1_MARRIED_LIMIT)
            {
                tax1 = RATE1 * income;
            }
            else
            {
                tax1 = RATE1 * RATE1_MARRIED_LIMIT;
                tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
            }
        }
                
        return tax1 + tax2;                
    }
    
    
    public static double getSocialSecurityTax(double income)
    {   
        double tax;
        if (income < SOCIAL_SECURITY_LIMIT)
        {
            tax = income * SOCIAL_SECURITY_RATE;
        }
        else
        {
            tax = SOCIAL_SECURITY_LIMIT * SOCIAL_SECURITY_RATE;
        }
        
        return tax;
    }
}        