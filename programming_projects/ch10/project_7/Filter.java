package project_7;

/**
   Describes objects that can filter other objects based on
   a given condition.
*/
public interface Filter
{
   /**
      Determines whether the object should be accepted or not.
      @param x the tested object
      @return true if the object is accepted, false otherwise
   */
   boolean accept(Object x);
   
   /**
      Counts how many objects are accepted by the filter
      @param values an array of objects whose elements are
      tested against a filter
      @param condition the filter object used to test each 
      element in the array
      @return the count of elements accepted by the filter
   */
   static int count(Object[] values, Filter condition)
   {
      int counter = 0;
      for (Object obj : values)
      {
         if (condition.accept(obj))
         {
            counter++;
         }
      }
      
      return counter;
   }
}