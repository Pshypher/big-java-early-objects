/**
    A daily appointment occurs every day and it includes 
    details of such appointment
*/
public class Daily extends Appointment
{
       
    public boolean occursOn(int year, int month, int day)
    {
        schedule(year, month, day);
        return true;
    }
}