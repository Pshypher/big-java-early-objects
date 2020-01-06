/**
        A class for a  Balloon
*/
public class Balloon
{
        private double radius;
        
        /**
                Increases the size(radius) of the balloon by a certain amount 
        */
        public void inflate(double amount)
        {
                radius = radius + amount;
        }
        
        /**
                Returns the volume of a Balloon filled with a mass of air
                @return the volume of the balloon
        */
        public double getVolume()
        {
                return 4 / 3 * Math.PI * radius * radius * radius;
        }
}