/** 
        A triangle with points A, B and C on a coordinate plane
*/        
public class Triangle
{
        private double x1;
        private double y1;
        private double x2;
        private double y2;
        private double x3;
        private double y3;
        
        /**
                Constructs a triangle with all three coordinates
                at the origin (0, 0)
        */
        public Triangle()
        {
        
        }
        
        /**
                Set the coordinate of the 1st point (x1, y1)
                @param x the value for the 1st ordinate
                @param y the value for the 1st abscissa   
        */
        public void setPointA(double x, double y)
        {
                x1 = x;
                y1 = y;
        }
        
        /**
                Set the coordinate of the 2nd point (x2, y2)
                @param x the value for the 2nd ordinate
                @param y the value for the 2nd abscissa   
        */
        public void setPointB(double x, double y)
        {
                x2 = x;
                y2 = y;
        }
        
        /**
                Set the coordinate of the 3rd point (x3, y3)
                @param x The value for the 3rd ordinate
                @param y The value for the 3rd abscissa   
        */
        public void setPointC(double x, double y)
        {
                x3 = x;
                y3 = y;
        }
        
        /**
                Calculates the measure of the segment BC
                @return measure of the segment BC 
        */
        public double getSegmentBC()
        {
                return distance(x2, y2, x3, y3);
        }
        
        /**
                Calculates the measure of the segment AC
                @return measure of the segment AC
        */
        public double getSegmentAC()
        {
                return distance(x1, y1, x3, y3);
        }
        
        /**
                Calculates the measure of the segment AB
                @return measure of the segment AB 
        */ 
        public double getSegmentAB()
        {
                return distance(x1, y1, x2, y2);
        }
        
        /**
                Calculates the measure of angle BAC
                @return measure of the angle BAC
        */
        public double getAngleA()
        {
                return calculateAngleMeasure(getSegmentAC(), getSegmentAB(), 
                        getSegmentBC());
        }
        
        /**
                Calculates the measure of angle ABC
                @return measure of the angle ABC
        */        
        public double getAngleB()
        {
                return calculateAngleMeasure(getSegmentBC(), getSegmentAB(), 
                        getSegmentAC());
        }
        
        /**
                Calculates the measure of angle ACB
                @return measure of the angle ACB
        */        
        public double getAngleC()
        {
                return calculateAngleMeasure(getSegmentBC(), getSegmentAC(),
                        getSegmentAB());
        }
        
        /**
                Calculates the perimeter of the triangle A, B, C
                @return perimeter of the triangle
        */
        public double getPerimeter()
        {
                return getSegmentBC() + getSegmentAC() + getSegmentAB();
        }
        
        public double getArea()
        {
                // Calculated using Heron's formula
                double p = (getSegmentBC() + getSegmentAC() + getSegmentAB()) / 2;
                return Math.sqrt(p * (p - getSegmentBC()) * (p - getSegmentAC())
                        * (p - getSegmentAB()));
        }
        
        /**
                Calculates the distance between two coordinates
                @param xi x-coordinate of a point on the plane
                @param yi y-coordinate of a point on the plane
                @param xii x-coordinate  of another point on the plane
                @param yii y-coordinate of another point on the plane
                @return the distance between both points 
        */
        private double distance(double xi, double yi, double xii, double yii)
        {
                return Math.sqrt(Math.pow(xi - xii, 2) + Math.pow(yi - yii, 2));
        }
        
        /**
                Calculates the measure of the angle of vertex
                @param one the measure of the first segment
                @param another the measure of the second line segment
                @param opp the measure of the third segment
                @return the angle directly facing the segment opp  
                
        */
        private double calculateAngleMeasure(double one, double another, double opp)
        {
                // The pseudocode translated into these Java statement
                // was developed from the cosine rule
                return Math.toDegrees(Math.acos((one * one + another * another
                        - opp * opp) / (2 * one * another)));
        } 
}