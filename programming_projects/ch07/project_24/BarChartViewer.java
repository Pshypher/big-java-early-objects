import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class BarChartViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Bar Chart");
        frame.setSize(250, 250);
        
        ArrayList<Double> data = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter several values, Q to quit: ");
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            data.add(value);
        }
        
        BarChartComponent component = new BarChartComponent(data);
        frame.add(component);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}