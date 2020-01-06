import java.util.Scanner;

/**
   This program computes Fibonacci numbers using a recursive method.
*/ 
public class RecursiveFib
{  
   public static long fibCount = 0;

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
      fibCount++;
      
      if (n <= 2) { 
         return 1; }
      else { 
         return fib(n - 1) + fib(n - 2); }
   }
}
