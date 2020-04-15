public class DatePrinter 
{ 
   public static void main(String[] args) 
   { 
      // Construct a Day object, the 28th day of february 
      // in the present year 2017
      Day feb28 = new Day(2017, 02, 28);
      Day nextDay = feb28.addDays(1);
      System.out.println(nextDay.toString());
      System.out.println("Expected: 2017-03-01");
      
      // Construct Day objects, still the 28th day of february  
      // the next three years after the current year
      feb28 = new Day(2018, 02, 28);   // year 2018
      nextDay =feb28.addDays(1);
      System.out.println(nextDay);
      System.out.println("Expected: 2018-03-01");
      
      // year 2019
      feb28 = new Day(2019, 02, 28);
      nextDay =feb28.addDays(1);
      System.out.println(nextDay.toString());
      System.out.println("Expected: 2019-03-01");
      
      // year 2020
      feb28 = new Day(2020, 02, 28);
      nextDay =feb28.addDays(1);
      System.out.println(nextDay.toString());
      System.out.println("Expected: 2020-02-29"); 
   }  
}
