import java.time.LocalDate;

public class LocalDateTester 
{
   public static void main(String[] args)
   {
      // Creates a Local Date for pi day and displays the weekday of the pi day
      LocalDate today = LocalDate.now();
      LocalDate piDay = LocalDate.of(today.getYear(), 3, 14);
      String piWeekDay =  piDay.getDayOfWeek().toString();
      System.out.println("Weekday of pi day is " + piWeekDay);
      
      /* Displays the date and week day for programmers day in the current year
         the programmmers day is the 256th day of the year, starting  
         from january 1st of the current year
      */
      LocalDate firstDay = LocalDate.of(today.getYear(), 1, 1);
      LocalDate programmersDay = firstDay.plusDays(255);
      int dayOfMonth = programmersDay.getDayOfMonth();
      String month = programmersDay.getMonth().toString();;
      int year = programmersDay.getYear();
      System.out.print(month +  " " + dayOfMonth + ", " + year);
      System.out.println(" is the date for the programmers day");
      String programmersDayWeekDay = programmersDay.getDayOfWeek().toString();
      System.out.println("Weekday of the programmers day is " 
         + programmersDayWeekDay);
      
      // Display the date and week day 10000 days earlier than today
      LocalDate former = today.minusDays(10000);
      dayOfMonth = former.getDayOfMonth();
      month = former.getMonth().toString();
      year = former.getYear();
      System.out.print(month + " " + dayOfMonth + ", " + year);
      System.out.println(" is the date 10000 days from before today");
      String weekDay =   former.getDayOfWeek().toString();
      System.out.println("Weekday 10000 days backward from today is "
         + weekDay);
   }
}