import javax.swing.JFrame;

public class CheckerBoardViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
    
        frame.setSize(1000, 750);
        CheckerBoardComponent checkerBoard = new CheckerBoardComponent();
        frame.add(checkerBoard);
        frame.setTitle("Checker board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}