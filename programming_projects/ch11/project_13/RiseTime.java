import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   Reads time and capacitor voltage values from a file and calculates
   the rise time from V1 = 0.05 * B to V2 = 0.95 * B
*/
public class RiseTime
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String filePath = "..\\..\\..\\examples\\ch11\\exercise_p_13";
      String fileName = "rc.txt";
      File file = new File(filePath + "\\" + fileName);
      Scanner in = new Scanner(file);
      
      VoltageData data = new VoltageData();
      
      while (in.hasNext())
      {
         int time = in.nextInt();
         data.add(in.nextDouble());
      }
      in.close();
      
      System.out.println("Rise time: " + data.getRiseTime());
   }
}
