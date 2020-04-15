import java.util.ArrayList;
import java.util.Random;

/**
   Describes an airline seat with charges acrued 
   for orders
*/
public class Seat
{
 
   private int type;
   private boolean occupied;
   private double charges;
     
   /**
      Constructs a seat at the given position
   */
   public Seat()
   {
      occupied = false;
      charges = 0;
   }
   
   /**
      Selects a drink or a snack from the list of items.
      @return the item selected by a passenger
   */
   public Item select(ArrayList<Item> items)
   {
      Random generator = new Random();
      int choice = generator.nextInt(items.size());
      Item item = items.get(choice);
      charges = charges + item.getPrice();
      return item;
   }
   
   /**
      Changes the state of this seat when it becomes occupied.
   */
   public void book()
   {
      occupied = true;
   }
   
   /**
      Checks whether this seat is empty
      @return true if this seat is empty, false otherwise.
   */
   public boolean isEmpty()
   {
      return !occupied;
   }
   
   /**
      Gets the total charge for this passenger
      @return the passengers total charge
   */
   public double getTotalCharge()
   {
      return charges;
   }
}