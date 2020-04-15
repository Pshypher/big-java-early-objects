import java.time.LocalDate;

/**
   A transaction bears the name of the client, the cost
   of the service and the date it occured
*/
public class Transaction
{
   private String name;
   private double amount;
   private LocalDate date;
   
   /**
      Constructs a record with the name of the client, amount,
      and date
      @param clientName name of the client
      @param fee amount paid
      @param date date the transaction occured
   */
   public Transaction(String clientName, double fee, LocalDate date)
   {
      name = clientName;
      amount = fee;
      this.date = date;   
   }
   
   /**
      Gets the name of the client
      @return name of client
   */
   public String getName()
   {
      return name;
   }
   
   /**
      Gets the service charge.
      @return cost the service
   */
   public double getAmount()
   {
      return amount;  
   }
   
   /**
      Get the date this transaction occured.
      @return date of this trasaction
   */
   public String getDate()
   {
      String output = "%2d.%02d.%4d";
      int day = date.getDayOfMonth();
      int month = date.getMonth().getValue();
      int year = date.getYear();
      return String.format(output, day, month, year);
   }
}