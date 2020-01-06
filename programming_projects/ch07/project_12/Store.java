import java.util.ArrayList;

public class Store
{
    private ArrayList<Customer> customers;
    
    /**
        Constructs an empty Store object with no customer and sales 
        yet made
    */
    public Store()
    {
        customers = new ArrayList<Customer>();
    }
    
    /**
        Adds a customer's name and the purchase made by customer to this
        Store
        @param customerName the name of the customer
        @param amount cost of purchase made by customer
    */
    public void addSale(String customerName, double amount)
    {
        customers.add(new Customer(customerName, amount));
    }
    
    /**
        Determines the customer with the highest daily purchase
        @return String the name of the customer
    */
    public String nameOfBestCustomer()
    {
        Customer bestCustomer = customers.get(0);
        for (int i = 1; i < customers.size(); i++)
        {
            if (customers.get(i).purchase() > bestCustomer.purchase())
            {
                bestCustomer = customers.get(i);
            }
        }
        
        return bestCustomer.getName();
    }
}