import java.util.ArrayList;
import java.util.Scanner;

public class MockSegment implements ISegment
{
    private ArrayList<String> segments;
    
    public MockSegment()
    {
        segments = new ArrayList<String>();
    }
    
    public void split(String plainText)
    {
        // assumes a single segment in the text
        segments.add("Chapter 1");
        segments.add("Happy families are all alike; every " 
            + "unhappy family is unhappy in its own way.");
        segments.add("Everything was in confusion in the Oblonskys’"
            + " house. The wife had discovered that ...");  
    }
    
    public String getTag(String text)
    {
        System.out.println();
        System.out.println("<?>" + text + "</?>");
        System.out.print("Tag: ");
        Scanner in = new Scanner(System.in);
        String tag = in.next();
        return tag;
    }
    
    public String toHTML()
    {
        String html = "";
        for (String text : segments)
        {
            String tag = getTag(text);
            String segment = "";
            for (int i = 0; i < text.length(); i++)
            {
                String substr;
                switch (text.charAt(i))
                {
                    case '\u201c':
                        substr = "&ldquo";
                        break;
                    case '\u201d':
                        substr = "&rdquo";
                        break;
                    case '\u2018':
                        substr = "&lsquo";
                        break;
                    case '\u2019':
                        substr = "&rsquo";
                        break;
                    case '\u2014':
                        substr = "&emdash";
                        break;
                    case '<':
                        substr = "&lt";
                        break;
                    case '>':
                        substr = "&gt";
                        break;
                    case '&':
                        substr = "&amp";
                        break;
                    default:
                        substr = text.substring(i, i + 1);                                                                                                                                                           
                }                
                segment = segment + substr;
            }
            segment = "<" + tag + ">" + segment + "</" + tag + ">";
            html = html + segment + "\n";                                                                                                                    
        }
        return html;
    }
}