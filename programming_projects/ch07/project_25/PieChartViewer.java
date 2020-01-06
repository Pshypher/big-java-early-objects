import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class PieChartViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Pie Chart");
        frame.setSize(300, 400);
        
        ArrayList<Double> dataValues = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values in data set, 0 to quit: ");
        double value = in.nextDouble();
        while (value > 0)
        {
            dataValues.add(value);
            value = in.nextDouble();
        }
        
        PieChartComponent component = new PieChartComponent(dataValues);
        frame.add(component);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}