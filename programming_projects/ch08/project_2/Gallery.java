import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Gallery
{
    public static void main(String[] args)
    {
        final int PICTURES = 20;
        
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        
        for (int i = 1; i <= PICTURES; i++)
        {
            Picture pic = new Picture("picture" + i + ".jpg");
            Point p = getBestFit(pic, rectangles);
            pic.move(p.getX(), p.getY());
            rectangles.add(pic.getBounds());
        }  
    }
    
    public static boolean intersects(Rectangle r, ArrayList<Rectangle> rectangles)
    {
        boolean intersects = false;
        for (int i = 0; i < rectangles.size() && !intersects; i++)
        {
            if (r.intersects(rectangles.get(i)))
            {
                intersects = true;
            }
        }
        
        return intersects;
    }
    
    /**
       Gets the positions of the bottom left corners of all placed pictures
       @return an array list of points for the bottom left corners of the 
       bounding rectangles
        
    */
    public static ArrayList<Point> getPoints(ArrayList<Rectangle> rectangles)
    {
        ArrayList<Point> coords = new ArrayList<Point>();
        
        for (int i = 0; i < rectangles.size(); i++)
        {
            int x = (int) rectangles.get(i).getX();
            int y = (int) rectangles.get(i).getY();
            coords.add(new Point(x, y));  
        }
        return coords;
    }
    
    /**
        Get the point with the best-fit for a picture
        @return point with the best-fit
    */
    public static Point getBestFit(Picture pic, ArrayList<Rectangle> rectangles)
    {
        final int MAX_WIDTH = 720;
        final int GAP = 10;
        
        Point topLeft = new Point(0, 0);
        ArrayList<Integer> xCoordinates = new ArrayList<Integer>();
        ArrayList<Integer> yCoordinates = new ArrayList<Integer>();
        
        for (Rectangle r : rectangles)
        {
            xCoordinates.add((int) r.getX());
            xCoordinates.add((int) r.getMaxX());
            yCoordinates.add((int) r.getY());
            yCoordinates.add((int) r.getMaxY());         
        }
        
        yCoordinates.sort(null);
        xCoordinates.sort(null);
           
        outerloop:
        for (int y : yCoordinates)
        {
            innerloop:
            for (int x : xCoordinates)
            {
                int width = (int) pic.getBounds().getWidth();
                int height = (int) pic.getBounds().getHeight();
                Rectangle boundary = new Rectangle(x, y, width, height);
                if (!(intersects(boundary, rectangles))
                    && boundary.getMaxX() < MAX_WIDTH)
                {
                    x = (x > 0) ? x + GAP : 0;
                    y = (y > 0) ? y + GAP : 0;
                    topLeft = new Point(x, y);
                    break outerloop;    
                }   
            }
        }
        return topLeft;
    }
}