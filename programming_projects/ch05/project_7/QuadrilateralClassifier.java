import java.util.Scanner;

/**
        This program reads the x- and y-coordinates of four corner points
        of a quadrilateral and determines if it is a square, a rectangle
        , a traoezoid, and a rhombus or none of those shapes.
*/

public class QuadrilateralClassifier
{
        public static void main(String[] args)
        {
                // Constant(s)
                final double EPSILON = 1E-14;
                final double RIGHT_ANGLE = 90;
                
                Scanner in = new Scanner(System.in);
                
                // Inputs for all four vertices of the quadrilateral xA yA xB yB xC yC xD yD
                System.out.println("Coordinates of a quadrilateral's vertices");
                System.out.print("Enter xA, yA, xB, yB, xC, yC, xD & yD: ");
                
                int xA = in.nextInt();
                int yA = in.nextInt();
                int xB = in.nextInt();
                int yB = in.nextInt();
                int xC = in.nextInt();
                int yC = in.nextInt();
                int xD = in.nextInt();
                int yD = in.nextInt();
                
                // Calculates the length of segments AB, BC, CD, DA
                double segmentAB = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
                double segmentBC = Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));
                double segmentCD = Math.sqrt(Math.pow(xD - xC, 2) + Math.pow(yD - yC, 2));
                double segmentDA = Math.sqrt(Math.pow(xA - xD, 2) + Math.pow(yA - yD, 2));
                
                // Calculate the length of the diagonals AC and BD
                double diagonalAC = Math.sqrt(Math.pow(xC - xA, 2) + Math.pow(yC - yA, 2));
                double diagonalBD = Math.sqrt(Math.pow(xD - xB, 2) + Math.pow(yD - yB, 2));
                
                // rise and run on the x- and y-coordinates of segments
                // AB, BC, CD and AD
                double riseAB = yB - yA;
                double runAB = xB - xA;
                double riseBC = yC - yB;
                double runBC = xC - xB;
                double riseDC = yD - yC;
                double runDC = xD - xC;
                double riseAD = yD - yA;
                double runAD = xD - xA; 
                
                                      
                
                String quadrilateral;
                if (Math.abs(diagonalAC - diagonalBD) <= EPSILON)
                {
                        if (segmentAB !=  segmentBC)
                                quadrilateral = "a Rectangle";
                        else
                                quadrilateral = "a Square";                                                                 
                }
                else if (segmentAB == segmentBC && segmentBC == segmentCD
                                && segmentCD == segmentDA)
                        quadrilateral = "a Rhombus";
                else if ((runAB == 0 && runDC == 0 || runBC == 0 && runAD == 0))
                        quadrilateral = "a Trapezoid";
                else if (Math.abs(riseAB / runAB - riseDC / runDC) <= EPSILON
                        || Math.abs(riseBC / runBC - riseAD / runAD) <= EPSILON)
                        quadrilateral = "a Trapezoid";
                else
                        quadrilateral = "not a Rectangle, Square, Rhombus or Trapezoid.";
                
                System.out.print("Quadrilateral is " + quadrilateral);
        }
}

