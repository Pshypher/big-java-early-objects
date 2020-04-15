import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   An airplane has an in-built report system that lists the charges 
   and orders in both the front and rear
*/
public class Airplane
{
   public static final int FRONT = 1;
   public static final int REAR = 2;
   
   private Section front;
   private Section rear;
   
   /**
      Constructs an airplane of two seperate sections, the
      front and the rear.
   */
   public Airplane()
   {
      front = new Section(5, 4);
      rear = new Section(15, 6);
   }
   
   /**
      Reads a file containing items offered in this airplane
      of the following format.
      Section1 Name1 Cost1
      Section2 Name2 Cost2
      ...
      @param filename the name of the file
   */
   public void readFile(String filename) throws FileNotFoundException
   {
      try (Scanner in = new Scanner(new File(filename)))
      {
         while (in.hasNext())
         {
            int section = in.nextInt();
            String name  = in.next();
            double price = in.nextDouble();
            if (section == FRONT) 
            {
               front.addItem(new Item(name, price));
            }
            else if (section == REAR)
            {
               rear.addItem(new Item(name, price));
            }
            else
            {
               front.addItem(new Item(name, price));
               rear.addItem(new Item(name, price));
            }
         }
      }
   }
   
   /**
      Generates passengers at random positions within this airplane
      and makes random orders for each pasenger
   */
   public void simulate()
   {
      final int LIMIT = 5;
      
      front.addPassengers();
      front.generate(LIMIT);
      rear.addPassengers();
      rear.generate(LIMIT);
   }
   
   /**
      Generates the report for the charges accrued per seat and 
      the number of each type of item ordered.
   */
   public String report()
   {
      return front.formatChargesPerSeat() + "\n" 
         + rear.formatChargesPerSeat() + "\n\n"
         + front.formatQuantityPerItemOrdered() + "\n"
         + rear.formatQuantityPerItemOrdered();           
   }
}