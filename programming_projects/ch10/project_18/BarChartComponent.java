package project_18;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class BarChartComponent extends JComponent
{
   private BarChart chart;
   
   /**
      Constructs a UI component for drawing a bar chart
   */
   public BarChartComponent()
   {
      chart = new BarChart(20, 10);
   }
    
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      chart.draw(g2);
   }
   
   /**
      Returns the bar chart object drawn on this component.
      @return bar chart
   */
   public BarChart getBarChart()
   {
      return chart;
   }
}  