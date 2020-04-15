import java.util.Date;

/**
   A one time appoinment includes the details of the appointment
   and its scheduled date. 
*/
public class OneTime extends Appointment
{    
   public boolean occursOn(int year, int month, int day)
   {
      return getAppointmentDate().equals(new Date(year, month, day));
   }
}