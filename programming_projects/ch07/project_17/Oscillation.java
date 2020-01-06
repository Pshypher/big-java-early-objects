import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.logging.Level;
import java.util.logging.Logger; 

public class Oscillation
{
    public static final double DELTA_T = 0.01;
    public static final double HOOKES_LAW_CONSTANT = 10;
        
    private double mass;
    private double length;
    private double[] displacements;
    private double plotWidth;
    
    /**
        A model of a spring that oscillates when an object is placed
        at the end of the spring and a force is applied
        @param width the width of the component where the plot of the
        displacement is drawn
        @param mass the mass of the object
        @param initialDisplacement the distance by which the spring
        is stretched
    */
    public Oscillation(double width, double mass, double initialDisplacement)
    {
        plotWidth = width;
        this.mass = mass;
        length = initialDisplacement;
        displacements = new double[100];
    }
    
    /**
        Computes the length of the spring after every 10 oscillations
    */
    public void setDisplacements()
    {
        Logger.getGlobal().setLevel(Level.OFF);
        
        double velocity = 0;
        
        int pos = 0;
        displacements[pos] = length;
        pos++;
        
        int oscillations = 1;
        int step = 10;
        while (pos < displacements.length)
        {
            double acceleration = -1 * length 
                * HOOKES_LAW_CONSTANT / mass;
            velocity = velocity + acceleration * DELTA_T;
            length = length + velocity * DELTA_T;
            oscillations++;
            
            if (oscillations % step == 0)
            {
                displacements[pos] = Math.abs(length);
                pos++;
                Logger.getGlobal().info(String.format("%.5f", length));
            }
        }
    }
    
    /**
        Change the measure of the displacements in meters to centimeters
    */
    public void toCentimeters()
    {
        for (int i = 0; i < displacements.length; i++)
        {
            double meters = displacements[i];
            double centimeters = 100 * meters;
            displacements[i] = centimeters;
        }
    }
    
    /**
        Draws a plot of the displacements of the spring
        @param g2 the context of the graphics object
    */
    public void draw(Graphics2D g2)
    {
        double gap = plotWidth / displacements.length;
        double x = plotWidth / 2 - displacements.length * gap / 2;
        for (int i = 0; i < displacements.length; i++)
        {
            Point2D.Double top = new Point2D.Double(x + i * gap, 0);
            Point2D.Double bottom = new Point2D.Double(x + i * gap,
                displacements[i]);
            Line2D.Double bar = new Line2D.Double(top, bottom);
            g2.draw(bar);
        }
    }
}