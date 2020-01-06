package project_24;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CircleFrame extends JFrame
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 300;
   
   private Ellipse2D.Double circle;
   private JButton button;
   private JFrame frame;
   private JComponent component;
   
   class CircleComponent extends JComponent
   {
      public void paintComponent(Graphics g)
      {
         Graphics2D g2 = (Graphics2D) g;
         g2.draw(circle);
      }
   }
   
   class DrawCircleListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         double xCenter = Double.parseDouble(
            JOptionPane.showInputDialog("X coordinate of circle: "));
         double yCenter = Double.parseDouble(
            JOptionPane.showInputDialog("Y coordinate of circle: "));
         double radius = Double.parseDouble(
            JOptionPane.showInputDialog("Radius of circle: "));
         double xLeft = xCenter - radius;
         double yTop = yCenter - radius;
         double diameter = radius * 2;
         circle = new Ellipse2D.Double(xLeft, yTop, diameter, diameter);
         component = new CircleComponent();
         frame.remove(button);
         frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
         frame.add(component);                     
      }
   }
   
   public CircleFrame()
   {
      button = new JButton("Draw");
      button.addActionListener(new DrawCircleListener());
      setSize(FRAME_WIDTH / 10, (int) (FRAME_HEIGHT * 2.0 / 9));
      add(button);
      frame = this;
   }
}