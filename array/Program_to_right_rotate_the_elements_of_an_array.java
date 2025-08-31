package array;

public class Program_to_right_rotate_the_elements_of_an_array 
{
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,4,5};
		
		int n=1;
		
		for(int i=0; i<n; i++)
		{
			//int last;
			int last= ar[ar.length-1];    //Stores the last element of array    
			
			for(int j=ar.length-1; j>0; j--)
			{
				ar[j] = ar[j-1];   //Shift element of array by one    
			}
			
			ar[0]= last;    //Last element of array will be added to the start of array.
		}
		
		
		System.out.println("Array After rotating the elements to the right");
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
