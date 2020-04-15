import java.util.Date;

/**
   A one time appoinment occurs once on the scheduled date. 
*/
public class OneTime extends Appointment
{
   public OneTime(String details, int year, int month, int day)
   {
      super(details, year, month, day);
   }
}