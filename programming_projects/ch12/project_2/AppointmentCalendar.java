import java.time.LocalDate;
import java.util.ArrayList;

/**
   An appointment calendar contains entries for both canceled and
   scheduled appointments
*/
public class AppointmentCalendar
{

   private ArrayList<Appointment> appointments;
   
   /**
      Constructs an appointment calendar with no appointments
   */
   public AppointmentCalendar()
   {
      appointments = new ArrayList<Appointment>();
   }
   
   /**
      Adds an appointment to this calendar.
      @param a the appointment to be added
      @return true if the appointment was added, false otherwise
   */
   public boolean add(Appointment a)
   {
      boolean added = false;
      String desc = a.getDescription();
      if (contains(desc))
      {
         added = false;  
      }
      else
      {
         added = appointments.add(a);
      }
      
      return added;
   }
   
   /**
      Cancels an appointment with the given description
      @param desc the appointment description
      @return true if the appointment was found and canceled, 
      false otherwise
   */
   public boolean cancel(String desc)
   {
      boolean found = false;
      int i = 0;
      while (!found && i < appointments.size())
      {
         Appointment a = appointments.get(i);
         if (desc.equals(a.getDescription()))
         {
            a.cancel();
            found = true;
         }
         else
         {
            i++;
         }
      }
      
      return found; 
   }
   
   /**
      Removes an appointment with the given description from this 
      appointment calendar.
      @param desc the appointment description
      @return true if the appointment with the description was removed,
      otherwise false
   */
   public boolean remove(String desc)
   {
      boolean removed = false;
      int i = 0;
      while (!removed && i < appointments.size())
      {
         Appointment a = appointments.get(i);
         if (a.getDescription().equals(desc) && a.isCanceled())
         {
            removed = appointments.remove(a);
         }
         else
         {
            i++;
         }
      }
      
      return removed;
   }
   
   /**
      Formats this appointment calendar
      @return formatted string of this calendar
   */
   public String format()
   {
      String out = "";
      for (Appointment a : appointments)
      {
         out = out + String.format("%s\n", a.format());
      }
      
      return out;
   }
   
   /**
      Formats the details of the appointments occuring on a
      particular date
      @param date the date
      @return formatted string of appointments occuring on the
      given date
   */
   public String format(LocalDate date)
   {
      String out = "";
      for (Appointment a : appointments)
      {
         if (a.getDate().equals(date))
         {
            out = out + String.format("%s\n", a.format());
         }
      }
      
      return out;
   }
   
   /**
      Checks if there is an appointment with the given description
      within this appointment calendar.
      @param desc the description
      @return true if there is such an appointment, false otherwise
   */
   private boolean contains(String desc)
   {
      boolean found = false;
      for (int i = 0; i < appointments.size() && !found; i++)
      {
         Appointment a = appointments.get(i);
         if (desc.equals(a.getDescription()))
         {
            found = true;
         }
      }
      
      return found;
   }
}