import java.util.Scanner;

/**
   A unique collection of names.
*/
public class NamesSet
{
   private String[] names;
   private int namesSize;
   
   /**
      Constructs an empty collection of names with the given size
      @param capacity maximum names allowed
   */
   public NamesSet(int capacity)
   {
      names = new String[capacity];
      namesSize = 0;
   }
   
   /**
      Get the name within a record.
      @param in the input stream
   */
   public void process(Scanner in)
   {
      String name = in.next();
      int count = in.nextInt();
      double percent = in.nextDouble();
      
      add(name);
   }
   
   /**
      Adds the given name to this collection
      @param name the baby name
   */
   private void add(String name)
   {
      if (namesSize < names.length && !contains(name))
      {
         names[namesSize] = name;
         namesSize++;
      }  
   }
   
   /**
      Gets the names common in this collection and another
      @param other a collection of names
      @return names common in both sets
   */
   public void intersection(NamesSet other)
   {  
      for (int i = 0; i < other.namesSize; i++)
      {
         if (contains(other.names[i]))
         {
            System.out.println(other.names[i]);   
         }
      }
   }
   
   /**
      Checks whether the name appears within this unique
      collection of names
      @param 
   */
   private boolean contains(String name)
   {
      boolean found = false;
      for (int i = 0; i < namesSize && !found; i++)
      {
         if (names[i].equals(name)) { found = true; } 
      }
      
      return found;
   }
}