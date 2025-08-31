package strings;

/*** Reverse each word in same order ***/
public class S05_ReverseEachWordWithSameOrder {
    public static void main(String[] args) {
        String inputString = "Java is fun to learn";
        String result = "";
        String[] words = inputString.split(" ");
    
        for (int i = 0; i < words.length; i++) 
        {
        	
        	String word = words[i];
            String reversedWord = "";

            // Reverse each word using a for loop
            for (int j = word.length() - 1; j >= 0; j--) 
            {
                reversedWord = reversedWord + word.charAt(j);
            }

            result = result + reversedWord + " ";
        }

        System.out.println("Reversed Words: " + result.trim());
    }
}
