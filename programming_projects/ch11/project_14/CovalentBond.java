public class CovalentBond
{
   private String type;
   private Integer bondEnergy;
   private Double bondLength;
   
   /**
      Constructs a covalent bond with the given bond type, energy and
      length.
      @param type the elements and type of this covalent bond
      @param energy the bond energy
      @param length the bond length
   */
   public CovalentBond(String type, int energy, double length)
   {
      this.type = type;
      bondEnergy = new Integer(energy);
      bondLength = new Double(length);
   }
   
   /**
      Compares this compounds elements and bond type with the another.
      @param other the elements and bond compared with that of this covalent
      bond.
      @return 0 if the elements and bond type are similar, a value less than
      0 or greater than 0 if they are disimilar
   */
   public int compare(String other)
   {
      return type.compareTo(other);
   }
   
   /**
      Compares the bond energy in this compound with another.
      @param amount the amount of covalent bond energy
      @return 0 if both energies are the same, a value less than 0 if this
      bond energy is less than the given amount or a value greater than
      0 if this bond energy is greater than the amount
   */
   public int compare(int amount)
   {
      return bondEnergy.compareTo(amount);
   }
   
   /**
      Compares the bond length in this compound with another.
      @param value bond length compared with the length of this covalent bond
      @return 0 if both are of the same length, a value less than 0 if this
      bond length is smaller than the given value or a value greater than
      0 if this bond length is larger than the value
   */
   public int compare(double value)
   {
      return bondLength.compareTo(value);
   }
   
   /**
      Get the type of this covalent bond
      @return the bond type
   */
   public String getType()
   {
      return type;
   }
   
   /**
      Get the bond energy for this covalent bond.
      @return the bond energy
   */
   public int getBondEnergy()
   {
      return bondEnergy;
   }
   
   /**
      Get the length of this covalent bond.
      @return the bond length
   */
   public double getBondLength()
   {
      return bondLength;
   }
}