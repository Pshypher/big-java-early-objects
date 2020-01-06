import java.io.FileNotFoundException;
   
   /**
   This program simulates a airplane system listing charges of the orders per
   seat and the quantity of each type of snack or drink ordered.
*/
public class AirplaneReportSimulator
{
   public static void main(String[] args)
   {
      Airplane plane = new Airplane();
      try
      {
         plane.readFile("items.txt");
      }
      catch (FileNotFoundException exception)
      {
         System.out.println("Could not open the file.");
         return;
      }
         
      plane.simulate();
      System.out.println(plane.report()); 
   }    
}