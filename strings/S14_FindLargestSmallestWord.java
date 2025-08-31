package strings;

//***14 find the largest and smallest word in a string***
public class S14_FindLargestSmallestWord {
 public static void main(String[] args) {
     String inputString = "Java is a powerful programming language";
     String[] words = inputString.split("\\s+"); // Split by spaces

     String smallest = words[0];   //Java
     String largest = words[0];    //Java

     for (int i = 1; i < words.length; i++) //i=1 means "is"
     {
         if (words[i].length() < smallest.length()) //2<4
         {
             smallest = words[i];
         } 
         else 
         {
             if (words[i].length() > largest.length())
             {
                 largest = words[i];
             }
         }
     }

     System.out.println("Smallest word: " + smallest);
     System.out.println("Largest word: " + largest);
 }
}
