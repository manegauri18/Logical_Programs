package strings;

//****4 Reverse word order *****
public class S04_ReverseWordsOrder {
  public static void main(String[] args)
  {
      String inputString = "Hello Java";
      String[] words = inputString.split(" ");
      String result = "";

      for (int i = words.length - 1; i >= 0; i--) 
      {
          result = result + words[i] + " ";
      }

      System.out.println("Reversed Word Order: " + result);
  }
}
