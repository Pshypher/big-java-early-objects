import java.util.Scanner;
/**
        This program displays the horoscopes of programmers
        belonging to different astrological signs
*/
public class Horoscope
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter your birthday (month and day): ");
                String birthdate = in.nextLine();
                
                int whitespace = birthdate.indexOf(" ");
                String monthStr = birthdate.substring(0, whitespace);
                int month = Integer.parseInt(monthStr);
                String dateStr = birthdate.substring(whitespace + 1);
                int day = Integer.parseInt(dateStr);
                
                Date date = new Date(month, day);
                System.out.printf("%s - %s\n", date.getAstrologicalSign(),
                        date.getFortune()); 
        }
}