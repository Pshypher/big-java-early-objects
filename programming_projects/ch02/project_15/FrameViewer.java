import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(400, 400);
      JLabel label = new JLabel("Hello, Pshypher!");
      label.setOpaque(true);
      Color paleGreen = new Color(152, 251, 152);
      label.setBackground(paleGreen);
      frame.add(label);
      /**
         Image queenMary = new ImageIcon("queen-mary.png").getImage();
         frame.setIconImage(queenMary);
      */
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}