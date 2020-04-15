import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
    This program processes a list of different appointment types
    saved to and loaded from a file for persistence.
*/
public class AppointmentDemo
{    
   public static void main(String[] args)
   {  
      ArrayList<Appointment> appointments = new ArrayList<Appointment>();
      
      Scanner console = new Scanner(System.in);
      System.out.print("W)rite, L)oad): ");
      String input = console.nextLine();
      if (input.equals("L"))
      {
         System.out.print("File name: ");
         String filename = console.next();
         try 
         {
            Scanner in = new Scanner(new File(filename));
            appointments.clear();
            appointments.addAll(read(in));
            System.out.println();
            for (Appointment a : appointments) 
            {
               System.out.println(a);
            }
         }    
         catch (IOException e) 
         {
            e.printStackTrace();
            System.out.println("Cannot find the file " + filename);
         }         
      }
      else if (input.equals("W"))
      {
      
         System.out.print("Save as: ");
         String filename = console.nextLine();
         
         String prompt = "\nGive details of appointment or" + 
                           "\nPress enter to terminate: ";
         System.out.print(prompt);
         String description = console.nextLine().trim();
         while (!description.equals("")) 
         {
            System.out.print("Enter day, month and year: ");
            int day = console.nextInt();
            int month = console.nextInt();
            int year = console.nextInt();
         
            System.out.println("Appoinment");
            System.out.print("O)neTime, D)aily, M)onthly: ");
            String type = console.next().trim();
            Appointment appointment;
            switch (type.toUpperCase())
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
                  throw new IllegalArgumentException(
                              "Cannot parse the given input " + type);
            }
            
            try
            {
               appointment.schedule(year, month, day);
               appointment.setDescription(description);
               appointment.save(filename);
            }
            catch (IOException e)
            {
               e.printStackTrace();
               System.out.println("Problem with saving appointment to file " 
                                    + filename);
            }
            
            console.nextLine();
            System.out.print(prompt);
            description = console.nextLine().trim();
         }
      }           
   }
   
   public static ArrayList<Appointment> read(Scanner in)
   {
      final String ONE_TIME_APPOINTMENT = "OneTime";
      final String DAILY_APPOINTMENT = "Daily";
      final String MONTHLY_APPOINTMENT = "Monthly"; 
         
      ArrayList<Appointment> appointments = new ArrayList<Appointment>();
      
      while (in.hasNextLine())
      {
         String type = in.next();
         Appointment a;
         switch (type)
         {
            case ONE_TIME_APPOINTMENT:
               a = new OneTime();
               break;
            case DAILY_APPOINTMENT:
               a = new Daily();
               break;
            case MONTHLY_APPOINTMENT:
               a = new Monthly();
               break;
            default:
               continue; // Skip unknown appointment types
         }
      
         readLine(in, a);
         appointments.add(a);
      }
      
      in.close();
      return appointments;
   }
   
   public static void readLine(Scanner in, Appointment a)
   {
      String recordString = in.nextLine();
      
      int i = 0;
      while (!Character.isDigit(recordString.charAt(i))) { i++; }
      
      String description = recordString.substring(0, i).trim();
      String date = recordString.substring(i);
      
      Scanner dateScanner = new Scanner(date);
      dateScanner.useDelimiter("-");
      int day = dateScanner.nextInt();
      int month = dateScanner.nextInt();
      int year = Integer.parseInt(dateScanner.next().trim());
      
      a.setDescription(description);
      a.schedule(year, month, day); 
   }
}