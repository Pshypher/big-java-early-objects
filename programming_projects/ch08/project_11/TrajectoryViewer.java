import javax.swing.JFrame;

public class TrajectoryViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setTitle("Cannonball Trajectory");
        
        TrajectoryComponent component = new TrajectoryComponent();
        frame.add(component);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}