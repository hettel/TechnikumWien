package ch01_lambdas;


public class Example_05
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
      
      String newString = transformString("Hello Technikum Wien", toUpperProcessor );
      System.out.println( newString );
  
      // With lambda syntax defining a processor instance 
      StringProcessor myProcessor = str -> str.toUpperCase();
      String newString1 = transformString("Hello Technikum Wien", myProcessor );
      System.out.println( newString1 );
      
      // With lambda syntax as argument
      String newString2 = transformString("Hello Technikum Wien", str -> str.toUpperCase() );
      System.out.println( newString2 );
      
      // and with a method reference
      String newString3 = transformString("Hello Technikum Wien", String::toUpperCase );
      System.out.println( newString3 );
   }
   
   
   public static String transformString(String str, StringProcessor processor)
   {
      return processor.process(str);
   }
}
