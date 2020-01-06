import java.util.Scanner;

/**
        This program finds out if the year entered is a leap year or not
*/
public class LeapYear
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
               
                System.out.print("Enter a year after 1582: ");
                int yearInt = in.nextInt();
                
                String output;
                if (yearInt < 1583)
                {
                        output = "Error: " + yearInt +
                                " does not belong to the Gregorian calendar!!";
                }
                else
                {
                        Year yearObj = new Year(yearInt);
                        if (yearObj.isLeapYear())
                                output = yearInt + " is a leap year";
                        else
                                output = yearInt + " is not a leap year";                        
                }
                
                
                System.out.print(output);                     
        }
}