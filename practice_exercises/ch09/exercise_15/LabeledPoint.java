/**
    A labeled point at (x, y) and a label giving a
    concise description of that point.
*/
public class LabeledPoint
{
    private int x;
    private int y; 
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
        this.x = x;
        this.y = y;
        text = label;
    }
    
    public String toString()
    {
        return "LabeledPoint[x=" + x + " y=" + y + " text=\"" + text + "\"]"; 
    }
}