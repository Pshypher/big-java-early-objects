import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTester 
{
    public static void main(String[] args)
    {
        GregorianCalendar today = new GregorianCalendar();
        today.add(Calendar.DAY_OF_MONTH, 10);
        int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
        
        System.out.println("The day of the month is " + dayOfMonth);
        System.out.println("The day of the week is " + dayOfWeek);  
    }
}