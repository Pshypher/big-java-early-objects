import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
   An appointment record handler handles IO operations
   of each appointment record in a file. 
*/
public class AppointmentRecordHandler
{

   private AppointmentCalendar calendar;
   
   /**
      Constructs an appointment record handler with the given
      appoinment calendar.
      @param c the appointment calendar
   */
   public AppointmentRecordHandler(AppointmentCalendar c)
   {
      calendar = c;
   }
   
   /**
      Reads each appointment record from the given file
      @param filename the file
   */
   public void readFile(String filename) throws FileNotFoundException
   {
      try (Scanner in = new Scanner(new File(filename)))
      {
         while (in.hasNextLine())
         {
            readData(in.nextLine());
         }
      }
   }
   
   /**
      Reads and extracts the details of an appointment from a given line
      @param line the line containing the details of an appointment
   */
   private void readData(String line)
   {
      final int SIZE = 3;
      
      Scanner lineScanner = new Scanner(line);
      
      String desc = lineScanner.next(); 
      String pattern = "\\/";  
      String str;
      do
      {
         str = lineScanner.next();
         if (str.split(pattern).length < SIZE) { desc = desc + " " + str; }
      }
      while (str.split(pattern).length < SIZE);
      
      LocalDate date = parseDate(str);
      LocalTime from = parseTime(lineScanner.next());
      LocalTime to = parseTime(lineScanner.next());
      Appointment appointment = new Appointment(desc, date, from, to);
      calendar.add(appointment);
   }
   
   /**
      Changes a string to a local date object
      @param dateString the date string format
      @return the local date 
   */
   private LocalDate parseDate(String dateString)
   {
      String pattern = "\\/";
      String[] fields = dateString.split(pattern);
      int year = Integer.parseInt(fields[0]);
      int month = Integer.parseInt(fields[1]);
      int day = Integer.parseInt(fields[2]);
      return LocalDate.of(year, month, day);
   }
   
   /**
      Changes a string to a local time object
      @param timeString the time string format
      @return the local time 
   */
   private LocalTime parseTime(String timeString)
   {
      String pattern = "\\:";
      String[] fields = timeString.split(pattern);
      int hour = Integer.parseInt(fields[0]);
      int minutes = Integer.parseInt(fields[1]);
      return LocalTime.of(hour, minutes);
   }
   
   /**
      Prints out all scheduled appointments to a file.
      @param filename the file
   */
   public void write(String filename) throws FileNotFoundException
   {
      try (PrintWriter out = new PrintWriter(filename))
      {
         out.print(calendar.format());
      }
   }
}