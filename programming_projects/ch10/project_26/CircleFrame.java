package project_26;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class CircleFrame extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 350;
   
   private Circle circle;
   private JComponent component;
   
   class CircleComponent extends JComponent
   {
      public void paintComponent(Graphics g)
      {
         Graphics2D g2 = (Graphics2D) g;
         circle.draw(g2);
      }
   }
   
   class DrawCircleListener extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         if (circle.getCentre() == null)
         {
            circle.recentre(event.getPoint());
         }
         else if (circle.getRadius() == 0)
         {
            circle.setRadius(event.getPoint());
            component.repaint();
         }
      }
   }
   
   public CircleFrame()
   {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      circle = new Circle();
      component = new CircleComponent();
      MouseAdapter listener = new DrawCircleListener();
      component.addMouseListener(listener);
      add(component);
   }
}