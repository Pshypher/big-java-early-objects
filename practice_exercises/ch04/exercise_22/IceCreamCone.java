/**
        A template for every ice cream cone 
*/
public class IceCreamCone
{
        private double height;
        private double radius;
        
        /**
                Constructor for an IceCreamCone
                @param coneHeight the height of the ice cream cone
                @param coneRadius the radius of the ice cream cone
        */
        public IceCreamCone(double coneHeight, double coneRadius)
        {
                height = coneHeight;
                radius = coneRadius;  
        }
        
        /**
                Calculates the open surface area of the ice cream cone
                @return the surface area of the cone
        */
        public double getSurfaceArea()
        {
                double slantHeight = Math.sqrt(height * height + radius * radius);
                return Math.PI * radius * slantHeight;
        }
        
        /**
                Calculates the volume of the cone
                @return the volume of the ice cream cone
        */
        public double getVolume()
        {
                return Math.PI * radius * radius * height / 3;
        }
}