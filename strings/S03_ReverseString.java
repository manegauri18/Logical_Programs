package strings;

//Reverse a String
public class S03_ReverseString {
 public static void main(String[] args) 
 {
     String inputString = "Hello Sagar";
     String result = "";

     for (int i = inputString.length() - 1; i >= 0; i--) 
     {
         result = result + inputString.charAt(i);
     }

     System.out.println(result);
 }
}
