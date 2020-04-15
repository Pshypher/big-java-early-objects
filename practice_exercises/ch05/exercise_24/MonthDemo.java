import java.util.Scanner;

/**
        This program displays the number of days in a Month
*/
public class MonthDemo
{
        public static void main(String[] args)
        {              
                //Construct an object of the Scanner class
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter a month " + 
                        "(January, February,etc.): ");
                String input = in.next();
                
                int index;
                
                if (input.equalsIgnoreCase("january"))
                {
                        index = Month.JANUARY;
                }
                else if (input.equalsIgnoreCase("february"))
                {
                        index = Month.FEBRUARY;
                }
                else if (input.equalsIgnoreCase("march"))
                {
                        index = Month.MARCH;
                }
                else if (input.equalsIgnoreCase("april"))
                {
                        index = Month.APRIL;
                }
                else if (input.equalsIgnoreCase("may"))
                {
                        index = Month.MAY;
                }
                else if (input.equalsIgnoreCase("june"))
                {
                        index = Month.JUNE;
                }
                else if (input.equalsIgnoreCase("july"))
                {
                        index = Month.JULY;
                }
                else if (input.equalsIgnoreCase("august"))
                {
                        index = Month.AUGUST;
                }
                else if (input.equalsIgnoreCase("september"))
                {
                        index = Month.SEPTEMBER;
                }
                else if (input.equalsIgnoreCase("october"))
                {
                        index = Month.OCTOBER;
                }
                else if (input.equalsIgnoreCase("november"))
                {
                        index = Month.NOVEMBER;
                }
                else if (input.equalsIgnoreCase("december"))
                {
                        index = Month.DECEMBER;
                }
                else
                {
                        index = -1;
                }
                
                Month month = new Month(index);    // Construct an object of the Month class
                
                String result;
                
                if (month.getLength() > 0)
                {
                        result = month.getLength() + " days";
                }
                else 
                {
                        result = String.format("Error: Month %s not in calendar", input);
                }
                System.out.println(result);
        }
}