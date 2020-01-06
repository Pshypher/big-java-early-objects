/**
        Product maps the name of a good to its corresponding price      
*/
public class Product 
{
        String name;
        double price;
        /**
                A Product is constructed with a name and price 
        */
        public Product(String itemName, double initialPrice)
        {
                name = itemName;
                price = initialPrice;
        }
        
        /**
                retrieves the name of the product 
                @return the name of a product
        */
        public String getName()
        {
                return name;
        }
        
        /**
                fetch the price of the product
                @return the price of the product
        */
        public double getPrice()
        {
                return price;
        }
        
        /**
                reduce the price of a product
                @param amount the amount to be deducted from the product
        */
        public void reducePrice(double amount)
        {
                price = price - amount;
        } 
        
}