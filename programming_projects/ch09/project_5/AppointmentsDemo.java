import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
    This program processes a list of different appointment types
    saved to and loaded from a file for persistence.
*/
public class AppointmentsDemo
{    
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner console = new Scanner(System.in);
      System.out.print("W)rite, L)oad): ");
      String input = console.nextLine();
      if (input.equals("L"))
      {
         System.out.print("File name: ");
         String filename = console.next();
         Appointment a = read(filename);
         System.out.println(a);
      }
      else if (input.equals("W"))
      {
         write();
      }
   }
   
   public static void write() throws FileNotFoundException
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Details: ");
      String desc = console.nextLine();
      
      System.out.print("Enter day, month and year: ");
      int day = console.nextInt();
      int month = console.nextInt();
      int year = console.nextInt();
      
      System.out.print("Appointment - O)neTime, D)aily & M)onthly: ");
      String type = console.next();
      Appointment appointment;
      switch (type)
      {
         case "O":
            appointment = new OneTime();
            break;
         case "D":
            appointment = new Daily();
            break;
         case "M":
            appointment = new Monthly();
            break;
         default:
            return;
      }
      
      appointment.schedule(year, month, day);
      appointment.setDescription(desc);
      System.out.print("Save as: ");
      String filename = console.next();
      appointment.save(filename); 
   }
   
   public static Appointment read(String filename) throws FileNotFoundException
   {
      Scanner in = new Scanner(new File(filename));
      String type = in.nextLine();
      Appointment appointment;
      switch (type)
      {
         case "O":
            appointment = new OneTime();
            break;
         case "D":
            appointment = new Daily();
            break;
         case "M":
            appointment = new Monthly();
            break;
         default:
            return null;
      }
      
      load(in, appointment);
      return appointment;
   }
   
   public static void load(Scanner in, Appointment a)
   {
      String description = in.nextLine();
      in.useDelimiter("-");
      int day = in.nextInt();
      int month = in.nextInt();
      int year = Integer.parseInt(in.next().trim());
      in.close();
      
      a.setDescription(description);
      a.schedule(year, month, day); 
   }
}