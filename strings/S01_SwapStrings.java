package strings;

/** Write a Java Program to swap two given Strings **/

//Note: Same code can be used for swapping 2 numbers or strings

public class S01_SwapStrings {
 public static void main(String[] args) {
     String str1 = "Hello";
     String str2 = "World";
   
     String temp = str1;  // temp = "Hello"
     str1 = str2;         // str1 = "World"
     str2 = temp;         // str2 = "Hello"

     System.out.println("str1 = " + str1);
     System.out.println("str2 = " + str2);
 }
}
