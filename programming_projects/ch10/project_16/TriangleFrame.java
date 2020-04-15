package project_16;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import javax.swing.JFrame;

public class TriangleFrame extends JFrame
{
   private static final int FRAME_HEIGHT = 450;
   private static final int FRAME_WIDTH = 500;
   
   private TriangleComponent triangle;
      
   public TriangleFrame()
   {
      setTitle("Triangle");
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      
      triangle = new TriangleComponent();
      add(triangle);
      
      MouseListener listener = new AddPointListener();
      triangle.addMouseListener(listener);
   }
   
   class AddPointListener implements MouseListener
   {      
      public void mouseClicked(MouseEvent event)
      {
         final int PTS_PER_TRIANGLE = 3;
       
         Point2D.Double pt = new Point2D.Double(
                  event.getX(), event.getY());
         triangle.add(pt);
      }
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
      public void mousePressed(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
   }
}