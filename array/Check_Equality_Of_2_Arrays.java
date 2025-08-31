package array;

import java.util.Arrays;

public class Check_Equality_Of_2_Arrays
{
	public static void main(String[] args) 
	{
		int a1 []= {1,2,3,4,8,6};
		int a2 []= {1,3,2,4,8,6};
		
		Boolean status=Arrays.equals(a1, a2);
		
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
	}

}
