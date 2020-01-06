import java.text.NumberFormat;
import java.util.Locale;

/**
   Describes a quantity of an article to purchase.
*/
public class LineItem
{  
   private int quantity;
   private Product theProduct;

   /**
      Constructs an item from the product and quantity.
      @param aProduct the product
      @param aQuantity the item quantity
   */
   public LineItem(Product aProduct, int aQuantity)
   {  
      theProduct = aProduct;
      quantity = aQuantity;
   }
   
   /**
      Computes the total cost of this line item.
      @return the total price
   */
   public double getTotalPrice()
   {  
      return theProduct.getPrice() * quantity;
   }
   
   /**
      Formats this item.
      @param widths width of each number column in the format string
      @return a formatted string of this item
   */
   public String format(int[] widths)
   {      
      final int PRECISION = 2;
       
      String out = "%-" + widths[0] + "s%-" + widths[1] + "s%-" 
         + widths[2] + "s%-" + widths[3] + "s";
   
      NumberFormat nf = NumberFormat.getInstance();
      nf.setMaximumFractionDigits(PRECISION);
      nf.setMaximumIntegerDigits(widths[1] - PRECISION - 1);
      String price = nf.format(theProduct.getPrice());
      nf.setMaximumIntegerDigits(widths[3] - PRECISION - 1);
      String total = nf.format(getTotalPrice());
      
      nf.setMaximumIntegerDigits(widths[2]);
      String theQuantity = nf.format(quantity);
      
      return String.format(out, theProduct.getDescription(), price,
         theQuantity, total);
   }
}
