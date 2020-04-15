import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class BarcodeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g; // recover Graphics2D object
        
        Zipcode postalCode = new Zipcode(95014);
        Barcode barcode = postalCode.transform();
        if (barcode.valid())
        {
            String str = barcode.getBarcodeString();
            double xCenter = getWidth() / 2 - str.length() * 
                Barcode.SPACE / 2;
            double yCenter = getHeight() / 2 - 
                Barcode.FULL_FRAME_HEIGHT / 2;
            barcode.draw(xCenter, yCenter, g2);
        }
        else
        {
            System.out.println("Illegal input bar code value.");
        }
    }
}