package project_1;

/**
   This class analyzes the distribution of the last digit of values
   from a sequence.
*/
public class LastDigitDistribution
{
   private int[] counters;

   /**
      Constructs a distribution whose counters are set to zero.
   */
   public LastDigitDistribution()
   {
      counters = new int[10];
   }

   /**
      Processes values from this sequence.
      @param seq the sequence from which to obtain the values
      @param valuesToProcess the number of values to process
   */
   public void process(Sequence seq, int valuesToProcess)
   {
      for (int i = 1; i <= valuesToProcess; i++)
      {
         int value = seq.next();
         int lastDigit = value % 10;
         counters[lastDigit]++;
      }
   }

   /**
      Displays the counter values of this distribution.
   */
   public void display()
   {
      final int MAX_BAR_WIDTH = 40;
      
      double maxCount = getMaxCounter();
      
      for (int i = 0; i < counters.length; i++)
      {
         int width = (int) (counters[i] / maxCount * MAX_BAR_WIDTH);
         String bars = getBarString(width);   
         System.out.println(i + ": " + bars);
      }
   }
   
   /**
      Computes the count of the digit with the highest appearance in 
      this distribution.
      @return the largest count.
   */
   public double getMaxCounter()
   {
      double maxCount = counters[0];
      for (int i = 1; i < counters.length; i++)
      {
         if (counters[i] > maxCount)
         {
            maxCount = counters[i];
         }
      }
      
      return maxCount;
   }
   
   /**
      Gets the actual string used to represent each bar that depicts
      the number of times a digit appears in this distribution.
      @param barWidth the size of the bar
      @return a string of asterisks representing each bar
   */
   public String getBarString(int barWidth)
   {
      String asterisks = "";
      for (int i = 1; i <= barWidth; i++)
      {
         asterisks = asterisks + "*";
      }
      
      return asterisks;
   }
}  
