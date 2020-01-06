import java.util.Scanner;

/**
   This program computes Fibonacci numbers using a recursive method.
*/ 
public class RecursiveFibAuxArray
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
      long[] a = new long[n];
      return fib(n, a);
   }
   
   /**
      Computes a Fibonacci number using a given auxillary array to speed
      up the recursive approach.
      @param n an integer
      @param a an array of already calculated fibonacci numbers
      @return the nth Fibonacci number
   */
   public static long fib(int n, long[] a)
   {
      fibCount++;
      
      int i = n - 1;
      if (n <= 2) { 
         return 1; }
      else 
      {
         long oldValue;
         long olderValue;
         
         if (a[i - 1] > 0) {  oldValue = a[i - 1]; }
         else { oldValue = fib(n - 1, a); }
         
         if (a[i - 2] > 0) { olderValue = a[i - 2]; }
         else { olderValue = fib(n - 2, a); }
         
         a[i] = oldValue + olderValue;
         return a[i];
      }
   }
   
}
