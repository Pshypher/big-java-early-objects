public class Daily extends Appointment
{
   public Daily(String details, int year, int month, int day)
   {
      super(details, year, month, day);
   }
        
   public boolean occursOn(int year, int month, int day)
   {
      boolean daily = true;
      return daily;
   }
}