package project_25;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CircleFrame extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 400;
   
   private Ellipse2D.Double circle;
   private JComponent component;
   private JFrame frame;
   
   class CircleComponent extends JComponent
   {
      public void paintComponent(Graphics g)
      {
         Graphics2D g2 = (Graphics2D) g;
         g2.draw(circle);
      }
   }
   
   class DrawCircleListener extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         double radius = Double.parseDouble(
            JOptionPane.showInputDialog("Radius of circle: "));
         double xLeft = event.getX() - radius;
         double yTop = event.getY() - radius;
         double diameter = radius * 2;
         circle.setFrame(xLeft, yTop, diameter, diameter);
         component.repaint();
      }
   }
   
   public CircleFrame()
   {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame = this;
      circle = new Ellipse2D.Double(0, 0, 0, 0);
      component = new CircleComponent();
      component.addMouseListener(new DrawCircleListener());
      frame.add(component);
   }
}