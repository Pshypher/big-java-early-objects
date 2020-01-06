import java.util.Scanner;

/**
        This program transforms numbers 1,2,3, ...,12 into corresponding month names
        January,February,March, ...,December.
*/

public class CalendarMonth
{
        public static void main(String[] args)
        {
                // Declare the constant(s)
                final String MONTHS = "January  February March    April    "
                        + "May      June     July     August   SeptemberOctober  "
                        + "November December ";
                        
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a month integer between 1 and 12: ");
                int monthNumber = in.nextInt();
                int monthIndex = (--monthNumber) * 9;
                
                String month = MONTHS.substring(monthIndex, monthIndex + 9);
                System.out.println("Month: " + month);                       
        }
}