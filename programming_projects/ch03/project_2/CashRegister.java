/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
        private double purchase;
        private double payment;
        private int totalPurchasedItems;
        private double rate;
        private double totalSalesTax;

        /**
                Constructs a cash register with no money in it.
        */
        public CashRegister(double taxRate)
        {
                purchase = 0;
                payment = 0;
                rate = taxRate / 100;
        }

        /**
                Records the sale of an item.
                @param amount the price of the item
        */
        public void recordPurchase(double amount)
        {
                purchase = purchase + amount;
               totalPurchasedItems = totalPurchasedItems + 1;

        }
        
        /**
                Sums up and records the amount and the sales tax of the amount
                @param amount the cost of a taxable item 
        */
        public void recordTaxablePurchase(double amount)
        {
                double salesTax = amount * rate;
                totalSalesTax = salesTax + totalSalesTax;
                payment = payment +amount + salesTax;
        }

        /**
                Processes a payment received from the customer.
                @param amount the amount of the payment
        */
        public void receivePayment(double amount)
        {
                payment = payment + amount;
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
        
        /**
                Returns the total number of items sold since the cash register was created
                @return the total number of items sold since the CashRegister object was constructed 
        */
        public int getItemCount()
        {
                return totalPurchasedItems;
        }
        
        /**
                Returns the total of the taxes recorded on each taxable item purchased
                @return the total sales tax recorded
        */      
        public double getTotalTax()
        {
                return totalSalesTax;
        }
}
