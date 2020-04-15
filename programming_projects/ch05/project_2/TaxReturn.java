/**
        The TaxReturn class is used to compute the taxes 
        of both single and married income earners
*/
public class TaxReturn
{
        // Constant(s)
        public static final int SINGLE = 1;
        public static final int MARRIED = 2;
        
        private double income;
        private int status;
        
        /**
                Constructor for an instance of the TaxReturn class
                @param maritalStatus marital status of an employee
                @param earnedIncome income earned by an employee
        */
        public TaxReturn(int maritalStatus, double earnedIncome)
        {
                status = maritalStatus;
                income = earnedIncome;
        }
        
        /**
                Calculates the tax on the income earned
                @return the computed tax
        */
        public double getTaxReturn()
        {
                // Constant(s)
                final double SINGLE_INCOME_LIMIT1 = 8000;
                final double SINGLE_INCOME_LIMIT2 = 32000;
                final double MARRIED_INCOME_LIMIT1 = 16000;
                final double MARRIED_INCOME_LIMIT2 = 64000;
                
                final double RATE1 = 0.10;
                final double RATE2 = 0.15;
                final double RATE3 = 0.25;
                
                double tax1 = 0;
                double tax2 = 0;
                double tax3 = 0;
                if (status == SINGLE)
                {
                        if (income <= SINGLE_INCOME_LIMIT1)
                        {
                                tax1 = income * RATE1;
                        }
                        else if (income  <= SINGLE_INCOME_LIMIT2)
                        {
                                tax1 = SINGLE_INCOME_LIMIT1 * RATE1;
                                tax2 = (income - SINGLE_INCOME_LIMIT1)
                                        * RATE2;
                        }
                        else
                        {
                                tax1 = SINGLE_INCOME_LIMIT1 * RATE1;
                                tax2 = (SINGLE_INCOME_LIMIT2 - 
                                        SINGLE_INCOME_LIMIT1) * RATE2;
                                tax3 = (income - SINGLE_INCOME_LIMIT2)
                                        * RATE3;                                        
                        }
                }
                else
                {
                        if (income <= MARRIED_INCOME_LIMIT1)
                        {
                                tax1 = income * RATE1;
                        }
                        else if (income <= MARRIED_INCOME_LIMIT2)
                        {
                                tax1 = MARRIED_INCOME_LIMIT1 * RATE1;
                                tax2 = (income - MARRIED_INCOME_LIMIT1) 
                                        * RATE2;
                        }
                        else
                        {
                                tax1 = MARRIED_INCOME_LIMIT1 * RATE1;
                                tax2 = (MARRIED_INCOME_LIMIT2 - 
                                        MARRIED_INCOME_LIMIT1) * RATE2;
                                tax3 = (income - MARRIED_INCOME_LIMIT2)
                                        * RATE3;                                        
                        }
                        
                }
                double tax = tax1 + tax2 + tax3;
                return tax;
        }        
}