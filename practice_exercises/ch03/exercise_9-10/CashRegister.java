/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
        private double purchase;
        private double payment;
        private String receipt;
        private double totalSales;
        private int totalCount;

        /**
                Constructs a cash register with no money in it.
        */
        public CashRegister()
        {
                purchase = 0;
                payment = 0;
                receipt = "";
        }

        /**
                Records the sale of an item.
                @param amount the price of the item
        */
        public void recordPurchase(double amount)
        {
                purchase = purchase + amount;
                receipt = receipt.concat(String.valueOf(amount));
                receipt = receipt.concat("\n");
                 totalSales = totalSales + amount;
                totalCount = totalCount + 1;

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
                Display the prices of each purchased item and the total amount due 
        */
        public void printCashReceipt()
        {
                receipt = receipt.concat("Total amount due: ");
                receipt = receipt.concat(String.valueOf(purchase));
                System.out.print(receipt);
        }
        
        /**
                Get the total amount of sales recorded for the entire business day
                @return the total amount of sales for the day
        */
        public double getSalesTotal()
        {
                return totalSales;
        }
        
        /**
                Get the total number of items sold for the day
                @return the total number of items sold
        */
        public int getSalesCount()
        {
                return totalCount;
        }
        
        /**
                Resets the total sales and the total number of items sold for the day
        */
        public void reset()
        {
                totalSales = 0;
                totalCount = 0;
        }
}
