package ch01_lambdas;


public class Example_04
{
   public static void main(String[] args)
   {
      StringProcessor toUpperProcessor = new StringProcessor()
      {
         
         @Override
         public String process(String str)
         {
            return str.toUpperCase();
         }
      };
      
      
      System.out.println( toUpperProcessor.process("Hello Technikum Wien") );
   }
}
