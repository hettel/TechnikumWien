package ch02_activity;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class SolutionExercise_01
{
   public static void main(String[] args) throws IOException
   {
      String fileName = "Homer-Odyssey-UTF8-Coding.txt";
      Path path = Paths.get( fileName );
      
      WordContainer container = new WordContainer(path);
      System.out.printf("%s contains %s words", fileName, container.size() );
      System.out.println();
      
      // Determine the number of words with length 3
      int num3 = container.selectView( str -> str.length() == 3 ).size();
      System.out.println("Words with length 3 : " + num3 );
      
      // Determine the number of words with length greater 10
      int num10 = container.selectView( str -> str.length() == 10 ).size();
      System.out.println("Words with length 10 : " + num10 );
      
      // Determine the number of words that contain the letter 'a'
      int numA = container.selectView( str -> str.indexOf("a") >= 0 ).size();
      System.out.println("Words contain 'a' : " + numA );
      
      // The following solutions make use of the static methods
      // of the Predicate interface
      
      // Determine the number of words with length 3 and contain the letter 'a'
      Predicate<String> lenEqual3 = str -> str.length() == 3;
      Predicate<String> lenContainA = str -> str.indexOf("a") >= 0;
      int num3A = container.selectView( lenEqual3.and(lenContainA) ).size();
      System.out.println("Words with length 3 and contain 'a' : " + num3A );
      
      // Determine the number of words with length between 3 and 5
      Predicate<String> lenGreaterEqual3 = str -> str.length() >= 3;
      Predicate<String> lenSmalerEqual5 = str -> str.length() <= 5;
      int num3To10 = container.selectView( lenGreaterEqual3.and(lenSmalerEqual5) ).size();
      System.out.println("Words with length between 3 and 5 : " + num3To10 );
   }
}
