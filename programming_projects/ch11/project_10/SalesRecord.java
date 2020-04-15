import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

/**
   This class reads records from a file with the following format
         clientName1;serviceType1;amount1;date1
         clientName2;serviceType2;amount2;date2
         ...
*/
public class SalesRecord
{ 
   public ArrayList<HotelService> serviceRecords;
   
   public SalesRecord()
   {
      serviceRecords = new ArrayList<HotelService>();
   }
   
   /**
      Reads each sales record from a file.
      @param in the input stream
   */
   public void read(Scanner in) throws BadFileFormatException
   {
      while (in.hasNextLine())
      {
         Scanner recordScanner = new Scanner(in.nextLine());
         recordScanner.useDelimiter(";");
         
         String name = recordScanner.next();
         
         if (!recordScanner.hasNext()) 
         {
            throw new BadFileFormatException("Missing field: type");
         }
         String type = recordScanner.next();
         
         if (!recordScanner.hasNext()) 
         {
            throw new BadFileFormatException("Service charge expected");
         }
         String token = recordScanner.next();
         
         if (!recordScanner.hasNext()) 
         {
            throw new BadFileFormatException("Date value expected");
         }
         String dateString = recordScanner.next();
            
         double amount = parse(token);
         LocalDate date = toDate(dateString);
         
         Transaction t = new Transaction(name, amount, date);
         process(type, t); 
      }
   }
   
   /**
      Extract the amount after the currency symbol
      @param token string containing currency symbol and value
      @return numeric value of the amount
   */
   private double parse(String token)
   {
      double amount = Double.parseDouble(token.substring(1));
      return amount;
   }
   
   /**
      Convert the date string to a more appropriate date object
      @param dateString string representing the date
      @return the date object
   */
   private LocalDate toDate(String dateString) throws BadFileFormatException
   {
      Scanner dateScanner = new Scanner(dateString);
      dateScanner.useDelimiter("\\.");
      
      if (!dateScanner.hasNextInt())
      {
         throw new BadFileFormatException("Missing field: day");
      }
      int day = dateScanner.nextInt();
      
      if (!dateScanner.hasNextInt())
      {
         throw new BadFileFormatException("Missing field: month");
      }
      int month = dateScanner.nextInt();
      
      if (!dateScanner.hasNextInt())
      {
         throw new BadFileFormatException("Missing field: year");
      }
      int year = dateScanner.nextInt();
      
      return LocalDate.of(year, month, day);
   }
   
   /**
      Adds a transaction record to this sales record
      @param type the type of service rendered
      @param t the transaction record
      
   */
   private void process(String type, Transaction t)
   {
      HotelService s = find(type);
      if (s == null) 
      {
         s = new HotelService(type);
         serviceRecords.add(s);
      }
      
      s.add(t);
   }
   
   /**
      Gets the record for the hotel service with the type specified
      @param type the type of hotel service
   */
   private HotelService find(String type)
   {
      HotelService s = null;
      
      boolean found = false;
      for (int i = 0; i < serviceRecords.size() && !found; i++)
      {
         if (serviceRecords.get(i).getServiceType().equals(type))
         {
            s = serviceRecords.get(i);
            found = true;  
         }
      }
      
      return s;
   }
   
   public void write() throws FileNotFoundException
   {
      for (HotelService s : serviceRecords)
      {
         String type = s.getServiceType();
         PrintWriter out = new PrintWriter(type + ".txt");
         System.out.printf("Writing to %s.txt\n", type);
         s.write(out);
         out.close();
      }
   }
}