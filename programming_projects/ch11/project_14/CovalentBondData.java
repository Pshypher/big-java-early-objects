import java.util.ArrayList;
import java.util.Scanner;

/**
   This class represents a collection of chemical bond records
   obtained from a file.
*/
public class CovalentBondData
{

   private ArrayList<CovalentBond> data;
   
   /**
      Constructs an empty record without any chemical bond data.
   */
   public CovalentBondData()
   {
      data = new ArrayList<CovalentBond>();
   }
   
   /**
      Extracts the details of a covalent bond from an input stream
      and adds it to this data set.
      @param in the input stream
   */
   public void read(Scanner in) throws BadFileFormatException
   {
      String type = in.next();
      
      if (!in.hasNextInt())
      {
         throw new BadFileFormatException("Energy of covalent bond expected");
      }
      int energy = in.nextInt();
      
      if (!in.hasNextDouble())
      {
         throw new BadFileFormatException("Bond length expected");
      }
      double length = in.nextDouble();
      
      data.add(new CovalentBond(type, energy, length));
   }
   
   /**
      Searches for records within this data set with the given elements
      and bond type.
      @param type the type of bond
      @return record of the bond energy and length matching the given 
      bond type   
   */
   public String match(String type)
   {
      int i = 0;
      boolean found = false;
      while (!found && i < data.size())
      {
         CovalentBond bond = data.get(i);
         if (bond.compare(type) == 0)
         {
            found = true;
         }
         else
         {
            i++;
         }
      }
      
      String output;
      if (found)
      {  
         output = String.format("Bond energy: %4dKJ/mol, bond length: %4.2fnm",
            data.get(i).getBondEnergy(), data.get(i).getBondLength());
      }
      else
      {
         output = ("No covalent bond of type " + type + 
               " within this data set");
      }
      
      return output;                                 
   }
   
   /**
      Searches for records within this data set for covalent bonds 
      whose bond energy matches the given energy.
      @param energy the bond energy
      @return bond type and bond length from this data set whose bond
      energy matches the given energy
   */
   public String match(int energy)
   {
      String output = "";
      for (CovalentBond bond : data)
      {
         if (bond.compare(energy) == 0)
         {
            output = output + String.format(
                  "Bond type: %s, bond length: %.2fnm\n", 
                  bond.getType(), bond.getBondLength());
         }
      }
      
      if (output.equals(""))
      {
         output = "There is no covalent bond with bond energy "
            + energy + "KJ/mol";
      }
      
      return output;
   }
   
   /**
      Searches for records within this data set for covalent bonds 
      whose bond length matches the given energy.
      @param length the bond length
      @return bond type and bond energy from this data set whose bond
      length matches the given length
   */
   public String match(double length)
   {
      String output = "";
      for (CovalentBond bond : data)
      {
         if (bond.compare(length) == 0)
         {
            output = output + String.format(
                  "Bond type: %s, bond energy: %dKJ/mol\n", 
                  bond.getType(), bond.getBondEnergy());
         }
      }
      
      if (output.equals(""))
      {
         output = "There is no covalent bond with bond length "
            + length + "nm";
      }
      
      return output;
   }
}