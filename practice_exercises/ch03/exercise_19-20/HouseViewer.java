import javax.swing.JFrame;

/**
      Adds the house in the Component on a Frame 
*/
public class HouseViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      
      frame.setTitle("A Simple House");
      frame.setSize(500, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      HouseComponent component = new HouseComponent();
      frame.add(component);
      
      frame.setVisible(true);
   }
}