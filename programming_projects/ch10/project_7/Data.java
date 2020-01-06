package project_7;

public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of objects
      @param meas the measurer for the objects
      @param filter the filter of the objects
      @return the average of the measures of accepted objects
   */
   public static double average(Object[] objects, Measurer meas, Filter cond)
   {
      double sum = 0;
      for (Object obj : objects)
      {
         if (cond.accept(obj)) { sum = sum + meas.measure(obj); }
      }
      
      if (Filter.count(objects, cond) > 0) 
      { 
         return sum / Filter.count(objects, cond); 
      }
      else 
      { 
         return 0;
      }
   }
}