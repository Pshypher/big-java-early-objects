public class DayTester
{
    public static void main(String[] args) 
    { 
        Day  today = new Day();
        Day latterDay = today.addDays(10);
              
        // Print the number of days between today and the later date
        System.out.println("actual: " + latterDay.daysFrom(today));
        System.out.println("expected: " + 10);
    }
}
