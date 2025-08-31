package strings;

//**8 Count total vowels and consonants in a String**
public class S08_TotalCountOfVowelConsonant {
 public static void main(String[] args) {
     String inputString = "Hello World";
     inputString = inputString.toLowerCase(); 

     int vowels = 0;
     int consonants = 0;

     for (int i = 0; i < inputString.length(); i++) 
     {
         char ch = inputString.charAt(i);

         if (ch >= 'a' && ch <= 'z') { // character ch has a value between a to z
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
             {
                 vowels++;
             } 
             else
             {
                 consonants++;
             }
         }
     }

     System.out.println("Vowels: " + vowels);
     System.out.println("Consonants: " + consonants);
 }
}
