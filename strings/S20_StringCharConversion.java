package strings;

import java.util.Arrays;

public class S20_StringCharConversion {

    public static void main(String[] args) {

        String input = "hello";

        // Convert String to char array
        char[] charArray = input.toCharArray();
        System.out.println("Char Array: " + Arrays.toString(charArray));

        // Convert char array back to String
        String convertedBack = new String(charArray);
        System.out.println("Converted Back to String: " + convertedBack);
    }
}