/**
   Describes an item which is either a drink or a snack
   with a name and a price.
*/
public class Item
{
   private String name;
   private double price;
   
   /**
      Constructs an item with a name and price
      @param aName the name
      @param aPrice the price
   */
   public Item(String aName, double aPrice)
   {
      name = aName;
      price = aPrice;
   }
   
   /**
      Gets the price of this item.
      @return the price
   */
   public double getPrice()
   {
      return price;
   }
   
   /**
      Format this item.
      @return formatted string of this item
   */
   public String format()
   {
      return String.format("%-10s $%.2f", name, price);
   }
   
   public boolean equals(Object otherObject)
   {
      if (otherObject == null) { 
         return false; }
      if (getClass() != otherObject.getClass()) { 
         return false; }
      
      Item other = (Item) otherObject;
      return name.equals(other.name) && price == other.price;
   }
}
