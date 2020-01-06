/**
   This program demonstrates the invoice classes by printing
   a sample invoice.
*/
public class InvoicePrinter
{  
   public static void main(String[] args)
   {  
      Address samsAddress 
            = new Address("Sam's Small Appliances",
               "100 Main Street", "Anytown", "CA", "98765");
   
      Invoice samsInvoice = new Invoice(samsAddress);
      samsInvoice.addItem(new Product("Toaster", 29.95), 3);
      samsInvoice.addItem(new Product("Hair dryer", 24.95), 1);
      samsInvoice.addItem(new Product("Car vacuum", 19.99), 2);
      samsInvoice.addCharge(new Product("Shipping", 5.00));
   
      System.out.println(samsInvoice.format());           
   }
}



