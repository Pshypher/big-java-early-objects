import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo
{
   public static void main(String[] args) 
   {
      // Constructs a GregorianCalendar object and prints the 
      // day and week day 100 days from today
      GregorianCalendar today = new GregorianCalendar();
      today.add(Calendar.DAY_OF_MONTH, 100);
      
      // Print the date after adding 100 days to today
      int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
      int month = today.get(Calendar.MONTH);
      int year = today.get(Calendar.YEAR);
      System.out.println(year + "-" + month + "-" + dayOfMonth);
      
      // Creates a GregorianCalendar that holds the birthdate of Dennis Ritchie
      GregorianCalendar dennisBirthday = 
         new GregorianCalendar(1941, Calendar.SEPTEMBER, 9);
      int birthDayWeek = dennisBirthday.get(Calendar.DAY_OF_WEEK);
      System.out.print("Dennis Ritchie was birthed on day ");
      System.out.print(birthDayWeek);
      System.out.println(" of the week");
      
      // Add 10000 days to the Dennis Ritchies birth date  
      dennisBirthday.add(Calendar.DAY_OF_MONTH, 10000);
      int day = dennisBirthday.get(Calendar.DAY_OF_MONTH);
      month = dennisBirthday.get(Calendar.MONTH);
      year = dennisBirthday.get(Calendar.YEAR);
      System.out.println(year + "-" + month + "-" + day);
   }
}
