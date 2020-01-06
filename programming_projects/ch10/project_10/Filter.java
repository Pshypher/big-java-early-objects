package project_10;

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
      Determines whether an object should be rejected if it meets
      a certain criteria.
      @param x the tested object
      @return true if the object is rejected, false otherwise
   */
   default boolean reject(Object x)
   {
      return !accept(x);
   }
   
   /**
      Yields a filter accepting the values that this filter
      rejects.
      @return a filter object
   */
   default Filter invert()
   {
      Filter condition = new InvertedAccountFilter();
      return condition;
   }
   
}