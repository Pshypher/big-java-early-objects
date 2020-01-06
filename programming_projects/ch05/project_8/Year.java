/**
        The Year class depicts a calendar in which the Gregorian
        correction applies
*/
public class Year
{       
        private int year;
        
        /**
                Constructor of an object of the Year class
                @param aYear a year under the Gregorian calendar scheme
        */
        public Year(int aYear)
        {
                year = aYear;
        }
        
        /**
                Returns the Gregorian calendar year
                @return the calendar year 
        */
        public int getYear()
        {
                return year;
        }
       
        /**
                Returns true if the current year is a leap year
                @return boolean true value for a leap year
        */
        public boolean isLeapYear()
        {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                {
                        return true;
                }
                else
                {
                        return false;
                }                                
                                         
        }
}