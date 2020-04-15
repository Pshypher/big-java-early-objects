import java.util.Date;

/**
   A monthly appointment is scheduled to occur on a particular  
   day of a particular month
*/
public class Monthly extends Appointment
{
   public Monthly(String details, int year, int month, int day)
   {
      super(details, year, month, day);
   }
   
   public boolean occursOn(int year, int month, int day)
   {
      return getAppointmentDate().getDate() == day;
   }
}