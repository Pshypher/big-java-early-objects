import java.util.Scanner;

/**
   This program computes Fibonacci numbers using an iterative method.
*/ 
public class LoopFib
{  
   public static int fibCount = 0;
   
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = in.nextInt();
   
      long f = fib(n);
      System.out.println("fib(" + n + ") = " + f);
      System.out.println("count = " + fibCount);
   }

   /**
      Computes a Fibonacci number.
      @param n an integer
      @return the nth Fibonacci number
   */
   public static long fib(int n)
   {  
      if (n <= 2) { 
         return 1; }
      else
      {
         long olderValue = 1;
         long oldValue = 1;
         long newValue = 1;
         for (int i = 3; i <= n; i++)
         {  
            newValue = oldValue + olderValue;
            olderValue = oldValue;
            oldValue = newValue;
            fibCount++;
         }
         fibCount = (n <= 2) ? 1 : fibCount + 1;
         return newValue;
      }
   }
}
