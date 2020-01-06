import java.util.ArrayList;

public class VoltageData
{
   private ArrayList<Double> voltages;
   
   /**
      Constructs the data set from a circuit with an empty list of voltages
   */
   public VoltageData()
   {
      voltages = new ArrayList<Double>();
   }
   
   /**
      Adds the measured voltage to this data set.
      @param v the measured voltage
   */
   public void add(double v)
   {
      voltages.add(v);
   }
   
   /**
      Calculates the rise time from V1 = 0.05 * B to V2 = 0.95 * B.
      @return the rise time
   */
   public int getRiseTime()
   {
      int lastIndex = voltages.size() - 1;
      double b = voltages.get(lastIndex);
      
      double v1 = 0.05 * b;
      double v2 = 0.95 * b;
      
      int t1 = time(v1);
      int t2 = time(v2);
      
      return t2 - t1;
   }
   
   /**
      Gets the corresponding time from the data set to the given voltage.
      @param v the voltage
   */
   private int time(double v)
   {
      final int INTERVAL = 10;
      
      int i = 0;
      int t = 0;
      while (i < voltages.size())
      {
         if (Math.abs(voltages.get(i) - v) <
            Math.abs(voltages.get(t) - v))
         {
            t = i;
         }
         i++;
      }
      
      return t * INTERVAL;
   }
}