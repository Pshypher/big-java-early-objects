import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Mailbox
{
   private ArrayList<Message> messages;
   
   /**
      Constructs a mailbox with no message(s)
   */
   public Mailbox()
   {
      messages = new ArrayList<Message>();
   }
   
   /**
      Formats this mail box using the titles of 
      each message.
      @return the messages within this mail box as a formatted string 
   */
   public String format()
   {
      String r = "";
      for (int i = 0; i < messages.size(); i++)
      {
         Message m = messages.get(i);
         r = r + String.format("\n%d) %-30s %s", i + 1,
            m.getSender(), m.getTitle());
      }
      
      return r;
   }
   
   /**
      Gets the body of the message at the specified position
      within this mail box
      @param pos the position of the message
      @return the message body
   */
   public String open(int pos)
   {
      Message msg = messages.get(pos);
      return msg.format();
   }
   
   /**
      Adds a message to this mailbox
      @param msg the message
   */
   public void add(Message msg)
   {
      messages.add(msg);
   }
         
    /**
      Reads the file in the specified path whose contents are the messages
      contained within the given owner's mailbox.
      @param recipient mail address to which this mailbox belongs.
      @param filename the name of the file
   */
   public void readMessages(String recipient, String filename) 
      throws IOException
   {
      try (Scanner in = new Scanner(new File(filename)))
      {
         while (in.hasNextLine())
         {
            String sender = in.nextLine();
            String title = in.nextLine();
            String body = "";
            String line;
            do
            {
               line = in.nextLine();
               if (!line.equals("EOF")) { body = body + line + "\n"; }
            }
            while (!line.equals("EOF"));
            
            Message msg = new Message(sender, recipient, title);
            msg.setMessageText(body);
            messages.add(msg);
         }
      }
   }
   
   /**
      Updates the record of messages stored in the given file path
      @param filename the name of the file
      @param messages messages to be printed out
   */
   public void printMessages(String filename) throws IOException
   {
      try (PrintWriter out = new PrintWriter(filename))
      {
         for (Message m : messages)
         {
            out.println(m.getSender());
            out.println(m.getTitle());
            out.print(m.getMessageText());
            out.println("EOF");
         }
      }
   }
   
   /**
      Gets the amount of messages in the mailbox.
      @return the number of messages
   */
   public int getNumberOfMessages()
   {
      return messages.size();
   }
}