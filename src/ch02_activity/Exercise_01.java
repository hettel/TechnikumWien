package ch02_activity;

import java.util.function.IntBinaryOperator;

public class Exercise_01
{
   public static void main(String[] args)
   {
      final int a = 42;
      final int b = 13;
      
      System.out.println("Addition");
      int sum = process(a, b, null); // replace null with a lambda expression
      System.out.println("Summe " + sum );
      
      System.out.println("Multiplication");
      int prod = process(a, b, null); // replace null with a lambda expression
      System.out.println("Product " + prod );
   }

   
   public static int process(int a, int b, IntBinaryOperator operator)
   {
      return operator.applyAsInt(a, b);
   }
}
