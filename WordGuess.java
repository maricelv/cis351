/**
 * Word Guess/ Hangman
 * 
 * @author Maricel Vicente
 * @version 2/6/2019

 */
public class WordGuess {
  
  public static String makeUserWord(String theWord)
  {
        String userWord = "";
        for (int count = 0; count < theWord.length(); count++)
        {
          userWord = userWord + "*";
        }
        return userWord;
  }
  
  public static boolean isInWord(char guess, String theWord)
  {
        boolean found = false;
        
        for (int i = 0; i < theWord.length(); i++)
        {
          if (guess == theWord.charAt(i))
          { 
             found = true;
          }
        }
        
        return found;
  }
  
  public static String updateUserWord(char guess, String userWord, String theWord)
  {
         String updateWord = "";
         for (int i = 0; i < theWord.length(); i++)
         {
           if (theWord.charAt(i) == guess)
           {
              updateWord = updateWord + guess;
           }
           else 
           {
              updateWord = updateWord + userWord.charAt(i);
           }
         }
         
         return updateWord;    
         
    
  }

  public static String updateGuesses(String guesses, char guess)
  {
         if (isInWord(guess, guesses) == false) 
         {
           guesses = guesses + guess + " ";
         }
         return guesses;
         
         
  }
  
  public static String displayUserWord(String userWord)
  {
         String displayWord = "";
         for (int i = 0; i < userWord.length(); i++)
         {
           if (userWord.charAt(i) == '*')
           {
             displayWord = displayWord + " _ ";
           }
           else
           {
             displayWord = displayWord + userWord.charAt(i);
           }
         }
         return displayWord;
  }
  
  public static String displayGuesses(int strikes, String guesses)
  {
         String displayGuess = String.format("Strikes: %d" + "\t Guesses: %s", strikes, guesses);
         return displayGuess;


         
         
  } 
  
}
