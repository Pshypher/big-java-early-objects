/**
        A cash register totals up sales and computes change due.
*/
public class CashRegister
{
        public static final double QUARTER_VALUE = 0.25;
        public static final double DIME_VALUE = 0.1;
        public static final double NICKEL_VALUE = 0.05;
        public static final double PENNY_VALUE = 0.01;
        
        private double purchase;
        private double payment;
        
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
                Record the amount of dollars paid into the register
                @param dollar the number of dollars paid 
        */
        public void enterDollars(int dollar)
        {
                payment = payment + dollar;
        }
        
        /**
                Pays the given number of quarters in the register
                @param quarters the number of quarters paid
        */
        public void enterQuarters(int quarters)
        {
                payment = payment + quarters * QUARTER_VALUE;
        }
        
        /**
                Pays the specified number of dimes into the register
                @param dimes the number of dimes paid
        */
        public void enterDimes(int dimes)
        {
                payment = payment + dimes * DIME_VALUE;
        }
        
        /**
                Pays the given number of nickels in the register
                @param nickels the number of nickels paid into the machine
        */
        public void enterNickels(int nickels)
        {
                payment = payment + nickels * NICKEL_VALUE;
        }
        
        /**
                Pays the given number of pennies in the register
                @param pennies the number of pennies paid into the machine
        */
        public void enterPennies(int pennies)
        {
                payment = payment + pennies * PENNY_VALUE;
        }
          
        /**
                Computes the change due and resets the machine for the next customer.
                @return the change due to the customer 
        */
        public double giveChange()
        {
                double change = payment - purchase;
                purchase = 0;
                payment = 0;
                return change;
        }
}