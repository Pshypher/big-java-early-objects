/**
   A recipient has attributes used to address them accordingly
   in a personalized mail
*/
public class Recipient
{
   private String title;
   private String lastName;
   private String firstName;
   private String street;
   private String city;
   private String state;
   private String zip;
   
   /**
      Constructs a recipient for a mail with the given title, last and
      first names, P.O. box number, and address.
      @param aTitle the recipient title
      @param aLastName last name of recipient
      @param aFirstName first name of recipient
      @param aStreet the street
      @param aCity the city
      @param aState the two-letter state code
      @param aZip the ZIP postal code
   */
   public Recipient(String aTitle, String aLastName, String aFirstName,
      String aStreet, String aCity, String aState, String aZip)
   {
      title = aTitle;
      lastName = aLastName;
      firstName = aFirstName;
      street = aStreet;
      city = aCity;
      state = aState;
      zip = aZip;
   }
   
   /**
      Formats the title and names of this recipient
      @return the recipient title and names
   */
   public String names()
   {
      return title + " " + lastName + " " + firstName;
   }
   
   /**
      Creates a unique entry for the recipient address combinining the
      zip and two-letter state code.
      @return a string comprised of the zip and state code
   */ 
   public String id()
   {
      return zip + state;
   }  

   /**
      Formats the address.
      @return the address as a string with two lines
   */
   public String address()
   {  
      return "<addr>" + street + "<br />" + city
            + ", " + state + " " + zip + "</addr>";
   }
}