/**
        This program simulates Time on a clock 
*/
public class Time
{
        private int hour;
        private int minutes;
        
        /**
                Used to construct an object of the Time class
                @param hour the number of hours at a particular time
                @param minutes the number of minutes at a particular time
        */
        public Time(int hour, int minutes)
        {
                this.hour = hour;
                this.minutes = minutes;
        }
        
        /**
                Compares a Time object with another
                @param other an object constructed from the Time class
                @return returns either -1, 0 or 1  
        */
        public int compareTo(Time other)
        {
                if (hour < other.hour)
                {
                        return -1;
                }
                else if (hour == other.hour)
                {
                        if (minutes < other.minutes)
                        {
                                return -1;
                        }
                        else if (minutes == other.minutes)
                        {
                                return 0;
                        }
                        else
                        {
                                return 1;
                        }
                }
                else
                {
                        return 1;
                }
        }
        
        /**
                Returns the number of hours
                @return the number of hours
        */
        public int getHours()
        {
                return hour;
        }
        
        /**
                Returns the number of minutes
                @return the number of minutes
        */
        public int getMinutes()
        {
                return minutes;
        }
}