package strings;

public class S02_RemoveSpecialCharacters {

    public static void main(String[] args) {
        String input = "Geeks@For#Geeks!123";

        // Remove all characters except letters and digits
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("Original: " + input);
        System.out.println("Cleaned: " + cleaned);
    }
}
