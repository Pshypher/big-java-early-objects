import java.time.Instant;

/**
    A clock tells the current time in hours and minutes.
*/
public class Clock
{
    private String datetime;
    private String alarm;
    
    /**
        Constructor of a clock with the current date and time at
        the user's location
    */
    public Clock()
    {
        datetime = Instant.now().toString();
        alarm = "";
    }
    
    /**
        Extract the hour from the current time in this clock
        @return the hour
    */
    public String getHours()
    {
        String hours = datetime.substring(11, 13);
        return hours; 
    }
    
    /**
        Get the minutes of the current time from this clock.
        @return the minutes
    */
    public String getMinutes()
    {
        String minutes = datetime.substring(14, 16);
        return minutes;
    }
    
    /**
        Get the current time in hours:minutes format
        @return the current time
    */
    public String getTime()
    { 
        String time = getHours() + ":"  + getMinutes();
        if (!alarm.isEmpty())
        {
            int alarmHour = Integer.parseInt(alarm.substring(0, 2));
            int alarmMins = Integer.parseInt(alarm.substring(3));
            int currentHour = Integer.parseInt(getHours());
            int currentMins = Integer.parseInt(getMinutes());
            if ((alarmHour == currentHour && alarmMins <= currentMins)
                || alarmHour < currentHour)
            {
                time = time + " Alarm";
                clearAlarm();
            }
        }
        
        return time;
    }
    
    /**
        Sets the time for the alarm at hr:mins
        @param hours the hour of the alarm
        @param minutes number of minutes for the alarm
    */
    public void setAlarm(int hours, int minutes)
    {
        final int LARGEST_DECIMAL_VALUE = 9;
        alarm = (hours > LARGEST_DECIMAL_VALUE) ? alarm + "" + hours 
                                                : alarm + "0" + hours;
        alarm = alarm + ":";                                                
        alarm = (minutes > LARGEST_DECIMAL_VALUE) ? alarm + "" + minutes
                                                : alarm + "0" + minutes;               
    }
    
    private void clearAlarm()
    {
        alarm = "";
    }
}
