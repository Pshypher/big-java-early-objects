import java.util.Date;

/**
   A monthly appointment is scheduled to occur on a particular  
   day of the month
*/
public class Monthly extends Appointment
{  
   public boolean occursOn(int year, int month, int day)
   {
      return getAppointmentDate().getDate() == day;
   }
}