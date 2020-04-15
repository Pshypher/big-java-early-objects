package project_18;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BarChart
{
   private static final int MIN_BAR_WIDTH = 5;
   
   private ArrayList<Rectangle> bars;
   private int height;
   private int gap;
   
   /**
      Constructs an empty bar chart.
      @param barHeight thickness of each bar
      @param space the space between bars 
   */
   public BarChart(int barHeight, int space)
   {
      bars = new ArrayList<Rectangle>();
      height = barHeight;
      gap = space;
   }
   
   /**
      Draws this bar chart.
      @param g2 the graphics context 
   */
   public void draw(Graphics2D g2)
   {
      for (int i = 0; i < bars.size(); i++)
      {
         int xLeft = 0;
         int yTop = i * height + i * gap;
         bars.get(i).setLocation(xLeft, yTop);
         g2.draw(bars.get(i));
      }
   }
   
   /**
      Extends the width a bar to the specified point.
      @param r rectangle on this bar chart to be extended
      @param pt a point on this bar chart
      @param component canvas that displays this bar chart
   */
   public void resize(Rectangle r, Point pt, JComponent component)
   {
      if (r != null)
      {
         r.setSize((int) pt.getX(), height);
         if (r.getWidth() < MIN_BAR_WIDTH) { bars.remove(r); }
         component.repaint();
      }         
   }
   
   /**
      Selects a rectangle from this bar chart.
      @param pt point within a rectangle on this bar chart
      @return the selected rectangle.
   */
   public Rectangle select(Point pt)
   {
      int y = (int) pt.getY();
      int h = gap + height;
      if (y % h >= 0 && y % h <= Math.round(h / 2.0f))
      {
         int pos = y / h;
         if (pos < bars.size())
         {
            Rectangle r = bars.get(pos);
            if (pt.getX() <= r.getWidth()) { return r; }
         }
      }
      return null;
   }
   
   /**
      Adds a new rectangle to this bar chart.
      @param pt a point on this bar chart.
      @param component canvas that displays this bar chart
   */
   public void add(Point pt, JComponent component)
   {
      
      int chartSize = bars.size();
      int totalHeight = chartSize * height + (chartSize - 1) * gap;
      if (pt.getY() > totalHeight)
      {
         int xLeft = 0;
         int yTop = 0;
         if (pt.getX() >= MIN_BAR_WIDTH)
         {
            bars.add(new Rectangle(xLeft, yTop, (int) pt.getX(), height));
         }            
      }
      component.repaint();
   }
}