import java.util.Date;

/**
    A monthly appointment is scheduled to hold a particular day of each 
    month
*/
public class Monthly extends Appointment
{   
    public boolean occursOn(int year, int month, int day)
    {
        if (day == getAppointmentDate().getDate())
        {
            schedule(year, month, day);
        }
        return day == getAppointmentDate().getDate();
    }
}