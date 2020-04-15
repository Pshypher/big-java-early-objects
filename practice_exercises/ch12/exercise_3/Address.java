/**
   Describes a mailing address.
*/
public class Address
{  
   private String name;
   private String street;
   private String city;
   private String state;
   private String zip;

   /**
      Constructs a mailing address. 
      @param aName the recipient name
      @param aStreet the street
      @param aCity the city
      @param aState the two-letter state code
      @param aZip the ZIP postal code
   */
   public Address(String aName, String aStreet,
         String aCity, String aState, String aZip)
   {  
      name = aName;
      street = aStreet;
      city = aCity;
      state = aState;
      zip = aZip;
   }
   
   /**
      Gets the recipient name
      @return name of the recipient 
   */  
   public String getName()
   {
      return name;
   }
   
   /**
      Gets the street of this address
      @return the street
   */
   public String getStreet()
   {
      return street;
   }
   
   /**
      Gets the city within this address
      @return the city 
   */
   public String getCity()
   {
      return city;
   }
   
   /**
      Gets the state of this address
      @return the state
   */
   public String getState()
   {
      return state;
   }
   
   /**
      Get the zip code within this address
      @return the postal code
   */
   public String getZipCode()
   {
      return zip;
   }
}

