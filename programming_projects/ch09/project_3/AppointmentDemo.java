import java.util.ArrayList;
import java.util.Scanner;

/**
     This program demonstrates a mixture of appointment types
     that share a set of tasks
*/
public class AppointmentDemo
{
   public static void main(String[] args)
   {
      ArrayList<Appointment> appointments = new ArrayList<Appointment>();
      
      Monthly dentist = new Monthly("see the dentist", 1998, 6, 22);
      Monthly boardMeeting = new Monthly("board meeting", 2016, 8, 23);
      OneTime conference = new OneTime("sales conference", 2004, 2, 22);
      Daily staffMeeting = new Daily("5:30pm meeting", 2016, 11, 21);
      
      appointments.add(dentist);
      appointments.add(boardMeeting);
      appointments.add(conference);
      appointments.add(staffMeeting);
      
      process(appointments);
   }
   
   /**
      Displays details of each appointment that occurs on 
      the day entered by the user.
      @param appointments
   */
   public static void process(ArrayList<Appointment> appointments)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the day, month and year: ");
      
      int day = in.nextInt();
      int month = in.nextInt();
      int year = in.nextInt();
      
      System.out.println();
      for (Appointment a : appointments)
      {
         if (a.occursOn(year, month, day))
         {
            System.out.println(a);
         }   
      } 
   }
}