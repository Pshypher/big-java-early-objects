import java.util.ArrayList;
import java.util.Scanner;

/**
   An appointment book holds a list of different appointment types
   scheduled to take place on several dates.
*/
public class AppointmentDemo
{    
   public static void main(String[] args)
   {
      ArrayList<Appointment> scheduler = new ArrayList<Appointment>();
      Scanner in = new Scanner(System.in);
      
      String text = "Add appoinment, display scheduled appointments, or quit";
      String prompt = "A)dd, D)isplay, Q)uit: ";
      boolean done = false;
      
      while (!done)
      {
         System.out.println(text);
         System.out.print(prompt);
         String input = in.next();
         if (input.equals("A"))
         {
            write(scheduler);
         }
         else if (input.equals("D"))
         {
            process(scheduler);  
         }
         else if (input.equals("Q"))
         {
            done = true;
         }
      }       
   }
   
   public static void write(ArrayList<Appointment> scheduler)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Description: ");
      String desc = in.nextLine();
      
      System.out.print("Enter date, month and year: ");
      int day = in.nextInt();
      int month = in.nextInt();
      int year = in.nextInt();
      
      System.out.print("Appointment Type - O)neTime, D)aily, M)onthly: ");
      String type = in.next();
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
      
      appointment.setDescription(desc);
      appointment.schedule(year, month, day);
      scheduler.add(appointment);      
   }
   
   public static void process(ArrayList<Appointment> scheduler)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter date, month and year: ");
      int day = in.nextInt();
      int month = in.nextInt();
      int year = in.nextInt();
      
      System.out.println();
      for (Appointment a : scheduler)
      {
         if (a.occursOn(year, month, day))
         {
            System.out.println(a);
         }
      }
      System.out.println();
   }
}