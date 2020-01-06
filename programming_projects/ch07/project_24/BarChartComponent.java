import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class BarChartComponent extends JComponent
{
    private ArrayList<Double> dataSet;
    
    public BarChartComponent(ArrayList<Double> data)
    {
        dataSet = data;
    }
    public void paintComponent(Graphics g)
    {
        // recover the graphics2D object
        Graphics2D g2 = (Graphics2D) g;
        
        int gap = 20;
        double xLeft = getWidth() / 2 - dataSet.size() * gap / 2;
        double yCentre = getHeight() / 2;
        BarChart barChart = new BarChart(xLeft, yCentre);
        for (int i = 0; i < dataSet.size(); i++)
        {
            barChart.add(dataSet.get(i));
        }
        barChart.draw(g2);
    }
}