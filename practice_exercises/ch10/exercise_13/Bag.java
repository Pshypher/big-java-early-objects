import java.util.ArrayList;

/**
    A bag can hold a collection of various item.
*/
public class Bag
{
    private ArrayList<Item> items;
    
    /**
        Constructor for a bag with no item.
    */
    public Bag()
    {
        items = new ArrayList<Item>();
    }
    
    /**
        Adds an item to this bag.
        @param itemName the item to be added
    */
    public void add(String itemName)
    {
        itemName = parse(itemName);    
        boolean found = false;
        int i = 0;
        while (!found && i < items.size())
        {
            Item anItem = items.get(i);
            if (itemName.equals(anItem.getName()))
            {
                anItem.increase();
                found = true;
            }
            else
            {
                i++;
            }
        }
        
        if (!found)
        {           
            Item anItem = new Item(itemName);
            items.add(anItem);
        }            
    }
    
    /**
        Counts the number of the given item in this bag.
        @param itemName the item to be counted within this bag
        @return the count 
    */
    public int count(String itemName)
    {
        itemName = parse(itemName);
        int quantity = 0;
        boolean found = false;
        int i = 0;
        while (!found && i < items.size())
        {
            Item anItem = items.get(i);
            if (itemName.equals(anItem.getName()))
            {
                found = true;
                quantity = anItem.getCount();
            }
            else
            {
                i++;
            }
        }
        
        return quantity;
    }
    
    private String parse(String str)
    {
        str = str.substring(0, 1).toUpperCase() + 
            str.substring(1, str.length()).toLowerCase();
            
        return str;            
    }
    
    public String toString()
    {
        return items.toString();
    }
    
    class Item
    {
        private String name;
        private int quantity;
        
        public Item(String itemName)
        {
            name = itemName;
            quantity = 1;
        }
        
        public String getName()
        {
            return name;
        }
        
        public int getCount()
        {
            return quantity;
        }
        
        public void increase()
        {
            quantity++;
        }
        
        public String toString()
        {
            String output = String.format("[name=%s,quantity=%d]", 
                name, quantity);
            return getClass().getName() + output;
        }
    }
}