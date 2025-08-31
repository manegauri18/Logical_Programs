package strings;

import java.util.Arrays;

public class S18_Anagram {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}