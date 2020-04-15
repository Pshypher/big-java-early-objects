import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JComponent;

public class ChartComponent extends JComponent
{
    private ArrayList<Integer> values;
     
    public ChartComponent(ArrayList<Integer> dataValues)
    {
        values = dataValues;
    }
    
    public void paintComponent(Graphics g)
    {
        // recover the Graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        
        double gap = 10;
        double x = getWidth() / 2 - values.size() * gap / 2;
        double y = getHeight();
        Chart chart = new Chart(x, y);
        
        for (int element : values)
        {
            chart.add(element);
        }
        chart.draw(g2);
    }
}