import javax.swing.JFrame;

public class AlphabetViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setTitle("Words");
        
        AlphabetComponent component = new AlphabetComponent();
        frame.add(component);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}