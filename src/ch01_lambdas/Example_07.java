package ch01_lambdas;


public class Example_07
{
   public static void main(String[] args)
   {
      StringProcessor strProc1 = x -> x.toUpperCase();
      
      StringProcessor strProc2 = (x) -> x.toUpperCase();
      
      StringProcessor strProc3 = x -> { 
         System.out.println("Input: " + x );
         return x.toUpperCase();
         };
   }

}
