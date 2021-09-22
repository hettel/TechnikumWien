package ch01_lambdas;


public class Example_06
{
   public static void main(String[] args)
   {
      // Access variable in external scope
      // The variable has to be effective final
      String preFix = "==> ";
      String newString = transformString("Hello Technikum Wien", str -> preFix + str );
      System.out.println( newString );
   }
   
   
   public static String transformString(String str, StringProcessor processor)
   {
      return processor.process(str);
   }
}
