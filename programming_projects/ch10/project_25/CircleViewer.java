package project_25;

import javax.swing.JFrame;

public class CircleViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new CircleFrame();
      frame.setTitle("Circle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}