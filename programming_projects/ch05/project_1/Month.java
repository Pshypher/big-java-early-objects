/**
        A class that holds data of each month of the year
*/
public class Month
{
        public static final int JANUARY = 1;
        public static final int FEBRUARY = 2;
        public static final int MARCH = 3;
        public static final int APRIL = 4;
        public static final int MAY = 5;
        public static final int JUNE = 6;
        public static final int JULY = 7;
        public static final int AUGUST = 8;
        public static final int SEPTEMBER = 9;
        public static final int OCTOBER = 10;
        public static final int NOVEMBER = 11;
        public static final int DECEMBER = 12;
        
        private int month;
        
        /**
                Constructor for the Month class
                @param month the month of the year between 1 and 12
        */
        public Month(int month)
        {
                this.month = month;
        }
        
        /**
                Returns the number of days in the month
                @return the number of days in month    
        */
        public int getLength()
        {
                int days;
                
                if (month == JANUARY || month == MARCH || month == MAY || month == JULY
                        || month == AUGUST || month == OCTOBER || month == DECEMBER)
                {
                        days = 31;
                }
                else if (month == APRIL || month == JUNE || month == SEPTEMBER || 
                        month == NOVEMBER)
                {
                        days = 30;
                }
                else if (month == FEBRUARY)
                {
                        days = 28;
                }                
                else
                {
                        days = -1;
                }                                      
                return days;
        }                
}