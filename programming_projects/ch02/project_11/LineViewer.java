import javax.swing.JFrame;

public class LineViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 450);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      LineComponent line = new LineComponent();
      frame.add(line);
      frame.setVisible(true);
   }
}