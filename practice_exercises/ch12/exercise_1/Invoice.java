import java.util.ArrayList;

/**
   Describes an invoice for a set of purchased products.
*/
public class Invoice
{  
   private Address billingAddress;
   private ArrayList<LineItem> items;

   /**
      Constructs an invoice.
      @param anAddress the billing address
   */
   public Invoice(Address anAddress)
   {  
      items = new ArrayList<LineItem>();
      billingAddress = anAddress;
   }
  
   /**
      Adds a charge for an article to this invoice.
      @param aProduct the product that the customer ordered
      @param quantity the quantity of the product
   */
   public void addItem(Product aProduct, int quantity)
   {  
      LineItem anItem = new NumericalQuantity(aProduct, quantity);
      items.add(anItem);
   }
   
   /**
      Adds a charge for a service to this invoice.
      @param service the rendered service
   */
   public void addCharge(Product service)
   {
      final int QUANTITY = 1;
      LineItem aCharge = new FixedCharge(service, QUANTITY);
      items.add(aCharge);
   }

   /**
      Formats the invoice.
      @return the formatted invoice
   */
   public String format()
   {  
      String r =  "                     I N V O I C E\n\n"
            + billingAddress.format()
            + String.format("\n\n%-30s%8s%5s%8s\n",
               "Description", "Price", "Qty", "Total");
   
      for (LineItem item : items)
      {  
         r = r + item.format() + "\n";
      }
   
      r = r + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());
   
      return r;
   }

   /**
      Computes the total amount due.
      @return the amount due
   */
   private double getAmountDue()
   {  
      double amountDue = 0;
      for (LineItem item : items)
      {  
         amountDue = amountDue + item.getTotalPrice();
      }
      return amountDue;
   }
}
