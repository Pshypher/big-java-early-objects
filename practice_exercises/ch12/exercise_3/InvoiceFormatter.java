import java.util.ArrayList;

/**
   This class has method(s) used to format an invoice
*/
public abstract class InvoiceFormatter
{
   
   /**
      Formats the invoice.
      @param anInvoice the invoice to be formatted
      @return the formatted invoice
   */
   public static String format(Invoice anInvoice)
   {  
      Address billingAddress = anInvoice.getBillingAddress();
      String r =  "                     I N V O I C E\n\n"
            + format(billingAddress)
            + String.format("\n\n%-30s%8s%5s%8s\n",
               "Description", "Price", "Qty", "Total");
               
                          
      ArrayList<LineItem> items = anInvoice.getItems();
      for (LineItem item : items)
      {  
         r = r + format(item) + "\n";
      }
   
      r = r + String.format("\nAMOUNT DUE: $%8.2f", anInvoice.getAmountDue());
   
      return r;
   }
   
   /**
      Formats an item.
      @param item to be formatted
      @return a formatted string of this item
   */
   private static String format(LineItem item)
   {  
      Product theProduct = item.getProduct();
      return String.format("%-30s%8.2f%5d%8.2f", 
         theProduct.getDescription(), theProduct.getPrice(), 
         item.getQuantity(), item.getTotalPrice());
   }
   
   /**
      Formats the billing address.
      @return the address as a string with three lines
   */
   private static String format(Address address)
   {
      return address.getName() + "\n" + address.getStreet()
         + "\n" + address.getCity() + ", " + address.getState()
            + " " + address.getZipCode();
   }
}