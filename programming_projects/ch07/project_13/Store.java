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
    
    /**
        Determines the top N customers with the largest sale
        @param topN the number of customers with the largest purchase
        @return ArrayList<String> the customers with the largest purchase
    */
    public ArrayList<String> nameOfBestCustomers(int topN)
    {
        ArrayList<Customer> topNCustomers = new ArrayList<Customer>();
        int n = 0;
        for (int i = 0; i < customers.size() && n < topN; i++)
        {
            if (!contains(customers.get(i), topNCustomers))
            {
                Customer bestCustomer = customers.get(i);
                for (int j = 0; j < customers.size(); j++)
                {
                    if (customers.get(j).purchase() > bestCustomer.purchase()
                        && !contains(customers.get(j), topNCustomers))
                    {
                        bestCustomer = customers.get(j);
                    }
                }
                topNCustomers.add(bestCustomer);
                n++;
            }
        }
        return getCustomerNames(topNCustomers);
    }
    
    /**
        Checks whether a customer appears in the specified list
        @param c the customer to be searched
        @param listOfCustomers the list against which a customer is checked
    */
    public boolean contains(Customer c, ArrayList<Customer> listOfCustomers)
    {
        boolean found = false;
        for (Customer element : listOfCustomers)
        {
            if (element.equals(c))
            {
                found = true;
            }
        }
        
        return found;
    }
    
    /**
        Returns the names of customers from the list
        @param listOfCustomers ArrayList of Customer objects
        @return an ArrayList of Strings, the names of customers 
    */
    public ArrayList<String> getCustomerNames(ArrayList<Customer> listOfCustomers)
    {
        ArrayList<String> names = new ArrayList<String>();
        for (Customer c : listOfCustomers)
        {
            names.add(c.getName());
        }
        
        return names;
    }
    
}