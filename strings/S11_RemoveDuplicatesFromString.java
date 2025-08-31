package strings;

//**11 Remove duplicate characters from a String or statement **
import java.util.LinkedHashSet;
import java.util.Set;

public class S11_RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String input = "programming998";
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder unique = new StringBuilder();
        StringBuilder duplicate = new StringBuilder();

        for (int i = 0; i < input.length(); i++) 
        {
            char c = input.charAt(i); 
            
            if (set.add(c))
            { 
                unique.append(c);
            } 
            else 
            {
                duplicate.append(c);
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + unique.toString());
        System.out.println("Duplicate: " + duplicate.toString());
    }
}

