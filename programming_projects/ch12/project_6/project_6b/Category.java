/**
   Describes an airplane category which could be
   first or economy class. 
*/
public interface Category
{
   /**
      Adds a passenger with the given seating preference.
      @param preference one of WINDOW, CENTER, or AISLE
      @return true if the passenger was added, false otherwise
   */
   boolean addPassenger(int preference);
   
   /**
      String representation of an airplane category. 
      @return formatted string representing occupied and 
      unoccupied seats within this category
   */
   String format();
}