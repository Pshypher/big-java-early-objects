package project_2;

public class PrimeSequence implements Sequence
{
   private int n;
   
   public PrimeSequence()
   {
      n = 2;
   }
   
   public int next()
   {
      while (!isPrime())
      {
         n++;
      }
      
      int primeNum = n++;
      return primeNum;
   }
   
   public boolean isPrime()
   {
      boolean divisible =  false;
      int divisor = 2;
      int limit = n / 2;
      while (divisor <= limit && !divisible)
      {
         if (n % divisor == 0) 
         { 
            divisible = true; 
         }
         else
         {
            divisor++;
         }
      }
      
      return !divisible;
   }
   
}