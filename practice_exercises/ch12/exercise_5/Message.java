/**
   An electronic message has the details of the sender, recipient
   and the content of the message
*/
public class Message
{
   private String sender;
   private String recipient;
   private String messageText;
   private String title;
   
   /**
      Constructs an electronic message with the given sender, receiver and
      an empty message content and no title.
      @param theSender mail address of the sender
      @param receiver mail address of the recipient
      @param msgTitle title of the message
   */
   public Message(String theSender, String receiver, String msgTitle)
   {
      sender = theSender;
      recipient = receiver;
      messageText = "";
      title = msgTitle;
   }
   
   /**
      Gets the destination email address of this message
      @return the address of the receiver
   */
   public String getRecipient()
   {
      return recipient;
   }
   
   /**
      Gets the email address for the source of this message
      @return email address of the sender
   */
   public String getSender()
   {
      return sender;
   }
   
   /**
      Get the title for this message.
      @return the title
   */
   public String getTitle()
   {
      if (title.equals("")) { 
         return heading(); }
      return title;
   }
   
   /**
      Get the header of this message, using the first 30 characters
      of its content.
      @return the title of this message
   */
   private String heading()
   {
      final int CHARACTERS = 30;
      
      String msgheader;
      if (messageText.length() > CHARACTERS)
      {
         int fromIndex = 0;
         int toIndex = fromIndex + CHARACTERS;
         msgheader = messageText.substring(fromIndex, toIndex);
      }
      else
      {
         msgheader = messageText;
      }
      
      return msgheader;
   }
   
   /**
      Gets the body of this message.
      @return the main content of this message.
   */
   public String getMessageText()
   {
      return messageText;
   }
   
   /**
      Updates the content of this message.
      @param rawText content of the message
   */
   public void setMessageText(String rawText)
   {
      messageText = rawText;
   }
   
   /**
      Formats the content of this message.
      @return formatted string of this messages' content
   */
   public String format()
   {      
      String out = "Sender - " + sender + "\n"
         + "Subject - " + title + "\n\n";
      out = out + "                    M E S S A G E  B O D Y\n\n"
         + messageText + "\n";
         
      return out; 
   }   
}