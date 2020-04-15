/**
   An article that can be purchased at its slated price
*/
public class Product
{
   private String description;
   private double price;
   private int quantity;
   
   /**
      Construct a product with the given description, at the
      specified price.
      @param aDescription description of the product
      @param cost cost of product
      @param n the quantity
   */
   public Product(String aDescription, double cost, int n)
   {
      description = aDescription;
      price = cost;
      quantity = n;
   }
   
   /**
      Gets the price of this product.
      @return the price
   */
   public double getPrice()
   {
      return price;
   }
   
   /**
      Sets the price of this product to the given value.
      @param newValue the new price
   */
   public void setPrice(double newValue)
   {
      price = newValue;
   }
   
   /**
      Gets the description of the product.
      @return the product description
   */
   public String getDescription()
   {
      return description;
   }
   
   /**
      Gets the quantity of this product
      @return the quantity
   */
   public int getQuantity()
   {
      return quantity;
   }
   
   /**
      Sets the quantity of this product to the given value
      @param amount the value for the quantity
   */
   public void setQuantity(int amount)
   {
      quantity = amount;
   }
}