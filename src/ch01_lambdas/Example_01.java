package ch01_lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class Example_01
{
   public static void main(String[] args)
   {
      String[] names = { "Mike", "Oliver", "Dave", "Kate", "Evelyn", "Deborah"};
      
      // natural order (strings are comparable)
      Arrays.sort(names);
      System.out.println( Arrays.toString(names) );
      
      // user defined ordering
      Comparator<String> comparator = new Comparator<>()
      {
         @Override
         public int compare(String str1, String str2)
         {
            return str1.length() - str2.length();
         }
      };
      Arrays.sort(names, comparator);
      System.out.println( Arrays.toString(names) );
   }
}
