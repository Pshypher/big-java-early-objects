package project_9;

public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of objects
      @param meas the measurer for the objects
      @param condition the condition of the objects
      @return the average of the measures of accepted objects
   */
   public static double average(Object[] objects, Measurer meas,
         Filter condition)
   {
      double sum = 0;
      int acceptedObjectsCount = 0;
      for (Object obj : objects)
      {
         if (!condition.reject(obj))
         {
            sum = sum + meas.measure(obj);
            acceptedObjectsCount++;
         }
      }
      
      if (acceptedObjectsCount > 0) 
      { 
         return sum / acceptedObjectsCount; 
      }
      else 
      { 
         return 0;
      }
   }
}