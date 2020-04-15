import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment
{

   private String description;
   private LocalDate date;
   private LocalTime start;
   private LocalTime end;
   private boolean canceled;
   
   /**
      Constructs an appointment with a description, specified date and
      time.
      @param desc the details of the appointment
      @param aDate date of the appointment
      @param from the beginning appointment time
      @param to end time of the appointment 
   */
   public Appointment(String desc, LocalDate aDate, 
      LocalTime from, LocalTime to)
   {
      description = desc;
      date = aDate;
      start = from;
      end = to;
      canceled = false;
   }
   
   /**
      Gets the description of this appointment.
      @return the appointment description
   */
   public String getDescription()
   {
      return description;
   }
   
   /**
      Gets the scheduled date for this appointment.
      @return the appointment date
   */
   public LocalDate getDate()
   {
      return date;
   }
   
   /**
      Formats the details of this appointment
      @return formatted string of this appointment
   */
   public String format()
   {
      String out = String.format("%s %4d/%02d/%02d %02d:%02d %02d:%02d",
         description, date.getYear(), date.getMonth().getValue(),
         date.getDayOfMonth(), start.getHour(), start.getMinute(),
         end.getHour(), end.getMinute());
      if (canceled) { out = out + " Canceled"; }
      
      return out;            
   }
   
   /**
      Cancels this appointment
   */
   public void cancel()
   {
      canceled = true;
   }
   
   /**
      Checks whether this appointment has been canceled.
   */
   public boolean isCanceled()
   {
      return canceled;
   }
}