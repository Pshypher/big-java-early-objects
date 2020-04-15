package project_18;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class BarChartFrame extends JFrame
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 300;
   
   private BarChartComponent component;
   
   class BarChartListener implements MouseListener
   {
      private Rectangle rect;
      
      public void mouseClicked(MouseEvent event)
      {
         BarChart chart = component.getBarChart();
         if (rect != null) 
         {
            chart.resize(rect, event.getPoint(), component);
            rect = null;
         }
         else
         {
            rect = chart.select(event.getPoint());
            chart.add(event.getPoint(), component);
         }  
      }
      public void mousePressed(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
   }
   
   public BarChartFrame()
   {
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      component = new BarChartComponent();
      
      MouseListener listener = new BarChartListener();
      component.addMouseListener(listener);
      
      add(component);
   }
}