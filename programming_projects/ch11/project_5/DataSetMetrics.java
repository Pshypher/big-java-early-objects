import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataSetMetrics
{
   public static void main(String[] args)
   {
      boolean done = false;
      
      while (!done)
      {
         Scanner console = new Scanner(System.in);
         System.out.print("File name: ");
         String filename = console.next();
         
         try
         {
            CSVReader reader = new CSVReader();
            reader.readFile(filename);
            
            done = true;
            
            ArrayList<Integer> minutes = new ArrayList<Integer>();
            for (int i = 0; i < reader.numberOfRows(); i++)
            {
               try
               {
                  String token = reader.field(i, 3);
                  int value = Integer.parseInt(token);
                  minutes.add(value);
               }
               catch (IndexOutOfBoundsException exception)
               {
               
               }
            }
            
            System.out.println("Minimum: " + minimum(minutes));
            System.out.println("Maximum: " + maximum(minutes));
            System.out.printf("Average: %.2f\n", average(minutes));
         }
         catch (FileNotFoundException exception)
         {
            System.out.println(filename + " not found");
         }
      }   
   }
   
   private static int minimum(ArrayList<Integer> minutes)
   {
      int min = minutes.get(0);
      for (int i = 1; i < minutes.size(); i++)
      {
         if (minutes.get(i) < min)
         {
            min = minutes.get(i);
         }
      }
      
      return min;
   }
   
   private static int maximum(ArrayList<Integer> minutes)
   {
      int max = minutes.get(0);
      for (int i = 1; i < minutes.size(); i++)
      {
         if (minutes.get(i) > max)
         {
            max = minutes.get(i);
         }
      }
      
      return max;
   }
   
   private static double average(ArrayList<Integer> minutes)
   {
      double total = 0;
      for (int n : minutes)
      {
         total = total + n;
      }
      
      return total / minutes.size();
   }
}