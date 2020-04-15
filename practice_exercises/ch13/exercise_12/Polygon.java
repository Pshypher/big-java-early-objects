import java.util.Arrays;

/**
   A polygon on a 2-D plane has at least 3 vertices with lines
   joining them.
*/
public class Polygon
{
   private Point[] points;
   
   /**
      Constructs a polygon with the given vertices.
      @param thePoints vertices of the polygon 
   */
   public Polygon(Point[] thePoints)
   {
      points = thePoints;
   }
   
   /**
      Calculates the area occupied by this polygon.
      @return the area of the polygon
   */
   public double getArea()
   {
      final int SIDES = 3;
      
      if (points.length < SIDES) { 
         return 0; }
      else
      {
         Point p1 = points[0];
         Point p2 = points[1];
         Point p3 = points[points.length - 1];
         
         double x1 = p1.getX();
         double y1 = p1. getY();
         double x2 = p2.getX();
         double y2 = p2.getY();
         double x3 = p3.getX();
         double y3 = p3.getY();
         
         double area = Math.abs(x1 * y2 + x2 * y3 + x3 
            * y1 - y1 * x2 - y2 * x3 - y3 * x1) / 2.0;
         
         remove(0);            
         Polygon smallerPolygon = new Polygon(points);
         return smallerPolygon.getArea() + area;
      }
   }
   
   /**
      Removes a point at the specified position from the set
      of points in this polygon.
      @param pos the position of the point to be removed
   */
   private void remove(int pos)
   {
      for (int i = pos + 1; i < points.length; i++)
      {
         points[i - 1] = points[i];
      }
      
      points = Arrays.copyOf(points, points.length - 1);
   }
}