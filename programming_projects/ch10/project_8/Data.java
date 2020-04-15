package project_8;

public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of objects
      @param meas the measurer for the objects
      @param filter the filter of the objects
      @return the average of the measures of accepted objects
   */
   public static double average(Object[] objects, Measurer meas,
      Filter condition)
   {
      Object[] values = Filter.retainAll(objects, condition);
      
      double sum = 0;
      for (Object obj : values)
      {
         sum = sum + meas.measure(obj);
      }
      
      if (values.length > 0) 
      { 
         return sum / values.length; 
      }
      else 
      { 
         return 0;
      }
   }
}