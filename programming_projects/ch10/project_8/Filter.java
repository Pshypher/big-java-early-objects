package project_8;

import java.util.Arrays;

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
      Retains all objects accepted by the filter and removes the
      others.
      @param values an array of objects
      @param condition the filter object
      @return an array of accepted values
   */
   static Object[] retainAll(Object[] values, Filter condition)
   {
      for (int i = 0; i < values.length; i++)
      {
         if (!condition.accept(values[i]))
         {
            for (int j = i + 1; j < values.length; j++)
            {
               values[j - 1] = values[j];
            }
            values = Arrays.copyOf(values, values.length - 1);
         }  
      }
      
      return values;
   }
}