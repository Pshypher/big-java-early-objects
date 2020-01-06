import java.util.ArrayList;

/**
   This class identifies the type of a hotel service and contains
   transactions of that particular type
*/
public class HotelService
{
   private String type;
   private ArrayList<Transaction> transactions;

   /**
      Constructs a service with the given type without the details
      of previous transactions.
      @param serviceType the type of service
   */
   public HotelService(String serviceType)
   {
      type = serviceType;
      transactions = new ArrayList<Transaction>();
   }
   
   /**
      Add the specified transaction to the list of transactions.
      @param t the transaction
   */
   public void add(Transaction t)
   {
      transactions.add(t);
   }
   
   /**
      Calculates the total amount made for transactions of this type.
      @return total amount gotten from this service
   */
   public double sum()
   {
      double total = 0;
      for (Transaction t : transactions)
      {
         total = total + t.getAmount();
      }
      
      return total;
   }
   
   /**
      Get the type of this hotel service.
      @return category of this service 
   */
   public String getServiceType()
   {
      return type;
   }
}