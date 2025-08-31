package array;

public class ReverseFirstHalfNumbersOnly 
{
	    public static void main(String[] args) 
	    {
	        int input = 5789310;
	        int reversed = reverseFirstHalf(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + reversed);
	    }

	    public static int reverseFirstHalf(int num)
	    {
	        String numStr = Integer.toString(num);
	        int length = numStr.length();

	        // Check if the length is odd or even
	        boolean isOddLength = length % 2 != 0;

	        // Calculate the number of digits in the first half
	        int firstHalfLength = length / 2;
	        if (isOddLength)
	        {
	            firstHalfLength++;
	        }

	        // Extract the first half of the string
	        String firstHalf = numStr.substring(0, firstHalfLength);

	        // Reverse the first half
	        StringBuilder sb = new StringBuilder(firstHalf);
	        sb.reverse();

	        // Append the second half (unchanged) if the length is odd
	        if (isOddLength) 
	        {
	            sb.append(numStr.substring(firstHalfLength, length));
	        }

	        // Convert the reversed string back to an integer
	        int reversedNum = Integer.parseInt(sb.toString());

	        return reversedNum;
	    }
	}



