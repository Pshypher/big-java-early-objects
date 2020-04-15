/**
        A template for each object of a soda can
*/
public class SodaCan
{
        private double height;
        private double diameter;
        
        /**
                Constructor for an object of SodaCan
                @param height height of a can of soda
        */
        public SodaCan(double height, double diameter)
        {
                this.height = height;
                this.diameter = diameter;
        }
        
        /**
                Calculates the volume of a soda can
                @return the volume of the can
        */
        public double getVolume()
        {
                double radius = diameter / 2;
                return Math.PI * radius * radius * height;
        }
        
        /**
                Calculates the surface area of the soda can
                @return surface area of a soda can
        */
        public double getSurfaceArea()
        {
                double radius = diameter / 2;
                return Math.PI * radius * height + 2 * Math.PI * radius * radius;
        }
}