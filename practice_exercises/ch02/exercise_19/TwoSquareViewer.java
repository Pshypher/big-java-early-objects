import javax.swing.JFrame;

public class TwoSquareViewer
{
   public static void main(String[] args) 
   { 
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setTitle("Two square with the same center");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
      // Construct a TwoSquareComponent object and it to the frame
      TwoSquareComponent component = new TwoSquareComponent();
      frame.add(component);
      frame.setVisible(true);
   }
}
