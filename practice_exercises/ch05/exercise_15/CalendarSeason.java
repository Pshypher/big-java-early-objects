import java.util.Scanner;

/**
        This program displays the season of the date entered for
        each calendar year.
*/
public class CalendarSeason
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a month of the year (between 1 and 12): ");
                int month = in.nextInt();
                System.out.print("Please enter a date for the month previously entered: ");
                int day = in.nextInt();
                
                Date date = new Date(month, day);
                String season = date.getSeason();
                
                System.out.println("Season: " + season);
        }
}