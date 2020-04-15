import javax.swing.JFrame;

public class TrafficLightViewer
{
        public static void main(String[] args) 
        {
                // Construct a Frame 
                JFrame frame = new JFrame();
                frame.setSize(90, 155);
                frame.setTitle("Traffic Light");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                // Add a TrafficLightComponent to the Frame
                TrafficLightComponent trafficLight = new TrafficLightComponent();
                frame.add(trafficLight);
                
                // Make the Frame visible
                frame.setVisible(true);
        }
}