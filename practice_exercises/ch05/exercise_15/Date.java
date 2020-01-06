/**
        Each day of each month in a year is placed in a season
        (Spring, Summer, Fall, or Winter)
*/
public class Date
{

        private int month;
        private int day;
        
        /**
                Constructor for Date class at a particular date of
                the specified month
                @param aMonth month of the year
                @param theDate date of the month
        */
        public Date(int aMonth, int theDate)
        {
                month = aMonth;
                day = theDate;           
        }
        
        /**
                The season the month and day falls under is returned
                @return season of the date of a calendar year
        */
        public String getSeason()
        {
                String season;
                if (month < 4)
                {
                        season = "Winter";
                }
                else if (month < 7)
                {
                        season = "Spring";
                }
                else if (month < 10)
                {
                        season = "Summer";
                }
                else 
                {
                        season = "Fall";
                }
                
                if (month % 3 == 0)
                {
                        if (day >= 21)
                        {
                                if (season.equals("Winter"))
                                {
                                        season = "Spring";
                                }
                                else if (season.equals("Spring"))
                                {
                                        season = "Summer";
                                }
                                else if (season.equals("Summer"))
                                {
                                        season = "Fall";
                                }
                                else
                                {
                                        season = "Winter";
                                }
                        }
                }
                return season;
        }
}