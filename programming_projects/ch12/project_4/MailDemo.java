import java.io.FileNotFoundException;
import java.util.Scanner;

public class MailDemo
{
   public static void main(String[] args)
   {
      System.out.print("Company name: ");
      Scanner console = new Scanner(System.in);
      String source = console.nextLine();
      Mailer m = new Mailer(source);
      try
      {
         m.readFile("recipients.dat");
      }
      catch (FileNotFoundException exception)
      {
         System.out.println("Could not find file.");
         return;
      }
      while (m.hasNextRecipient())
      {
         Recipient r = m.nextRecipient();
         System.out.println("\nMail to: " + r.names());
         Message msg = new Message();
         boolean done = false;
         while (!done)
         {
            System.out.print("Enter message A=Yes B=No: ");
            String command = console.next();
            if (command.equalsIgnoreCase("A"))
            {
               System.out.print("HTML tag: ");
               String tag = console.next();
               console.nextLine();
               System.out.print(">>> ");
               String text = "";
               while (true)
               {
                  String line = console.nextLine();
                  if (line.equals("")) { 
                     break; }
                  text = text + line + "\n";
               }
               msg.addHTMLElement(text, tag);
            }
            else if (command.equalsIgnoreCase("B"))
            {
               if (!msg.isEmpty()) 
               {
                  try
                  {
                     m.printMail(r, msg);
                  }
                  catch (FileNotFoundException exception)
                  {
                     System.out.println("Could not access the file.");
                     return;
                  }
               }
               done = true;
            }
            else
            {
               System.out.println("Illegal command!");
            }
         }
      }
   }
}