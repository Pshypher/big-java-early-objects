/**
        A class to simulate the population of roaches within an area
*/
public class RoachPopulation
{
        private int population;
        
        /**
                Constructs an object of the RoachPopulation class
        */
        public RoachPopulation(int size)
        {
                population = size;
        }
        
        /**
                Doubles the population of the roaches within a period
        */
        public void breed()
        {
                population = population * 2;
        }
        
        /**
                Reduces the population of the roaches by the given percentage
                @param percent the percentage by which the population of the roaches is reduced
        */
        public void spray(double percent)
        {
                population = (int) (population - population * percent / 100);
        }
        
        /**
                Returns the current number of roaches
                @return the current number of roaches
        */
        public int getRoaches()
        {
                return population;
        }
}