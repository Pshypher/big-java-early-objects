/**
        A class Balloon that models a spherical balloon that is being filled with air.
*/
public class Balloon
{
        private double volume;
        
        /**
                Constructor constructs an empty balloon with no air
        */                
        public Balloon()
        {
                volume = 0;
        }
        
        /**
                Adds passed in volume of air to the balloon
                @param amount the amount of air that inflates the balloon       
        */
        public void addAir(double amount)
        {
                volume += amount;
        }
        
        /**
                Returns the current volume of air that fills the balloon
                @return the volume of air inside the balloon
        */
        public double getVolume()
        {
                return volume;
        }
        
        /**
                Calculates the surface area of the spherical balloon
                @return the surface area of the balloon
        */
        public double getSurfaceArea()
        {
                return 4 * Math.pow(getRadius(), 2) * Math.PI;
        }
        
        /**
                Calculates the radius of the balloon
                @return the radius of the balloon         
        */
        public double getRadius()
        {
                return Math.pow (3 * volume / (4 * Math.PI), 1.0 / 3);
        }      
}