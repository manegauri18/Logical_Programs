package strings;

//***6 Count Words In sentence***
public class S06_CountTotalWordFromString {
 public static void main(String[] args) {

     String sentence = "Java is a powerful programming language";

     // Split the sentence by spaces
     String[] words = sentence.split("\\s+");

     // Count the words
     int wordCount = words.length;

     System.out.println("Total number of words: " + wordCount);
 }
}
