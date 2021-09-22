package ch01_lambdas;

import java.util.List;

public class Example_08
{
   public static void main(String[] args)
   {
      List<String> names = List.of( "Mike", "Oliver", "Dave", "Kate", "Evelyn", "Deborah");
      
      names.stream()
           .map( String::toUpperCase )          // f(string) -> str
           .filter( str -> str.length() > 4 )   // f(string) -> boolean
           .forEach(System.out::println );      // f(string) -> void
   }

}
