import java.time.Instant;

/**
    A clock tells the current time in hours and minutes.
*/
public class Clock
{
    private String datetime;
    
    /**
        Constructor of a clock with the current date and time at
        the user's location
    */
    public Clock()
    {
        datetime = Instant.now().toString();;
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
        return getHours() + ":" + getMinutes();
    }
}
