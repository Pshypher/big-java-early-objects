/**
   Describe a blueprint for a generating personalized mails 
*/
public class Template
{
   private Recipient theRecipient;
   private String sender;
   private Message message;
   
   /**
      Constructs an empty template for sending personalized mails
      @param source the name of the company sending out the mail
      @param aRecipient the recipient
   */
   public Template(String source, Recipient aRecipient)
   {
      sender = source;
      theRecipient = aRecipient;
   }
   
   /**
      Inserts a message into this template
      @param aMessage the message text 
   */
   public void insert(Message aMessage)
   {
      message = aMessage;
   }
   
   /**
      Formats and customizes this template for the recipient
      @return a formatted string of this template
   */
   public String format()
   {
      String r  = "<html><head><meta charset=\"utf-8\" "
         + "type=\"text/html\" /><title>Mail from: "
         + sender + "</title></head><body>";
      r = r + String.format("<p>%s</p>", theRecipient.address());   
      r = r + String.format("<p>Dear %s,</p>", theRecipient.names())
         + message.getMessageText() + "</body></html>";
         
      return r;         
   }
}