package project_5;

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
      int count = 0;
      for (Object obj : objects)
      {
         if (condition.accept(obj))
         {
            sum = sum + meas.measure(obj);
            count++;
         }
      }
      
      if (count > 0) 
      { 
         return sum / count; 
      }
      else 
      { 
         return 0;
      }
   }
}