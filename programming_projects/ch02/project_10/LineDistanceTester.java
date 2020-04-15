import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LineDistanceTester 
{
   public static void main(String[] args)
   {
      // Constructs a Line object between points (100, 100) and (200, 200)
      Line2D.Double line = new Line2D.Double(100, 100, 200, 200);
      
      // Finds the closest distance between point pt0 and the line
      Point2D.Double pt0 = new Point2D.Double(100, 200);
      System.out.println("distance between pt0 and line " + line.ptSegDist(pt0));
      System.out.println("Expected: " + 70.710678119);
      
      // Finds the closest distance from pt1 to the line
      Point2D.Double pt1 = new Point2D.Double(150, 150);
      System.out.println("distance between pt1 and line " + line.ptSegDist(pt1));
      System.out.println("Expected: " + 0.0);
      
      // Finds the closest distance between pt2 and the line
      Point2D.Double pt2 = new Point2D.Double(250, 50);
      System.out.println("distance between pt2 and the line " + line.ptSegDist(pt2));
      System.out.println("Expected: " + 141.421356237);
   }
}