import javax.swing.JFrame;

public class SuburbanSceneViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new SuburbanSceneFrame();
      frame.setTitle("Suburban scene");
   
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}