package General;

import java.util.Scanner;

public class Find_Largest_of_Four_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter four numbers: ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		double num4 = scan.nextDouble();
		
		
		double largestNumValue = largestNum(num1, num2, num3, num4);
		System.out.println(largestNumValue);
		
	}
	
	public static double largestNum(double a, double b, double c, double d)
	{
		double largest=a;
		if(b > largest)
		{
			largest=b;
		}
		else if(c > largest)
		{
			largest=c;
		}
		else if(d > largest)
		{
			largest=d;
		}
		return largest;
	}

}
