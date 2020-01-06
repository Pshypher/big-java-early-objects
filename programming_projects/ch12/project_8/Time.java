/**
   A time is measured in hours and minutes.
*/
public class Time
{
   private int hour;
   private int minutes;
   
   /**
      Constructs a time at the given hour and minute.
      @param hr the hour
      @param mins the minutes
   */
   public Time(int hr, int min)
   {
      hour = hr;
      minutes = min;
   }
   
   /**
      Gets the hour
      @return the hour
   */
   public int getHour()
   {
      return hour;
   }
   
   /**
      Gets the minute
      @return the minute
   */
   public int getMinutes()
   {
      return minutes;
   }
   
   /**
      Formats this time.
      @return formatted time string
   */
   public String format()
   {
      return String.format("%02d:%02d", hour, minutes);
   }
   
   public boolean equals(Object otherObject)
   {
      if (otherObject == null) { 
         return false; }
      if (getClass() != otherObject.getClass()) { 
         return false; }
      
      Time other = (Time) otherObject;
      return hour == other.hour && minutes == other.minutes;  
   }
}