import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
   A mailer composes and sends out mail to recipient(s)
*/
public class Mailer
{
   private String sender;
   private ArrayList<Recipient> recipients;
   
   /**
      Constructs a mailer for the given company.
      @param source name of company using this mailer
   */
   public Mailer(String source)
   {
      sender = source;
      recipients = new ArrayList<Recipient>();
   }
   
   /**
      Reads a given file containing field values for each recipient,
      whose format is
      title1 lastname1 street1 city1 state1  zip1 
      title2 lastname2 street2 city2 state2  zip2 
      ...
      @param filename the name of the file
   */
   public void readFile(String filename) throws FileNotFoundException
   {
      Scanner in = new Scanner(new File(filename));
      while (in.hasNext())
      {
         String title = in.next();
         String lastName = in.next();
         String firstName = in.next();
         String street = readData(in);
         String city = in.next();
         String state = in.next();
         String zip = in.next();
         recipients.add(new Recipient(title, lastName, firstName,
            street, city, state, zip));
      }
      in.close();
   }
   
   /**
      Extracts the street address from an input record
      @param in the input stream
      @return the street
   */
   private String readData(Scanner in)
   {
      String street = "";
      in.useDelimiter("");
      in.next();
      char ch = in.next().charAt(0);
      boolean done = false;
      while (!done)
      {
         ch = in.next().charAt(0);
         if (ch == '"')
         {
            done = true;
         }
         else
         {
            street = street + ch;
         }
      }
      
      in.useDelimiter("\\s+");
      return street;
   }
   
   /**
      Gets the details of the next recipient in the list whose mail 
      is to be composed.
      @return the next recipient
   */
   public Recipient nextRecipient()
   {
      return recipients.remove(0);
   }
   
   /**
      Checks if there is still a recipient left in the list.
      @return true of there is still a recipient left, false otherwise
   */
   public boolean hasNextRecipient()
   {
      return recipients.size() > 0;
   }
   
   /**
      Prints out the personalized mail in HTML output file format.
      @param r the recipient
      @param msg the message
   */
   public void printMail(Recipient r, Message msg) throws FileNotFoundException
   {
      Template t = new Template(sender, r);
      t.insert(msg);
      PrintWriter out = new PrintWriter(r.id() + ".html");
      out.print(t.format());
      out.close();
   }
}