package strings;

//**7 find the length of the string without using string.length()**
public class S07_FindLengthWithoutLengthMethod
{
 public static void main(String[] args)
 {
     String inputString = "Hello World";
     char[] chars = inputString.toCharArray();
     int count = 0;

     for (int i = 0; i < chars.length; i++)
    	 
     {
         count++;
     }

     System.out.println("Length of the string: " + count);
 }
}
