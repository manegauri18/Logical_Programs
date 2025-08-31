package General;

import java.util.Scanner;

public class PowerCalculatorOfAnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter base number: ");
		int baseNumber = scan.nextInt();
		
		System.out.println("Enter exponent: ");
		int exponent = scan.nextInt();
		
	    int result = calculatePower(baseNumber, exponent);
	    
	    System.out.println("result is: "+result);
		
	}
	
	public static int calculatePower(int baseNum, int exponent)
	{
		int result=1;
		
		for(int i=1; i<=exponent; i++)
		{
			result = result*baseNum;
		}
		return result;
	}

}
