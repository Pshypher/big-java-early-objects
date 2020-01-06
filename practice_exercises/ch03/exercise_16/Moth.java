/**
        A class Moth that models a moth flying along a straight line
*/
public class Moth
{
        private double position;
        /**
                Construct an object of type Moth
                @param initialPosition the initial position of the Moth
        */
        public Moth(double initialPosition)
        {
                position = initialPosition;
        }
        
        /**
                Move the moth towards a source of light
                @param lightPosition the point where the light originates
        */
        public void moveToLight(double lightPosition)
        {
                position = (position + lightPosition) / 2;
        }
        
        /**
                Get the current position of the Moth
                @return the position of the moth
        */
        public double getPosition()
        {
                return position;
        }
}