import java.awt.Point;

/**
    A labeled point at (x, y) and a label giving a
    concise description of that point.
*/
public class LabeledPoint
{
    private Point pt; 
    private String text;
    
    /**
        Construct a label point at the specified coordinate and
        with the given label.
        @param x x-coordinate of this labeled point
        @param y y-coordinate of this labeled point
        @param label the label for this point
    */
    public LabeledPoint(int x, int y, String label)
    {
        pt = new Point(x, y);
        text = label;
    }
    
    public String toString()
    {
        return "LabeledPoint[" + pt.toString() + " text=\"" + text + "\"]";
    }
}