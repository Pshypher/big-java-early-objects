/**
    A world clock tells the current time in other time zones relative to the
    user's location using a time offset.
*/
public class WorldClock extends Clock
{

    private int offset;
    
    /**
        Construct a clock some time-zones away from the current
        location
    */
    public WorldClock(int timeOffset)
    {
        offset = timeOffset;
    }
    
    public String getHours()
    {
        final int LARGEST_DECIMAL_VALUE = 9;
        
        int hour = Integer.parseInt(super.getHours());
        hour = hour + offset;
        String hourString = (hour <= LARGEST_DECIMAL_VALUE) ?
            "0" + hour : "" + hour;
            
        return hourString;
    }
}