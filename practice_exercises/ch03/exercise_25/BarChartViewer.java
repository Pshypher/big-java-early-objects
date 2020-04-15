import javax.swing.JFrame;

/**
        Adds and draws a BarChartComponent object on a Frame
*/

public class BarChartViewer
{
        public static void main(String[] args)
        {
                // Construct a JFrame object
                JFrame frame = new JFrame();
                
                // Apply the settings for the basic properties of the frame
                // such as the size, title and default close action of the frame
                frame.setSize(300, 250);
                frame.setTitle("Bar Chart");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // Add the BarChartComponent to the frame
                BarChartComponent component = new BarChartComponent();
                frame.add(component);
                
                frame.setVisible(true); 
        }
}