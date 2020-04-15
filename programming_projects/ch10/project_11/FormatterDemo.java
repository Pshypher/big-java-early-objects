package project_11;

import project_11.util.NumberFormatter;

/**
   This program is a demonstration of the classes implementing the
   NumberFormatter interface.
*/
public class FormatterDemo
{
   public static void main(String[] args)
   {
      NumberFormatter[] formatters = new NumberFormatter[]
         {
            new DefaultFormatter(),
            new DecimalSeperatorFormatter(),
            new AccountingFormatter(),
            new BaseFormatter(8)
         };
         
      for (NumberFormatter f : formatters)
      {
         System.out.println(f.format(-1000000));
      }
      System.out.println();
      
      for (NumberFormatter f : formatters)
      {
         System.out.println(f.format(1048576));
      }         
   }      
}
