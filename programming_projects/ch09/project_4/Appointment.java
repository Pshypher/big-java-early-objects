import java.util.Date;

/**
   An appointment described by the details of the appointment. 
*/
public abstract class Appointment
{
   private String description;
   private Date date;
   
   /**
      Constructor for an appointment with neither a description 
      nor scheduled date
   */
   public Appointment()
   {
      description = "";
   }
   
   /**
      Set the description for this appointment.
      @param text sentence describing this appointment.
   */
   public void setDescription(String text)
   {
      description = text;
   }
   
   /**
      Sets the date for this appointment.
      @param year year of this appointment
      @param month month for this appointment
      @param day the date of this appointment
   */
   public void schedule(int year, int month, int day)
   {
      date = new Date(year, month, day);
   }
   
   /**
      Gets the date of this appointment
      @return the scheduled date
   */
   public Date getAppointmentDate()
   {
      return date;
   }
 
   /**
      Checks if this appointment is scheduled to hold on this given date
      @param year the year 
      @param month the month 
      @param day day within the month
      @return true if the appointment is scheduled to hold within the
      given date, false otherwise 
   */
   public boolean occursOn(int year, int month, int day)
   {
      return date.equals(new Date(year, month, day));
   }
   
   public String toString()
   {
      return getClass().getName() + "[description=" + description + "]";
   }
}