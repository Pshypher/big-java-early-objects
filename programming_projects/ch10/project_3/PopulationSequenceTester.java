package project_3;

public class PopulationSequenceTester
{      
   public static void main(String[] args)
   {
      Sequence seq = new MySequence();
      
      System.out.println("Population: " + seq.next());
      System.out.println("Expected: 1420062022");
      
      System.out.println(seq.hasNext());
      System.out.println("Expected: true");
      
      skip(seq, 48);
      
      System.out.println("Population: " + seq.next());
      System.out.println("Expected: 30096970");
      
      System.out.println(seq.hasNext());
      System.out.println("Expected: false");
   }
   
   public static void skip(Sequence seq, int amount)
   {
      for (int i = 1; i <= amount; i++)
      {
         seq.next();
      }
   }  
}
