import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

public class ChartViewer
{
    public static void main(String[] args)
    { 
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Height of each bar < 200cm, Q to quit:");
        ArrayList<Integer> dataValues = new ArrayList<Integer>();
        while (in.hasNextInt())
        {
            dataValues.add(in.nextInt()); 
        }
        
        ChartComponent chartComponent = new ChartComponent(dataValues);
        frame.add(chartComponent);
        
        frame.setTitle("Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

