/**
        The TaxReturn class for the 2017 U.S. income tax schedule
        filed under the SINGLE or MARRIED status
*/
public class TaxReturn 
{
        // Constant(s)
        public static final int SINGLE = 1;
        public static final int MARRIED = 2;
        
        private int status;
        private double income;
        
        /**
                Constructor for the TaxReturn class
                @param maritalStatus Filed as either SINGLE or MARRIED
                @param incomeEarned amount in USD earned
        */
        public TaxReturn(int maritalStatus, double incomeEarned)
        {
                status = maritalStatus;
                income = incomeEarned;   
        }
        
        /**
                Returns the computed tax of an income
                @return the calculated tax
        */
        public double getTax()
        {
                // Constant(s)
                final double SINGLE_INCOME_LIMIT1 = 9325;
                final double SINGLE_INCOME_LIMIT2 = 37950;
                final double SINGLE_INCOME_LIMIT3 = 91900;
                final double SINGLE_INCOME_LIMIT4 = 191650;
                final double SINGLE_INCOME_LIMIT5 = 416700;
                final double SINGLE_INCOME_LIMIT6 = 418400;
                final double MARRIED_INCOME_LIMIT1 = 18650;
                final double MARRIED_INCOME_LIMIT2 = 75900;
                final double MARRIED_INCOME_LIMIT3 = 153100;
                final double MARRIED_INCOME_LIMIT4 = 233350;
                final double MARRIED_INCOME_LIMIT5 = 416700;
                final double MARRIED_INCOME_LIMIT6 = 470700;
                
                final double RATE1 = 0.10;
                final double RATE2 = 0.15;
                final double RATE3 = 0.25;
                final double RATE4 = 0.28;
                final double RATE5 = 0.33;
                final double RATE6 = 0.35;
                final double RATE7 = 0.396;
                
                double tax1 = 0, 
                        tax2 = 0,
                        tax3 = 0,
                        tax4 = 0,
                        tax5 = 0,
                        tax6 = 0,
                        tax7 = 0;
                
                if (status == SINGLE)
                {
                        if (income <= SINGLE_INCOME_LIMIT1)
                        { tax1 = income * RATE1; }
                        else if (income <= SINGLE_INCOME_LIMIT2)
                        {
                                tax1 = SINGLE_INCOME_LIMIT1 * RATE1;
                                tax2 = (income - SINGLE_INCOME_LIMIT1) * RATE2;
                        }
                        else if (income <= SINGLE_INCOME_LIMIT3)
                        {
                                tax1 = SINGLE_INCOME_LIMIT1 * RATE1;
                                tax2 = (SINGLE_INCOME_LIMIT2 - SINGLE_INCOME_LIMIT1) * RATE2;
                                tax3 = (income - SINGLE_INCOME_LIMIT3) * RATE3;
                        }
                        else if (income <= SINGLE_INCOME_LIMIT4)
                        {
                                tax1 = SINGLE_INCOME_LIMIT1 * RATE1;
                                tax2 = (SINGLE_INCOME_LIMIT2 - SINGLE_INCOME_LIMIT1) * RATE2;
                                tax3 = (SINGLE_INCOME_LIMIT3 - SINGLE_INCOME_LIMIT2) * RATE3;
                                tax4 = (income - SINGLE_INCOME_LIMIT4) * RATE4;
                        }
                        else if (income <= SINGLE_INCOME_LIMIT5)
                        {
                                tax1 = SINGLE_INCOME_LIMIT1 * RATE1;
                                tax2 = (SINGLE_INCOME_LIMIT2 - SINGLE_INCOME_LIMIT1) * RATE2;
                                tax3 = (SINGLE_INCOME_LIMIT3 - SINGLE_INCOME_LIMIT2) * RATE3;
                                tax4 = (SINGLE_INCOME_LIMIT4 - SINGLE_INCOME_LIMIT3) * RATE4;
                                tax5 = (income - SINGLE_INCOME_LIMIT5) * RATE5;
                        }
                        else if (income <= SINGLE_INCOME_LIMIT6)
                        {
                                tax1 = SINGLE_INCOME_LIMIT1 * RATE1;
                                tax2 = (SINGLE_INCOME_LIMIT2 - SINGLE_INCOME_LIMIT1) * RATE2;
                                tax3 = (SINGLE_INCOME_LIMIT3 - SINGLE_INCOME_LIMIT2) * RATE3;
                                tax4 = (SINGLE_INCOME_LIMIT4 - SINGLE_INCOME_LIMIT3) * RATE4;
                                tax5 = (SINGLE_INCOME_LIMIT5 - SINGLE_INCOME_LIMIT4) * RATE5;
                                tax6 = (income - SINGLE_INCOME_LIMIT5) * RATE6;
                        }
                        else
                        {
                                tax1 = SINGLE_INCOME_LIMIT1 * RATE1;
                                tax2 = (SINGLE_INCOME_LIMIT2 - SINGLE_INCOME_LIMIT1) * RATE2;
                                tax3 = (SINGLE_INCOME_LIMIT3 - SINGLE_INCOME_LIMIT2) * RATE3;
                                tax4 = (SINGLE_INCOME_LIMIT4 - SINGLE_INCOME_LIMIT3) * RATE4;
                                tax5 = (SINGLE_INCOME_LIMIT5 - SINGLE_INCOME_LIMIT4) * RATE5;
                                tax6 = (SINGLE_INCOME_LIMIT6 - SINGLE_INCOME_LIMIT5) * RATE6;
                                tax7 = (income - SINGLE_INCOME_LIMIT6) * RATE7;
                        }
                }
                else
                {
                        if (income <= MARRIED_INCOME_LIMIT1)
                        { tax1 = income * RATE1; }
                        else if (income <= MARRIED_INCOME_LIMIT2)
                        {
                                tax1 = MARRIED_INCOME_LIMIT1 * RATE1;
                                tax2 = (income - MARRIED_INCOME_LIMIT1) * RATE2;
                        }
                        else if (income <= MARRIED_INCOME_LIMIT3)
                        {
                                tax1 = MARRIED_INCOME_LIMIT1 * RATE1;
                                tax2 = (MARRIED_INCOME_LIMIT2 - MARRIED_INCOME_LIMIT1) * RATE2;
                                tax3 = (income - MARRIED_INCOME_LIMIT3) * RATE3;
                        }
                        else if (income <= MARRIED_INCOME_LIMIT4)
                        {
                                tax1 = MARRIED_INCOME_LIMIT1 * RATE1;
                                tax2 = (MARRIED_INCOME_LIMIT2 - MARRIED_INCOME_LIMIT1) * RATE2;
                                tax3 = (MARRIED_INCOME_LIMIT3 - MARRIED_INCOME_LIMIT2) * RATE3;
                                tax4 = (income - MARRIED_INCOME_LIMIT4) * RATE4;
                        }
                        else if (income <= MARRIED_INCOME_LIMIT5)
                        {
                                tax1 = MARRIED_INCOME_LIMIT1 * RATE1;
                                tax2 = (MARRIED_INCOME_LIMIT2 - MARRIED_INCOME_LIMIT1) * RATE2;
                                tax3 = (MARRIED_INCOME_LIMIT3 - MARRIED_INCOME_LIMIT2) * RATE3;
                                tax4 = (MARRIED_INCOME_LIMIT4 - MARRIED_INCOME_LIMIT3) * RATE4;
                                tax5 = (income - MARRIED_INCOME_LIMIT5) * RATE5;
                        }
                        else if (income <= MARRIED_INCOME_LIMIT6)
                        {
                                tax1 = MARRIED_INCOME_LIMIT1 * RATE1;
                                tax2 = (MARRIED_INCOME_LIMIT2 - MARRIED_INCOME_LIMIT1) * RATE2;
                                tax3 = (MARRIED_INCOME_LIMIT3 - MARRIED_INCOME_LIMIT2) * RATE3;
                                tax4 = (MARRIED_INCOME_LIMIT4 - MARRIED_INCOME_LIMIT3) * RATE4;
                                tax5 = (MARRIED_INCOME_LIMIT5 - MARRIED_INCOME_LIMIT4) * RATE5;
                                tax6 = (income - MARRIED_INCOME_LIMIT5) * RATE6;
                        }
                        else
                        {
                                tax1 = MARRIED_INCOME_LIMIT1 * RATE1;
                                tax2 = (MARRIED_INCOME_LIMIT2 - MARRIED_INCOME_LIMIT1) * RATE2;
                                tax3 = (MARRIED_INCOME_LIMIT3 - MARRIED_INCOME_LIMIT2) * RATE3;
                                tax4 = (MARRIED_INCOME_LIMIT4 - MARRIED_INCOME_LIMIT3) * RATE4;
                                tax5 = (MARRIED_INCOME_LIMIT5 - MARRIED_INCOME_LIMIT4) * RATE5;
                                tax6 = (MARRIED_INCOME_LIMIT6 - MARRIED_INCOME_LIMIT5) * RATE6;
                                tax7 = (income - MARRIED_INCOME_LIMIT6) * RATE7;
                        }
                }
                double tax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6 + tax7;
                return tax;                        
        }
}