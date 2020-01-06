import java.awt.Color;

public class PictureUtil
{
    /**
        Makes an image of two pictures super imposed on each other, the width
        of the new images being the wider of the two and its height being
        the taller of the two.
        @param pic1 one of two pictures super imposed on each other.
        @param pic2 the latter of both pictures super imposed on each other.
        @return a picture which is a result of super imposing two pictures on 
        each other.
    */
    public static Picture superimpose(Picture pic1, Picture pic2)
    { 
        int width;
        if (pic1.getWidth() > pic2.getWidth())
        {
            width = pic1.getWidth();
        }
        else
        {
            width = pic2.getWidth();
        }
        
        int height;
        if (pic1.getHeight() > pic2.getHeight())
        {
            height = pic1.getHeight();
        }
        else
        {
            height = pic2.getHeight();
        }
            
        Picture pic = new Picture(width, height);
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color color;
                if (x < pic1.getWidth() 
                    && x < pic2.getWidth() 
                    && y < pic1.getHeight()
                    && y < pic2.getHeight())
                {
                    color = mix(pic1.getColorAt(x, y), pic2.getColorAt(x, y));   
                }
                else if (x < pic1.getWidth()
                    && y < pic1.getHeight())
                {
                    color = pic1.getColorAt(x, y);
                }
                else if (x < pic2.getWidth()
                    && y < pic2.getHeight())
                {
                    color = pic2.getColorAt(x, y);
                }
                else
                {
                    color = Color.WHITE;
                }
                
                pic.setColorAt(x, y, color);
            }   
        }
        
        return pic;
    }
    
    private static Color mix(Color c1, Color c2)
    {
        int red = (c1.getRed() + c2.getRed()) / 2;
        int green = (c1.getGreen() + c2.getGreen()) / 2;
        int blue = (c1.getBlue() + c2.getBlue()) / 2;
        
        return new Color(red, green, blue);
    }
}