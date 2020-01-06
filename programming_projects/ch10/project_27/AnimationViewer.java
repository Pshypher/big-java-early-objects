package project_27;

import javax.swing.JFrame;

public class AnimationViewer 
{
   public static void main(String[] args)
   {
      JFrame frame = new AnimationFrame();
      frame.setTitle("Moveable shapes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}