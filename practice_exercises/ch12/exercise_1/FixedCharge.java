/**
   Describes fixed charges for a rendered service
*/
public class FixedCharge extends LineItem
{
   public FixedCharge(Product service, int aQuantity)
   {
      super(service, aQuantity);
   }
   
   public String format()
   {
      return super.format().substring(0, 39);
   }
}