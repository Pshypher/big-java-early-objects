import java.util.Scanner;

/**
        This program reads the x- and y-coordinates of three corner points
        of a triangle and determines if the triangle has an obtuse angle, 
        right angle, or only acute angles.
*/
public class TriangleClassifier
{
        public static void main(String[] args)
        {
                // Constant(s)
                final double TRIANGLE_ANGLE_SUM = 180;
                final double RIGHT_ANGLE = 90;
                final double EPSILON = 1E-14;
                
                Scanner in = new Scanner(System.in);
                
                // x- and y-coordinates of points A, B, C 
                System.out.print("Enter the x- and y-coordinates for point A, B and C: ");
                String points = in.nextLine();
                
                int whiteSpace = points.indexOf(" ");
                int xA = Integer.parseInt(points.substring(0, whiteSpace));
                points = points.substring(whiteSpace + 1);
                whiteSpace = points.indexOf(" ");                
                int yA = Integer.parseInt(points.substring(0, whiteSpace));
                points = points.substring(whiteSpace + 1);
                whiteSpace = points.indexOf(" ");
                int xB = Integer.parseInt(points.substring(0, whiteSpace));
                points = points.substring(whiteSpace + 1);
                whiteSpace = points.indexOf(" ");
                int yB = Integer.parseInt(points.substring(0, whiteSpace));
                points = points.substring(whiteSpace + 1);
                whiteSpace = points.indexOf(" ");
                int xC = Integer.parseInt(points.substring(0, whiteSpace));
                points = points.substring(whiteSpace + 1);
                int yC = Integer.parseInt(points.substring(0));
                
                // Calculate the length of the segments BC, AC and AB
                double sideA = Math.sqrt(Math.pow(xC - xB, 2) + Math.pow(yC - yB, 2));
                double sideB = Math.sqrt(Math.pow(xC - xA, 2) + Math.pow(yC - yA, 2));
                double sideC = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
                
                // Calculate the angles A, B and C of the triangle
                // cosine rule is employed in the calculation of angle A
                double angleA = Math.toDegrees(Math.acos((sideA * sideA - sideB * sideB 
                        - sideC * sideC) / (- 2 * sideB * sideC)));
                
                // angle B is calculated using the sine rule
                double angleB = Math.toDegrees(Math.asin(Math.sin(angleA) * sideB / sideA));
                
                // angle C is calculated via the triangle sum theorem
                double angleC = TRIANGLE_ANGLE_SUM - (angleA + angleB);
                
                double deltaA = Math.abs(RIGHT_ANGLE - angleA);
                double deltaB = Math.abs(RIGHT_ANGLE - angleB);
                double deltaC = Math.abs(RIGHT_ANGLE - angleC);
                
                String triangle;
                if (deltaA <= EPSILON || deltaB <= EPSILON || deltaC <= EPSILON)
                {
                        triangle = "a right angled";       
                }
                else if (angleA > RIGHT_ANGLE || angleB > RIGHT_ANGLE || angleC > RIGHT_ANGLE)
                {
                        triangle = "an obtuse";
                }
                else
                {
                        triangle = "an acute";
                }
                
                System.out.print("Triangle is " + triangle + " triangle"); 
        }
}