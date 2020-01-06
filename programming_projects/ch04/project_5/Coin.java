/**
        A coin has a name, value and a mechanism for calculating
        the total value given one or more of its type.
*/
public class Coin
{
        private String name;
        private double value;
        
        /**
                Constructs a coin with the given name and value
                @param name the name of the coin
                @param value the value of the coin
                @param quantity the number of such coins available
                
        */
        public Coin(String name, double value)
        {
                this.name = name;
                this.value = value;
        }
        
        /**
                Calculates the total amount of the coin
                @param qty amount of this coin
                @return the total value of the coin
        */              
        public double getTotal(int qty)
        {
                return value * qty;
        }
        
        /**
                Get the name of the coin
                @return the name of the coin
        */
        public String getName()
        {
                return name;
        }
}
