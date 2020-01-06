import java.util.ArrayList;
import java.util.Random;
 
/**
   Describes a section within an airplane. 
*/
public class Section
{
   private Seat[][] layout;
   private ArrayList<Item> orders;
   private ArrayList<Item> items;
   private Random generator;
    
    /**
      Constructs an airplane section with the given layout.
      @param rows number of row within this section
      @param seatsPerRow number of seats in each row
    */
   public Section(int rows, int seatsPerRow)
   {
      layout = new Seat[rows][seatsPerRow];
      for (int i = 0; i < rows; i++)
      {
         for (int j = 0; j < seatsPerRow; j++)
         {
            layout[i][j] = new Seat(); 
         }
      }
      
      orders = new ArrayList<Item>();
      items = new ArrayList<Item>();
      generator = new Random();
   }
    
    /**
      Adds the given item to the items offered in this section.
      @param item the offered item
    */  
   public void addItem(Item item)
   {
      items.add(item);
   }
   
   /**
      Randomly adds passenger to this section.
   */
   public void addPassengers()
   { 
      ArrayList<Seat> seats = new ArrayList<Seat>();  // Empty seats
      for (int i = 0; i < layout.length; i++)
      {
         for (int j = 0; j < layout[0].length; j++)
         {
            seats.add(layout[i][j]);
         }
      }
      
      int passengers = generator.nextInt(layout.length *
         layout[0].length);
         
      
      for (int i = 1; i <= passengers; i++)
      {
         int choice = generator.nextInt(seats.size());
         Seat s = seats.remove(choice);
         s.book();
      }
   }
   
   /**
      Generates a list of the charges accrued per seat 
      in a section, ordered by rows.
   */
   public String formatChargesPerSeat()
   {
      String r = "";
      for (int i = 0; i < layout.length; i++)
      {
         r = r + "Row " + i + ": ";
         for (int j = 0; j < layout[0].length; j++)
         {
            Seat s = layout[i][j];
            r = r + "$" + String.format("%.2f", s.getTotalCharge()) + " ";
         }
         r = r + "\n";
      }
      
      return r;
   }
   
   /**
      Generates a report of the total number of items of
      each type ordered in a section.
   */
   public String formatQuantityPerItemOrdered()
   {
      String r = "";
      while (orders.size() > 0)
      {
         Item anItem = orders.get(0);
         int quantity = count(anItem);
         r = r + anItem.format() + " " + quantity + "\n";
      }
      
      return r;
   }
   
   /**
      Counts the number of orders generated for a given item.
      @param anItem the item
      @return the number of orders 
   */
   private int count(Item anItem)
   {
      int n = 0;
      int i = 0;
      while (i < orders.size())
      {
         if (anItem.equals(orders.get(i)))
         {
            orders.remove(i);
            n++;
         }
         else
         {
            i++;
         }
      }
      
      return n;
   }
   
   /**
      Randomly generates orders for a passenger on each occupied seat.
      @param limit the maximum number of items that can be ordered
   */
   public void generate(int limit)
   {
      for (int i = 0; i < layout.length; i++)
      {
         for (int j = 0; j < layout[0].length; j++)
         {
            Seat s = layout[i][j];
            if (!s.isEmpty())
            {
               int numberOfOrders = generator.nextInt(limit);
               for (int n = 1; n <= numberOfOrders; n++)
               {
                  orders.add(s.select(items));
               }
            }
         }
      }
   }
}