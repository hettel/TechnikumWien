package ch01_lambdas;

import java.util.List;
import java.util.function.Consumer;

public class Example_03
{
   public static void main(String[] args)
   {
      List<String> names = List.of( "Mike", "Oliver", "Dave", "Kate", "Evelyn", "Deborah");
      
      Consumer<String> consume = new Consumer<>()
      {
         @Override
         public void accept(String str)
         {
            System.out.println( str );
         }
      };
      names.forEach(consume);
      
      // Use of a common lambda expression
      names.forEach( str -> System.out.println( str ) );
      
      // Use of a method reference
      names.forEach( System.out::println );
   }
}
