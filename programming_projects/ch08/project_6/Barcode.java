import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Barcode
{
    public static final int SPACE = 5;
    public static final int FULL_FRAME_HEIGHT = 30;
    public static final int HALF_FRAME_HEIGHT = FULL_FRAME_HEIGHT / 2;
    
    private String barcode;

    public Barcode(String str)
    {
        barcode = str;
    }
    
    private int decode(String frames)
    {
        int[] weights = { 7, 4, 2, 1, 0 };
        
        frames = frames.substring(0, 5);
        frames = frames.replace(':', '0');
        frames = frames.replace('|', '1');
        
        int value = 0;
        if (frames.equals("11000")) { return value; }
        for (int i = 0; i < frames.length(); i++)
        {
            value = value + weights[i] * 
                Integer.parseInt(frames.substring(i, i + 1));             
        }
        
        return value;
    }
    
    /**
        Draws this bar code on the graphics window.
        @param xLeft x position of the first frame.
        @param yTop y position of a frame with a full height.
    */
    public void draw(double xLeft, double yTop, Graphics2D g2)
    {
        Point2D.Double top; 
        Point2D.Double bottom;
        
        String temp = barcode;
        for (int i = 0; i < temp.length(); i++)
        {
            if (temp.charAt(i) == '|')
            {
                top = new Point2D.Double(xLeft, yTop);
                bottom = new Point2D.Double(xLeft, yTop + FULL_FRAME_HEIGHT);
            }
            else
            {
                top = new Point2D.Double(xLeft, yTop + HALF_FRAME_HEIGHT);
                bottom = new Point2D.Double(xLeft, yTop + FULL_FRAME_HEIGHT);
            }
            Line2D.Double frame = new Line2D.Double(top, bottom);
            g2.draw(frame);
            xLeft = xLeft + SPACE;
        }       
    }
    
    /**
        Checks if the given barcode string is valid.
        @return true if the barcode string is valid, 
        otherwise false.
    */
    public boolean valid()
    {
        if (barcode.length() > 32
            || barcode.length() < 32)
        { return false; }
        
        boolean valid = true;
        int i = 0;
        while (valid && i < barcode.length())
        {
            if (barcode.charAt(i) != ':'
                && barcode.charAt(i) != '|')
            { valid = false; }
            i++;               
        }
        
        return valid;
    }
    
    /**
        Get the string representation of this bar code.
        @return the bar code string.
    */
    public String getBarcodeString()
    {
        return barcode;
    }
    
    /**
        Converts this bar code to the corresponding zip code.
        @return the zip code object for this bar code.
    */
    public Zipcode toZipcode()
    {
        int postalcode = 0;
        String temp = barcode.substring(1, barcode.length() - 1);
        for (int i = 0; i < temp.length(); i = i + 5)
        {
            postalcode = decode(temp.substring(i, i + 5))
                + postalcode * 10;    
        }
        postalcode = postalcode / 10;
        return new Zipcode(postalcode);
        // |:|:::|:|:||::::::||:|::|
    }
}