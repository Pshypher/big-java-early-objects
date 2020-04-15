import java.util.Scanner;

/**
        This program reads two times in military format (0900, 1730)
        and prints the number of hours and minutes between the two times.
*/
public class MilitaryTime
{
        public static void main(String[] args)
        {
                final int HOURS_PER_DAY = 24;
                final int DIVISOR = 100; 
                final int MINUTES_PER_HOUR = 60;
                
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter the first time: ");
                int first = in.nextInt();
                System.out.print("Please enter the second time: ");
                int second = in.nextInt();
                
                int hourA = first / DIVISOR;
                int hourB = second / DIVISOR;
                int minutesA = first % DIVISOR + hourA * MINUTES_PER_HOUR;
                int minutesB = second % DIVISOR + hourB * MINUTES_PER_HOUR; 
                int timeDifference = (HOURS_PER_DAY * MINUTES_PER_HOUR  + minutesB - minutesA) % 
                                        (HOURS_PER_DAY * MINUTES_PER_HOUR);
                int hour = timeDifference / MINUTES_PER_HOUR;
                int minutes = timeDifference % MINUTES_PER_HOUR;
                
                System.out.println(hour + " hours " + minutes + " minutes"); 
        }
}