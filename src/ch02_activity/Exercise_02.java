package ch02_activity;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntBinaryOperator;

public class Exercise_02
{
   public static void main(String[] args)
   {
      int[] array = ThreadLocalRandom.current().ints(1, 10).limit(10).toArray();
      
      System.out.println("Add all elements");
      int sum = reduce(array, null); // replace null with a lambda expression
      System.out.println("Sum " + sum );
      
      System.out.println("Multiply all elements");
      int prod = reduce(array, null); // replace null with a lambda expression
      System.out.println("Product " + prod );
   }

   
   public static int reduce(int[] a, IntBinaryOperator operator)
   {
      assert a != null;
      assert a.length > 0;
      
      int result = a[0];
      for( int i=1; i < a.length; i++)
      {
         result += operator.applyAsInt(result, a[i]);
      }
      return result;
   }
}
