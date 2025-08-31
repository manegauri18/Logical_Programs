package strings;

//*****13 Move all Numbers to the right of string*****
public class S13_MoveNumbersRight {
 public static void main(String[] args) {

     String inputString = "prog9ramming2";
     StringBuilder digits = new StringBuilder();
     StringBuilder nonDigits = new StringBuilder();

     for (int i = 0; i < inputString.length(); i++) 
     {
         char ch = inputString.charAt(i);
         
         if (Character.isDigit(ch))
         {
             digits.append(ch);
         } 
         else 
         {
             nonDigits.append(ch);
         }
     }

     System.out.println("Final String: " + nonDigits.toString() + digits.toString());
 }
}

