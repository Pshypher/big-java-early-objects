package project_18;

import javax.swing.JFrame;

public class BarChartViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new BarChartFrame();
      frame.setTitle("Bar chart");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}