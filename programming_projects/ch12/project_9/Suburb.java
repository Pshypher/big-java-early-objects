import java.util.ArrayList;

/**
   A surburb is an area comprised of several streets
*/
public class Suburb
{
   private ArrayList<Street> streets;
   
   /**
      Construct a surburban scene with no streets.
   */
   public Suburb()
   {
      streets = new ArrayList<Street>();
   }
   
   /**
      Adds a street to this surburb with the given name.
      @param aName name of the street to be added
      @return true if the street was added, false otherwise
   */
   public boolean addStreet(String aName)
   {
      boolean found = false;
      for (int i = 0; i < streets.size() && !found; i++)
      {
         if (streets.get(i).getStreetName().equals(aName))
         {
            found = true;
         }
      }
      
      if (found) { 
         return false; }
      streets.add(new Street(aName));
      return true;
   }
   
   /**
      Checks if this suburb has no street
      @return true if this suburb has no street, false otherwise 
   */
   public boolean isEmpty()
   {
      return streets.size() == 0;
   }
   
   /**
      Gets a street within this suburb with the given name.
      @param aName name of the street
      @return the street
   */
   public Street select(String aName)
   {
      Street s = null;
      for (int i = 0; i < streets.size() && s == null; i++)
      {
         if (streets.get(i).getStreetName().equals(aName))
         {
            s = streets.get(i);
         }
      }
      
      return s;
   }
}