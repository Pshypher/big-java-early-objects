public class Item
{
    private double price;
    private boolean isPet;
    private int quantity;
    
    /**
        Constructor describing an Item sold at a pet store
        @param price price of this Item
        @param isPet whether or not this Item is a pet
        @param quantity the number of this Item purchased
    */
    public Item(double price, boolean isPet, int quantity)
    {
        this.price = price;
        this.isPet = isPet;
        this.quantity = quantity;    
    }
    
    /**
        The price of this Item
        @return double cost of this Item
    */
    public double getPrice()
    {
        return price;
    }
    
    /**
        States the nature of this Item
        @return boolean true if this Item is a pet
    */
    public boolean isAPet()
    {
        return isPet;
    }
    
    /**
        The amount of this Item purchased
        @return int quantity of this Item bought
    */
    public int getQuantity()
    {
        return quantity;
    }
}