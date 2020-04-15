import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LetterH
{
        private int xLeft;
        private int yTop;
        private int strokeSize;
        
        public LetterH(int x, int y, int size)
        {
                xLeft = x;
                yTop = y;
                strokeSize = size;
        }
        
        public void draw(Graphics2D g2)
        {
                // The first left verical bar of the letter H
                Point2D.Double p1 = new Point2D.Double(xLeft, yTop);     // Top-left corner of the alphabet
                Point2D.Double p2 = new Point2D.Double(xLeft, yTop + strokeSize * 2);
                Line2D.Double leftVerticalBar = new Line2D.Double(p1, p2);
                
                // The horizontal bar in the alphabet H
                Point2D.Double p3 = new Point2D.Double(xLeft, yTop + strokeSize);
                Point2D.Double p4 = new Point2D.Double(xLeft + strokeSize, yTop + strokeSize);
                Line2D.Double middleHorizontalBar = new Line2D.Double(p3, p4);
                
                // The second right vertical bar of the letter H
                Point2D.Double p5 = new Point2D.Double(xLeft + strokeSize, yTop);
                Point2D.Double p6 = new Point2D.Double(xLeft + strokeSize, yTop + strokeSize * 2);
                Line2D.Double rightVerticalBar = new Line2D.Double(p5, p6);
                
                g2.draw(leftVerticalBar);
                g2.draw(middleHorizontalBar);
                g2.draw(rightVerticalBar);
        }
 }