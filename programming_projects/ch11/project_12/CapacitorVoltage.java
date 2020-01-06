import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program calculates the capacitor voltage every 10 microseconds,
   writes out the time and voltage to the output file rc.txt
*/
public class CapacitorVoltage
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String filePath = "..\\..\\..\\examples\\ch11\\exercise_p_12";
      String fileName = "params.txt";
      File file = new File(filePath + "\\" + fileName); 
      Scanner in = new Scanner(file);
      
      final double B = in.nextDouble();
      final double R = in.nextDouble();
      final double C = in.nextDouble();
      
      final int START = in.nextInt();
      final int END = in.nextInt();
      final int STEPS = 100;
      
      int duration = END - START;
      int interval = duration / 100;
      
      PrintWriter out = new PrintWriter("rc.txt");
      
      for (int t = START; t <= END; t = t + interval)
      {
         double voltage = B * (1 - Math.exp(-t / (R * C)));
         out.printf("%-4d% 8.5f\n", t, voltage);
      }
      
      in.close();
      out.close();
   }
}