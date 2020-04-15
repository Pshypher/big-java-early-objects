package project_3;

public class MySequence implements Sequence
{
   private static final int[] populations; 
         
   private int n;
   
   static
   {
      populations = new int[]
         { 
            1420062022, 1368737513, 329093110, 269536482, 212392717,
            204596442, 200962417, 168065920, 143895551, 132328035,
            126854745, 110135635, 108106310, 101168745, 108106310,
            101168745, 97429061, 86727573, 82961805, 82820766, 82438639,
            69306160, 66959016, 65480710, 60913557, 59216525, 58065097,
            54336138, 52214791, 51339238, 49849818, 46441049, 45711874,
            45101781, 43795220, 42679018, 42514094, 40412299, 38028278,
            37279811, 37209007, 36635156, 34140662, 32933835, 32807368,
            32779868, 32454455, 31787566, 31408823, 30096970
         };
   }
   
   public int next()
   {
      int size;
      if (!(n < populations.length))
      {
         size = 0;
      }
      else
      {
         size = populations[n];
         n++;
      }
      
      return size;
   }
   
   public boolean hasNext()
   {
      return (n + 1) < populations.length;
   }
}