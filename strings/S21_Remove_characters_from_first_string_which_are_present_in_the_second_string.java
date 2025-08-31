package strings;

public class S21_Remove_characters_from_first_string_which_are_present_in_the_second_string 
{
    public static void main(String[] args) {
        String str1 = "gaurimaane";
        String str2 = "gaurav";

        // Remove characters from str1 that are present in str2
        String result = str1.replaceAll("[" + str2 + "]", "");

        System.out.print(result);
    }
}