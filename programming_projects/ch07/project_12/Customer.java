public class Customer
{
    private String name;
    private double purchase;
    
    /**
        Construct a Customer object with the name and total
        purchase.
        @param customerName the name of this Customer
        @param amount price of purchase(s) made
    */
    public Customer(String customerName, double amount)
    {
        name = customerName;
        purchase = amount;
    }
    
    /**
        Fetch the name of the customer
        @return String this Customer's name
    */
    public String getName()
    {
        return name;
    }
    
    /**
        Get the total purchase made by this Customer
        @return double the total cost of items purchased
    */
    public double purchase()
    {
        return purchase;
    }
}