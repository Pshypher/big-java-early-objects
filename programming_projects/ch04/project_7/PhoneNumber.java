import java.util.Scanner;

/**
        This program transforms a string containing a ten-digit phone number
        into a more readable string
*/

public class PhoneNumber
{
        public static void main(String[] args)
        {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Please enter the phone number (e.g. 4155551212) "
                        + "you wish to format: ");
                String phoneNumber = in.next();
                
                // Construct the area code and concatenate with the 
                // personal phone number of an individual 
                String areaCode = "(" + phoneNumber.substring(0, 3) + ")";
                String personalNumber = phoneNumber.substring(3, 6) + "-"
                        + phoneNumber.substring(6, phoneNumber.length());
                phoneNumber = areaCode + " " + personalNumber;                        
         
                System.out.println("Phone number: " + phoneNumber);                        
                        
        }
}
