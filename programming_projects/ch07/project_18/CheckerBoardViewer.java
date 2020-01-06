import javax.swing.JFrame;

public class CheckerBoardViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(435, 450);
        frame.setTitle("Checkerboard");
        CheckerBoardComponent component = new CheckerBoardComponent();
        frame.add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}