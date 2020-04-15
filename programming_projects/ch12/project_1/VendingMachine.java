import java.util.ArrayList;

/**
   A vending machine accepts payments and dispenses selected product
   to the buyer if the payment is at least the cost of the
   product.
*/
public class VendingMachine
{

   public static final int BUYER = 1;
   public static final int OPERATOR = 2;
   
   public static final int START = 1;
   public static final int PURCHASE = 2;
   public static final int PAYMENT = 3;
   public static final int OPERATE = 4;
   
   public static final Coin DOLLAR;
   public static final Coin QUARTER;
   public static final Coin DIME;
   public static final Coin NICKEL;
   public static final Coin PENNY;
   
   private int state;
   private ArrayList<Product> products;
   private double totalRevenue;
   private ArrayList<Coin> collectedCoins;
   
   static
   {
      DOLLAR = new Coin("Dollar", 1);
      QUARTER = new Coin("Quarter", 0.25);
      DIME = new Coin("Dime", 0.10);
      NICKEL = new Coin("Nickel", 0.05);
      PENNY = new Coin("Penny", 0.01);
   }
   
   /**
      Constructs a vending machine with no products
   */
   public VendingMachine()
   {
      products = new ArrayList<Product>();
      collectedCoins = new ArrayList<Coin>();
      reset();
   }

   /**
      Sets the user of this vending machine, the state is set
      to PURCHASE if the user is a BUYER else OPERATE.
      (Precondition: state is START)
      @param user either a BUYER or an OPERATOR
   */
   public void setUser(int user)
   {
      if (user == BUYER)
      {
         state = PURCHASE;
      }
      else
      {
         state = OPERATE;
      }
   }
   
   /**
      Selects a product from this vending machine and sets the state to PAYMENT.
      (Precondition: state is PURCHASE)
      @return the selected product
   */
   public Product selectProduct(int choice)
   { 
      choice--;
      Product theProduct = null;
      if (choice < products.size())
      {
         theProduct = products.get(choice);
      }
      
      if (theProduct.getQuantity() > 0) { state = PAYMENT; }
      return theProduct;
   }
   
   /**
      Dispenses a product to the buyer and removes it from this
      vending machine stock, resets the vending machine.
      (Precondition: state is PAYMENT)
      @param aProduct the product to be removed
      @return true if the product was removed, false otherwise
   */
   public boolean removeProduct(Product aProduct)
   {
      boolean removed = false;
      if (getTotalPayment() >= aProduct.getPrice() 
            && aProduct.getQuantity() > 0)
      {
         totalRevenue = totalRevenue + getTotalPayment();
         aProduct.setQuantity(aProduct.getQuantity() - 1);
         removed = true;
      }
      reset();
      
      return removed;
   }
   
   /**
      Computes the sum of the payment received from the
      coins
      @return the total value of the coins
   */
   public double getTotalPayment()
   {
      double total = 0;
      for (Coin c : collectedCoins)
      {
         total = total + c.getValue();
      }
      
      return total;
   }
   
   /**
      Receives payment from a buyer, state .
      (Precondition: state is PAYMENT)
      @param coin the coin
      @param qty the number of coins received
   */
   public void addCoins(Coin coin, int qty)
   {
      while (qty > 0)
      {
         collectedCoins.add(coin);
         qty--; 
      } 
   }
   
   /**
      Adds a product to the vending machine and sets the price of each product
      in the vending machine if the match th description of the product being 
      restocked.
      (Precondition: state is OPERATE)
      @param aProduct the added product
   */
   public void restock(Product aProduct)
   {
      String desc = aProduct.getDescription();
      double cost = aProduct.getPrice();
      int qty = aProduct.getQuantity();
      
      boolean found = false;
      for (int i = 0; i < products.size() && !found; i++)
      {
         Product p = products.get(i);
         if (p.getDescription().equals(desc)) 
         {
            p.setPrice(cost);
            p.setQuantity(p.getQuantity() + qty);
            found = true;
         }
      }
      
      if (!found) { products.add(aProduct); }
   }
   
   /**
      Removes the money from this vending machine.
      (Precondition: state is OPERATE)
   */
   public void removeMoney()
   {
      totalRevenue = 0;
   }
   
   /**
      Gets a record of the unique set of products within this vending
      machine ever sold.
      (Precondition: state is PURCHASE)
      @return the record of items sold in this vending machine
   */
   public String getProductSummary()
   {
      String out = null;
      if (products.size() == 0) { 
         return out; }
      
      out = "";
      for (int i = 0; i < products.size(); i++)
      {
         String description = products.get(i).getDescription();
         double price = products.get(i).getPrice();
         out = out + String.format(" %3d) %-10s%-8.2f\n", 
            (i + 1), description, price);
      }
      
      return out;
   }
   
   /**
      Resets the vending machine back to the START
   */
   public void reset()
   {
      collectedCoins.clear();
      state = START;
   }
   
   /**
      Gets the current state of this vending machine
      @return the state 
   */
   public int getState()
   {
      return state;
   }
   
   /**
      Moves the vending machine to a previous state
   */
   public void back()
   {
      if (state == PURCHASE)
      {
         state = START;
      }
      else if (state == PAYMENT)
      {
         state = PURCHASE;
      }
      else if (state == OPERATE)
      {
         state = START;
      }
   }
}