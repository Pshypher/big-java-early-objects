import java.awt.Color;

/**
    This program applies a sunset effect to a picture,
    increasing the red value of each pixel by 30 percent.
*/
public class Sunset
{
    public static void main(String[] args)
    {
        final int REDNESS = 30;
        
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        
        for (int x = 0; x < pic.getWidth(); x++)
        {
            for (int y = 0; y < pic.getHeight(); y++)
            {
                Color color = pic.getColorAt(x, y);
                int sunsetRed = color.getRed() * REDNESS / 100 
                    + color.getRed();
                int red =  sunsetRed < 255 ? sunsetRed : 255;
                pic.setColorAt(x, y, 
                    new Color(red, color.getGreen(), color.getBlue()));
                                    
            }
        }
    }
}