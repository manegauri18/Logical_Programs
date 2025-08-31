package array;

public class Sum_of_elements_in_array
{
	public static void main(String[] args) 
	{
		int sum=0;
		int ar []= {2,3,5,4,7};
		
		
		
		for(int i=0; i<=ar.length-1; i++)
		{
			sum=sum+ar[i];
		}
		
		System.out.println("Sum of elements in array is: "+sum);
		
	}

}
