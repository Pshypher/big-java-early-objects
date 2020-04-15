import javax.swing.JFrame;

public class GraphicsEditorViewer
{
   public static void main(String[] args)
   {
      final int FRAME_WIDTH = 550;
      final int FRAME_HEIGHT = 450;
      
      JFrame frame = new GraphicsEditor();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("Shapes");
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
