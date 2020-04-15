import java.awt.Color;

/**
    This program creates a telescope effect on a picture,
    turning pixels outside a circle black.
*/
public class Telescope
{
    public static void main(String[] args)
    {        
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        
        int radius = pic.getWidth() < pic.getHeight()
            ? pic.getWidth() * 40 / 100 
            : pic.getHeight() * 40 / 100;
        
        for (int x = 0; x < pic.getWidth(); x++)
        {
            for (int y = 0; y < pic.getHeight(); y++)
            {
                // Calculate the distance of each pixel from
                // the centre of the image.
                int distance = (int) (Math.sqrt(
                    Math.pow(pic.getWidth() / 2 - x, 2)
                    + Math.pow(pic.getHeight() / 2 - y, 2)));
                if (distance > radius)
                {
                    pic.setColorAt(x, y, Color.BLACK);
                }
            }
        }
    }
}