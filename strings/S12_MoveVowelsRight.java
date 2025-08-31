package strings;

//**12 Move all Vowels to the right of string**

public class S12_MoveVowelsRight {
 public static void main(String[] args) 
 {
     String inputString = "programming";
     StringBuilder vowel = new StringBuilder();
     StringBuilder nonvowel = new StringBuilder();

     for (int i = 0; i < inputString.length(); i++) 
     {
         char ch = inputString.charAt(i);
         
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
         {
             vowel.append(ch);
         } 
         else 
         {
             nonvowel.append(ch);
         }
     }

     System.out.println("Final String: " + nonvowel.toString() + vowel.toString());
 }
}
