package ch01_lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class Example_02
{
   public static void main(String[] args)
   {
      String[] names = { "Mike", "Oliver", "Dave", "Kate", "Evelyn", "Deborah"};
      
      // user defined ordering
      Comparator<String> comparator = (String str1, String str2) -> str1.length() - str2.length();
         
      Arrays.sort(names, comparator);
      System.out.println( Arrays.toString(names) );
      
      //Alternative
      Arrays.sort(names, (str1,str2) -> str1.length() - str2.length()  );
      System.out.println( Arrays.toString(names) );
   }
}
