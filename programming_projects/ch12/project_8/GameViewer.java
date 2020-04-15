import javax.swing.JFrame;

public class GameViewer
{
   public static void main(String[] args)
   {
      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;
      
      JFrame frame = new GameFrame();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Clock");   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}