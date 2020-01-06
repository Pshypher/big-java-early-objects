import java.util.Scanner;

/**
        This program using the temperature of water to checks if water
        is solid, liquid or gas 
*/
public class Water
{
   public static void main(String[] args)
   {
      // Constants
      final double FREEZING_POINT_C = 0;
      final double BOILING_POINT_C = 100;
      final double DELTA_TEMP_FT = 1000.0;      // Altitude in feet that causes a unit drop in the 
                                                // temperature of boiling water
      final double DELTA_TEMP_M = 300.0;        // The altitude that causes a drop in temperature
                                                // for the boiling point of water in unit meter
                
      // Construct an object of the Scanner class
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a value for the temperature: ");
      double temperature = in.nextDouble();
                                        
      System.out.print("Enter the measurement of the altitude: ");                        
      double altitude = in.nextDouble();
                                
      System.out.print("Enter the unit of the altitude " 
         + "(m for unit meter, ft for feet): ");
      String unit = in.next();
                               
      double bolingPoint;
      if (unit.equalsIgnoreCase("m"))
      {
         bolingPoint = BOILING_POINT_C - altitude *
            1 / DELTA_TEMP_M;
         String state;
         if (temperature <= FREEZING_POINT_C)
         {
            state = "solid ice";
         }
         else if (temperature >= bolingPoint)
         {
            state = "gaseous steam";
         }
         else
         {
            state = "liquid";
         }
         System.out.println("Water is " + state);
      }
      else
      {
         bolingPoint = BOILING_POINT_C - altitude *
            1 / DELTA_TEMP_FT;
         String state;
         if (temperature < FREEZING_POINT_C)
         {
            state = "solid ice";
         }
         else if (temperature > bolingPoint)
         {
            state = "gaseous steam";
         }
         else
         {
            state = "liquid";
         }
         System.out.println("Water is " + state);
      }
   }               
}