package strings;

//**10 Count word start with Capital letter**
public class S10_CountWordsStartsWithCapitalLetter {
 public static void main(String[] args) {
     String inputString = "This is a Sample String With Capitalized Words";
     String[] words = inputString.split(" "); 
     int count = 0;

     for (int i = 0; i < words.length; i++) 
     {
         String word = words[i];
         if (Character.isUpperCase(word.charAt(0))) 
         {
             System.out.println("Capitalized word is: " + word); // Print words if required
             count++;
         }
     }

     System.out.println("Number of capitalized words: " + count);
 }
}
