package project_12;

import project_11.*;

/**
   This program demonstrates the Format class
*/
public class FormatDemo
{
   public static void main(String[] args)
   {
      BaseFormatter fmt = new BaseFormatter(16);
      
      int[] values = { -3641100, 1000000, 1048576, 4000000 };
      
      Format.process(values, fmt);
      
   }
}