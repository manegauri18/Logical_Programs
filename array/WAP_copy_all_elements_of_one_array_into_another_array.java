package array;

public class WAP_copy_all_elements_of_one_array_into_another_array 
{
	public static void main(String[] args) 
	{
		int ar1[]= new int[]{1,2,3,4,5};
		
		int ar2[]= new int[ar1.length];
		
		for(int i=0; i<ar1.length; i++)
		{
			ar2[i]= ar1[i];
		}
		
		
		System.out.println("Print original array");
		for(int i=0; i<ar1.length; i++)
		{
			System.out.println(ar1[i]);
		}
		
		System.out.println("Print resulting array");
		for(int i=0; i<ar2.length; i++)
		{
			System.out.println(ar2[i]);
		}
	}

}
