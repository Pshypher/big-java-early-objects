import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   Text-based simulation an email messaging system where users can
   login, read and send messages and logout.
*/
public class EmailInterface
{
   public static final String MAIN_MENU = "S)end message, R)ead message, L)ogout";
   
   public static void main(String[] args)
   {  
      EmailSystem email;
      try
      {
         email = new EmailSystem();
         email.readUsers("accounts.dat");
      }
      catch (IOException exception)
      {
         System.out.println("Error could not open file");
         return;
      }
      
      System.out.print("L)og-in, S)ign-up: ");
      Scanner console = new Scanner(System.in);
      String command = console.next();
      
      User user;
      switch (command)
      {
         case "L":
            user = email.login();
            break;
         case "S":
            try
            {
               user = email.signUp();
            }
            catch (IOException exception)
            {
               System.out.println("Internal system error");
               return;
            }
            break;
         default:
            user = null;           
      }
      
      if (user == null || !user.isLoggedIn())
      {
         System.out.println("Email address and password incorrect");
         return;
      }
   
      System.out.printf("Logged in as %s\n\n", user.getAddress());
      while (user.isLoggedIn())
      {
         System.out.println(MAIN_MENU);
         command = console.next();
         switch (command)
         {
            case "S":
               System.out.print("Enter email adress of recipient: ");
               String address = console.next();
               
               System.out.print("Enter message title Y)es, N)o: ");
               command = console.next();
               String title = "";
               if (command.equals("Y"))
               {
                  System.out.print("Message title: ");
                  console.nextLine();
                  title = console.nextLine();
               }
               
               String prompt = "                    M E S S A G E  B O D Y\n" 
                     + "                    ----------------------\n";
               System.out.println(prompt);
               
               String rawText = "";
               boolean done = false;
               while (!done)
               {
                  String input = console.nextLine();
                  if (input.equals("")) 
                  { 
                     done = true;
                  }
                  else
                  {
                     rawText = rawText + input + "\n";    
                  } 
               }
               Message msg = new Message(user.getAddress(), address, title);
               msg.setMessageText(rawText);
               try
               {
                  email.send(msg);
               }
               catch (IOException exception)
               {
                  System.out.println("Error message could not be delivered");
               }
               break;
            case "R":
               if (user.noMail())
               {
                  System.out.println("Mailbox is empty");
               }
               else
               {
                  user.showMail();
                  int choice = console.nextInt() - 1;
                  System.out.println(user.readMessage(choice));
               }   
               break;
            case "L":
               user.logout();
               break;
            default:
               return;        
         }
      }      
   }
}