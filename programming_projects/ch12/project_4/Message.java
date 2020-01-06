/**
   This class forms the main content of a personalized mail, and is
   formatted as a string of HTML text. 
*/
public class Message
{
   private String messageText;
   
   /**
      Constructs a message with no HTML tag(s) and text
   */
   public Message()
   {
      messageText = "";
   }
   
   /**
      Add an HTML element, comprised of a text and surrounding tags
      to the content of this message
      @param the text surrounded by the given tag
      @param tag the html tag used to markup the text
   */
   public void addHTMLElement(String text, String tag)
   {
      text = text.replace("\n", "<br />");
      messageText = messageText + String.format("<%s>%s</%s>", tag, text, tag);
   }
   
   /**
      Gets the text within this message
      @return the message text
   */
   public String getMessageText()
   {
      return messageText;
   }
   
   /**
      Checks whether this message has no text
      @return true if this message is empty, false otherwise
   */
   public boolean isEmpty()
   {
      return messageText.equals("");
   }
}