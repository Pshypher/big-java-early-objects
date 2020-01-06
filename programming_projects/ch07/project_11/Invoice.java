import java.util.ArrayList;

public class Invoice
{
    private ArrayList<Item> items;
    
    /**
        Constructs an invoice with no added Items
    */
    public Invoice()
    {
        items = new ArrayList<Item>();
    }
    
    /**
        Adds item purchased to this Invoice
        @param anItem the purchased item 
    */
    public void add(Item anItem)
    {
        items.add(anItem);
    }
    
    /**
        Calculates the discount on this Invoice if at least
        5 other items and 1 or more pets are purchased
        @return the total discount on at least 5 items that aren't pets
    */
    public double getDiscount()
    {
        int pets = 0;
        int otherItems = 0;
        
        double rate = 0.2;
        double totalDiscount = 0;
        
        for (Item i : items)
        {
            if (i.isAPet()) { pets++; }
            else { otherItems++; }
        }
        
        if (pets < 1 || otherItems < 5) { return 0; }
        
        for (Item i : items)
        {
            if (!i.isAPet())
            {
                double discount = i.getPrice() * i.getQuantity() * rate;
                totalDiscount = totalDiscount + discount;
            }
        }
        
        return totalDiscount;
    }
}