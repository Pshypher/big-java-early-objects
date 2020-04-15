import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
   This class extracts, displays and follows hyperlinks from a web page.
*/
public class WebPageCrawler
{
   private Scanner in;
   
   /**
      Default constructor of a web page crawler
      @param address location of html document
   */
   public WebPageCrawler(String address) throws IOException
   {
      URL pageLocation = new URL(address);
      in = new Scanner(pageLocation.openStream());
   }
   
   /**
      Reads entire web page(s) looking for hyperlinks to
      external documents.
      @param urls array list of visited urls
      @return a list of already visited hyperlinks            
   */
   public ArrayList<String> walk(ArrayList<String> urls) throws IOException
   {
      while (in.hasNext())
      {
         String token = in.next();
         
         if (token.equals("<a"))
         {
            String node = in.next();
            String element = getHTMLElement(token, node);
            String attribute = getAttribute(element);
            String address = (attribute == null) ? "" : getValue(attribute);
            if (address.startsWith("http"))
            {   
               if (!urls.contains(address))
               {
                  System.out.println(element);
                  urls.add(address);
                  WebPageCrawler crawler = new WebPageCrawler(address);
                  ArrayList<String> addresses = crawler.walk(urls);
                  
                  for (String a : addresses)
                  {
                     if (!urls.contains(a)) { urls.add(a); }
                  }
               }
            }                  
         }
      }
      
      in.close();
      return urls;
   }
   
   /**
      Get the html element of the anchor tag using the substring of
      the opening anchor tag and another substring containing the
      attribute, content and the end of the anchor tag
      @param substr substring of the opening anchor tag
      @param node the other end of the html element used for hyperlinks
   */
   private String getHTMLElement(String substr, String node)
   {
      String tag = "</a>";
      
      int fromIndex = 0;
      int toIndex = node.indexOf(tag);
   
      while (toIndex < 0)
      {
         String token = in.next();
         node = node + " " + token;
         toIndex = node.indexOf(tag);
      }
      toIndex = toIndex + tag.length();
      
      String element = substr + " " + node.substring(fromIndex, toIndex);
      return element;
   }
  
   /**
      Gets the href attribute-value pair from the given element. 
      @param element the hyperlink
      @return string containing href attribute-value pair
   */
   private String getAttribute(String element)
   {
      // Get attribute value pair, split them using white-space delimiter
      int pos = element.indexOf((int) '>');
      String[] attributes = element.substring(0, pos).split("\\s+");
      
      // Find the href attribute
      boolean found = false;
      int i = 0;
      while (!found && i < attributes.length)
      {
         if (attributes[i].contains("href"))
         {
            found = true;
         }
         else
         {
            i++;
         }
      }
      
      String href = null;
      if (found) { href = attributes[i]; }
      
      return href;
   }
   
   /**
      Extracts the web page address from the href attribute of
      hyperlink element.
      @param attribute the href attribute-value pair
      @return the value
   */
   private String getValue(String attribute)
   {
      int fromIndex = attribute.indexOf((int) '"') + 1;
      int toIndex = attribute.length() - 1;
      
      return attribute.substring(fromIndex, toIndex);
   }
   
}