import java.util.InputMismatchException;
import java.util.Scanner;

/**
   This program calculates the sum of a set of floating-point numbers.
   If the user enters a value that is not a number,the user is given a 
   second chance to enter the value.
*/
public class DataSetSum 
{
   public static void main(String[] args)
   {
      int improperInputCount = 0;
      double total = 0;
      
      System.out.println("Enter a set of floating-point values: ");
      Scanner in = new Scanner(System.in);
      
      boolean done = false;
      while (!done)
      {
         try
         {
            double value = in.nextDouble();
            total = total + value;
         }
         catch (InputMismatchException exception)
         {
            System.out.println("Floating-point values expected");
            
            improperInputCount++;
            if (improperInputCount == 2) { done = true; }
            
            while (!in.hasNextDouble() && !done) 
            {
               in.next();
            } 
         }
         
         
      }
      
      System.out.println("Total: " + total);
   }
}