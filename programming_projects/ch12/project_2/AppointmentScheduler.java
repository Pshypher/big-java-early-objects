import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;


public class AppointmentScheduler
{       
   public static void main(String[] args) throws FileNotFoundException
   {
      AppointmentCalendar calendar = new AppointmentCalendar();
      AppointmentRecordHandler handler = 
         new AppointmentRecordHandler(calendar);
      try
      {
         handler.readFile("appointments.txt");
      }
      catch (FileNotFoundException exception)
      {
         System.out.println("Error could not open file");
         return;
      }
      
      Scanner console = new Scanner(System.in);
      while (true)
      {
         System.out.print("A)dd, C)ancel, R)emove, D)isplay: ");
         String command = console.next();
         console.nextLine();
         switch (command)
         {
            case "A":
               System.out.print("Description: ");
               String desc = console.nextLine();
               System.out.print("Date in (year month day): ");
               int year = console.nextInt();
               int month = console.nextInt();
               int day = console.nextInt();
               LocalDate date = LocalDate.of(year, month, day);
               System.out.print("Start time in (hour minutes): ");
               int hour = console.nextInt();
               int minutes = console.nextInt();
               LocalTime start = LocalTime.of(hour, minutes);
               System.out.print("End time in (hour minutes): ");
               hour = console.nextInt();
               minutes = console.nextInt();
               LocalTime end = LocalTime.of(hour, minutes);
               String res;
               boolean added = calendar.add(new Appointment(
                  desc, date, start, end));
               if (!added)
               {
                  System.out.print("Reschedule Y)es, N)o: ");
                  command = console.next();
                  if (command.equalsIgnoreCase("Y"))
                  {
                     calendar.cancel(desc);
                     calendar.remove(desc);
                     added = calendar.add(new Appointment(desc, date, start, end));
                     res = desc + " appointment rescheduled.";
                  }
                  else
                  {
                     res = desc + " appointment was not rescheduled.";
                  }
               }
               else
               {
                  res = desc + " appointment added.";
               }
               if (added) { handler.write("appointments.txt"); }
               System.out.println("\n" + res + "\n");
               break;
            case "C":
               System.out.print("Description: ");
               desc = console.nextLine();
               if (!calendar.cancel(desc))
               {
                  System.out.println(desc + " appointment not found.");
               }
               break;
            case "R":
               System.out.print("Description: ");
               desc = console.nextLine();
               if (calendar.remove(desc))
               {
                  handler.write("appointments.txt");  
               }
               else
               {
                  System.out.println("\n" + desc +
                     " is not a canceled appointment" + "\n");
               }
               break;
            case "D":
               System.out.print("Date in (year month day): ");
               year = console.nextInt();
               month = console.nextInt();
               day = console.nextInt();
               date = LocalDate.of(year, month, day);
               System.out.println(calendar.format(date));
               break;
            default:
               System.out.println("Illegal command!");
               return;
         }
      }
   }
}