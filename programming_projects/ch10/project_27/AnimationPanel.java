package project_27;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JPanel;

public class AnimationPanel extends JPanel
{
   private ArrayList<MoveableShape> shapes;
      
   public AnimationPanel()
   {
      shapes = new ArrayList<MoveableShape>();
      shapes.add(new MoveableRectangle(200, 195, 90, 45));
      shapes.add(new Car(20, 135, 15, "left"));
      shapes.add(new MoveableRectangle(0, 315, 90, 45));
      shapes.add(new Car(284, 255, 15, "left"));
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      Graphics2D g2 = (Graphics2D) g;
      
      for (MoveableShape s : shapes)
      {
         s.draw(g2);
      }
   }
  
   /**
      Moves each shape horizontally across the canvas, 
      and repaints this panel.
   */
   public void redraw()
   {
      for (MoveableShape s : shapes)
      {
         s.move(getWidth());
      }
      
      repaint();
   }
}

