package ch02_activity;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Exercise_01
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
      
      // Determine the number of words that contain the letter 'a'
      
      // Determine the number of words with length 3 and contain the letter 'a'
      
      // Determine the number of words with length between 3 and 5
   }
}
