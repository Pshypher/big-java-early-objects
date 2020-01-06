import java.util.Scanner;

public class TimeComparator
{
        public static void main(String[] args)
        {
                // Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                 
                System.out.print("Enter a number of hours(between 0 and 23): ");
                int hourA = in.nextInt();
                System.out.print("Enter number of minutes(between 0 and 60): ");
                int minutesA = in.nextInt();
                System.out.print("Enter another number of hours(between 0 and 23): ");
                int hourB = in.nextInt();
                System.out.print("Enter a second number of minutes(between 0 and 60): ");
                int minutesB = in.nextInt();
                 
                // Construct two objects of the Time class
                // to be compared with one another
                Time time = new Time(hourA, minutesA);
                Time another = new Time(hourB, minutesB);
                 
                if (time.compareTo(another) < 0)
                {
                        System.out.printf("%d:%02d comes before %d:%02d\n", time.getHours(), time.getMinutes()
                                , another.getHours(), another.getMinutes());
                }
                else if (time.compareTo(another) == 0)
                {
                        System.out.println("Both time in hours and minutes are the same");
                }
                else
                {
                        System.out.printf("%d:%02d comes after %d:%02d\n", time.getHours(), time.getMinutes()
                                , another.getHours(), another.getMinutes());
                }        
        }
}