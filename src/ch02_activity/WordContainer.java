package ch02_activity;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WordContainer
{
   private final Set<String> words;
   
   public WordContainer(Path path) throws IOException
   {
      this.words = this.loadWords(path);
   }
   
   public int size()
   {
      return this.words.size();
   }
   
   public Set<String> selectView(Predicate<String> selector)
   {
      Set<String> result = new HashSet<>();
      for(String word : this.words )
      {
         if( selector.test(word) )
         {
            result.add(word);
         }
      }
      
      return Collections.unmodifiableSet(result);
      
//      // Alternative formulation using streams
//      return this.words.stream()
//                       .filter(selector)
//                       .collect( Collectors.toUnmodifiableSet() );
   }
   

   private Set<String> loadWords(Path path) throws IOException
   {
      String content = Files.readString(path, Charset.forName("UTF8"));
      
      String[] words = content.split("\\s+");
      return Arrays.stream( words )
                   .map( str -> str.trim() )
                   .filter( str -> str.matches("[a-zA-Z]+") )
                   .collect( Collectors.toSet() );
   }
}
