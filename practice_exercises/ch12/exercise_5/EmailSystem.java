import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
   Describes an electronic mail messaging system with several users
*/
public class EmailSystem
{
   private ArrayList<User> users;
   
   /**
      Default constructor for an electronic mail system with 
      no users. 
   */
   public EmailSystem()
   {
      users = new ArrayList<User>();
   }
  
   /**
      Logs in a user into this system, authencating the given
      username and password combination.
      @return the email account of the logged in user
   */
   public User login()
   {
      System.out.print("E-mail address: ");
      Scanner console = new Scanner(System.in);
      String address = console.next();
      System.out.print("Password: ");
      String password = console.next();
      
      User user = search(address);
      if (user != null) 
      {
         user.authenticate(address, password);
      }
      
      return user;
   }
   
   /**
      Adds a new user to this email system.
      @return the new user added to the system
   */
   public User signUp() throws IOException
   {
      Scanner console = new Scanner(System.in);
      String address;
      do
      {
         System.out.print("Enter email address: ");
         address = console.next();
         if (search(address) != null)
         {
            System.out.printf("Email address %s already exists\n",
               address);
         }
      }
      while (search(address) != null);
      System.out.print("Enter password: ");
      String password = console.next();
      User user = new User(address, password);
      user.authenticate(address, password);
      users.add(user);
      writeUsers();
      
      return user;
   }
   
   /**
      Sends a message from the logged in user to a receiver.
      @param msg the message to be sent
      @return true if the recipient was found in this email system, 
         false otherwise
   */
   public void send(Message msg) throws IOException
   {
      String address = msg.getRecipient();
      User user = search(address);
      
      if (user == null) 
      {
         System.out.printf("Email address %s not found\n", address);
      }
      else
      {
         user.receive(msg);
         System.out.printf("Message delivered to %s\n", address);
      }
   }
   
   /**
      Checks this system to see if the specified address is present.
      @param address email address of a user
      @return the user account with the given address
   */
   private User search(String address)
   {
      User user = null;
      boolean found = false;
      
      for (int i = 0; i < users.size() && !found; i++)
      {
         if (users.get(i).getAddress().equals(address))
         {
            found = true;
            user = users.get(i);
         }
      }
      
      return user;
   }
   
   /**
      Reads a file containing a combination of email addresses and passwords
      in the format
      mailaddress1 password1
      mailaddress2 password2
      ...
      @param filename the name of the file
      @return a set of users whose details we read from the file
   */
   public void readUsers(String filename) throws IOException
   {   
      try (Scanner in = new Scanner(new File(filename)))
      {
         while (in.hasNext())
         {
            String mailAddress = in.next();
            String password = in.next();
            User aUser = new User(mailAddress, password);
            aUser.initialize();
            users.add(aUser);
         }
      }
   }
   
   /**
      Updates the email account records of all users
      @param users the known users
   */
   public void writeUsers() throws IOException
   {
      try (PrintWriter out = new PrintWriter("accounts.dat"))
      {
         for (User user : users)
         {
            out.println(user.format());
         }
      }        
   }
   
}