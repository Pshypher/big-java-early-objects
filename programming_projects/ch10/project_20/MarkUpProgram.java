import java.util.Scanner;

/**
    This program marks up segments of plain text with html tags
*/
public class MarkUpProgram
{
    public static void main(String[] args)
    {
        ISegment text = new MockSegment();
        
        Scanner in = new Scanner(System.in);
        String str = "";
        System.out.print("Enter lines of text, Q to quit: ");
        String input = "";
        while (!(input.endsWith("Q") || input.endsWith("q")))
        {
            input = in.nextLine();
            if (input.endsWith("Q") || input.endsWith("q"))
            {
                String line = input.substring(0, input.length() - 1);
                str = str + line;
                str = str.trim();
            }
            else
            {
                str = str + input;
            }
        }
             
        text.split(str);
        int i = 0;
        String html = text.toHTML();
        System.out.println();        
        System.out.println(html);
    }
}