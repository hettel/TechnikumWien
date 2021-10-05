package ch03_streams;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Example_01
{
   public static void main(String[] args)
   {
      System.out.println("start");
      
      long start = System.currentTimeMillis();
      
      long count = IntStream.range(1, 5_000_000)
                            .parallel()
                            .mapToObj( BigInteger::valueOf ) 
                            .filter(bInt -> bInt.isProbablePrime(750) )
                            .count();
                     
      long end = System.currentTimeMillis();
      
      System.out.println("Count : " + count );
      System.out.println("Duration " + (end - start) + "[ms]");
   }
}
