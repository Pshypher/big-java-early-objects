/**
        A class designed to represent a moving car with a gas tank
*/
public class Car
{
        private double fuelEconomy;
        private double gasRemaining;
        /**
                Construct an object of the Car class
                @param fuelEfficiency the fuel economy of the car
        */
        public Car(double fuelEfficiency)
        {
                  fuelEconomy = fuelEfficiency;
        }
   
        /**
                Drive a car some certain distance
                @param distance the distance the car has moved
        */
        public void drive(double distance)
        {
                double gasUsed = fuelEconomy * distance;
                gasRemaining = gasRemaining - gasUsed;
        }
   
        /**
                Retrieve the amount of gasoline in the fuel tank
                @return the remaining gasoline in liters in the fuel tank
        */
        public double getGasInTank()
        {
                return gasRemaining;
        }
        
        /**
                Adds gasoline to the fuel tank
                @param litersOfGas the amount of gas in liter added to the fuel tank
        */
        public void addGas(double liters)
        {
                gasRemaining = gasRemaining + liters;
        }
}