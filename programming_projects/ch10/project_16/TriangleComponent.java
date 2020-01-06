package project_16;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JComponent;

public class TriangleComponent extends JComponent
{
   private static final int RADIUS = 5;
   private static final int PTS_PER_TRIANGLE = 3;
   
   private ArrayList<Point2D.Double> points;
   
   /**
      Constructs a canvas for drawing a triangle
   */
   public TriangleComponent()
   {
      points = new ArrayList<Point2D.Double>();
   }
   
   /**
      Adds one of the points that makes up this triangle.
      @param p one of three points on this triangle
   */
   public void add(Point2D.Double p)
   {
      if (points.size() == PTS_PER_TRIANGLE) { points.clear(); } 
      points.add(p);
      repaint();
   }
      
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      for (int i = 0; i < points.size(); i++)
      {
         if (i > 0)
         {
            Line2D.Double line = new Line2D.Double(
                  points.get(i - 1), points.get(i));
            g2.draw(line);                    
         }
         else
         {
            double x = points.get(i).getX();
            double y = points.get(i).getY();
            Ellipse2D.Double dot = new Ellipse2D.Double(x, y, RADIUS, RADIUS);
            g2.draw(dot);
         }
         
      }
      
      if (points.size() == PTS_PER_TRIANGLE)
      {
         Line2D.Double line = new Line2D.Double(points.get(0), 
               points.get(points.size() - 1));
         g2.draw(line);               
      }
   }
}