import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   An email account user has an email address and a
   secret password
*/
public class User
{

   private String mailAddress;
   private String password;
   private Mailbox mailbox;
   private boolean loggedIn;
   
   /**
      Constructs a new user within an electronic mail system 
      with an email address and password
      @param address a unique email address
      @param thePassword secret string used for authentication
   */
   public User(String address, String thePassword)
   {
      mailAddress = address;
      password = thePassword;
      mailbox = new Mailbox();
      loggedIn = false;
   }
   
   /**
      Adds messages from storage to the mailbox
   */
   public void initialize() throws IOException
   {
      String filename = mailAddress.split("\\.")[0];
      try
      {
         mailbox.readMessages(mailAddress, filename);
      }
      catch (IOException exception)
      {
         PrintWriter out = new PrintWriter(filename);
      }
   }
   
   /**
      Checks whether the given and actual mail address and passwords match.
      @param address the email address 
      @param aPassword string checked against the saved password
   */
   public void authenticate(String address, String aPassword)
   {
      if (mailAddress.equals(address) && password.equals(aPassword))
      {
         loggedIn = true;
      }
   }
   
   /**
      Gets the email address
      @return the email address
   */
   public String getAddress()
   {
      return mailAddress;
   }
   
   /**
      Checks to see that the mail box is empty.
      @return true if the mailbox is empty, false otherwise
   */
   public boolean noMail()
   {
      return mailbox.getNumberOfMessages() == 0;
   }
   
   /**
      Reveals the titles of each message in the mail box
   */
   public void showMail()
   {
      System.out.println(mailbox.format());
   }
   
   /**
      Expands the content of a message at the given position
      within a mail box.
      @param pos position of the message within the mail box
   */
   public String readMessage(int pos)
   {
      return mailbox.open(pos);
   }
   
   /**
      Checks whether this user is still logged in.
      @return true if the user is logged in, false otherwise
   */
   public boolean isLoggedIn()
   {
      return loggedIn;
   }
   
   /**
      Logs this user out of the email system.
   */
   public void logout()
   {
      loggedIn = false;
   }
         
   /**
      Formats the email account details of this user 
      @return the formatted string for this user
   */
   public String format()
   {
      return mailAddress + " " + password;   
   }
   
   /**
      Allows this user to receive a message
      @param msg the message
   */
   public void receive(Message msg) throws IOException
   {
      mailbox.add(msg);
      String[] tokens = mailAddress.split("\\.");
      String filename = tokens[0];
      mailbox.printMessages(filename);  
   }
   
}