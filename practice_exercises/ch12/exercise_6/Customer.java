/**
   A bank customer has a number and a PIN.
*/
public class Customer
{  
   private int customerNumber;
   private int pin;

   /**
      Constructs a customer with a given number and PIN.
      @param aNumber the customer number
      @param aPin the personal identification number
   */
   public Customer(int aNumber, int aPin)
   {  
      customerNumber = aNumber;
      pin = aPin;
   }
   
   /** 
      Tests if this customer matches a customer number 
      and PIN.
      @param aNumber a customer number
      @param aPin a personal identification number
      @return true if the customer number and PIN match
   */
   public boolean match(int aNumber, int aPin)
   {  
      return customerNumber == aNumber && pin == aPin;
   }
   
   public boolean equals(Object otherObject)
   {
      if (otherObject == null) { 
         return false; }
      if (getClass().getName() != otherObject.getClass().getName())
      {
         return false;
      }
      
      Customer other = (Customer) otherObject;
      return match(other.customerNumber, other.pin);
   }
}
