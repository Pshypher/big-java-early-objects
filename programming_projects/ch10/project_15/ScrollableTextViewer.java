package project_15;

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.JFrame;

public class ScrollableTextViewer
{
   private static final Color[] COLORS = new Color[]
      {
         Color.BLACK, Color.BLUE, Color.CYAN, 
         Color.DARK_GRAY, Color.GRAY, Color.GREEN,
         Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, 
         Color.PINK, Color.RED, Color.WHITE, 
         Color.YELLOW
      };
      
   private static final int LEFT = 0;
   private static final int RIGHT = 1;
   
   private static final int FRAME_WIDTH = 750;
   private static final int FRAME_HEIGHT = 135;
   
   public static enum Direction { LEFT, RIGHT };
   
   public static void main(String[] args)
   {
      ScrollableTextFrame frame = new ScrollableTextFrame();
      ScrollableTextPanel panel = new ScrollableTextPanel();
      Scanner in = new Scanner(System.in);
      
      System.out.print("Text: ");
      String text = in.nextLine();
      panel.setText(text);
      
      System.out.print("Font size: ");
      int size = in.nextInt();
      
      int choice;
      int style;
      do
      {  
         System.out.print("Select font style\n   1. Bold\n"
               + "   2. Italic\n   3. Plain\n");
         choice = in.nextInt();               
         switch (choice)
         {
            case 1:
               style = Font.BOLD;
               break;
            case 2:
               style = Font.ITALIC;
               break;
            default:
               style = Font.PLAIN;                              
         }            
      }
      while (choice < 1 || choice > 3);
      
      String fontFace;
      do
      {
         System.out.print("Select font face\n   1. Monospace"
               + "\n   2. Sans-serif\n   3. Serif\n");
         choice = in.nextInt();               
         switch (choice)
         {
            case 1:
               fontFace = Font.MONOSPACED;
               break;
            case 2:
               fontFace = Font.SANS_SERIF;
               break;
            default:
               fontFace = Font.SERIF;                              
         }               
      }
      while (choice < 1 || choice > 3);
                
      Font font = new Font(fontFace, style, size);
      panel.setFont(font);
      
      panel.setForeground(selectColor("foreground", in));
      panel.setBackground(selectColor("background", in));
      
      System.out.print("Scrolling speed: ");
      int speed = in.nextInt();
      
      System.out.print("L)eft, R)ight: ");
      String input = in.next().toUpperCase();
      Direction direction;
      if (input.equals("L"))
      {
         direction = Direction.LEFT;
      }
      else
      {
         direction = Direction.RIGHT;
      }
      panel.setDirection(direction);
      
      frame.animate(panel, speed);
      frame.setTitle("Scrolling text");
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
   
   private static Color selectColor(String focus, Scanner in)
   {
      String prompt = "Select %s color\n   1. Black\n   2. Blue\n"
            + "   3. Cyan\n   4. Dark gray\n   5. Gray\n   6. Green\n"
            + "   7. Light gray\n   8. Magenta\n   9. Orange\n   "
            + "10. Pink\n   11. Red\n   12. White\n   13. Yellow\n";
      
      prompt =  String.format(prompt, focus);
      Color color = null;
      int choice;          
      do
      {
         System.out.print(prompt);
         choice = in.nextInt();
         if (choice >= 1 && choice <= 13)
         {
            color = COLORS[choice - 1]; 
         }
      }
      while (choice < 1 || choice > 13);
      
      return color;
   }
}