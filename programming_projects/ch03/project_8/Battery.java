/**
        A class Battery that models a rechargeable battery
*/
public class Battery
{
        private double initialCapacity;
        private double capacitymAh;

        /**
                Constructs a rechargeable battery
                @param capacity the amount of charge in millampere hours a battery can hold
        */
        public Battery(double capacity)
        {
                initialCapacity = capacity;
                capacitymAh = capacity;
        }
        
        /**
                Drains the battery by the amount specified
                @param amount the quantity by which the charge in a battery depletes
        */
        public void drain(double amount)
        {
                capacitymAh = capacitymAh - amount
        }
        
        /**
                Charges the battery to its original capacity
        */
        public void charge()
        {
                capacitymAh = initialCapacity;
        }
        
        /**
                Get the remaining capacity of the battery
                @return the remaining capacity of the battery
        */
        public double getRemainingCapacity()
        {
                return capacitymAh;
        }
}