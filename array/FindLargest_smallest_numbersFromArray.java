package array;

public class FindLargest_smallest_numbersFromArray 
{
	public static void main(String[] args) 
	{
		int [] arr= {5,12,-7,3,8};
		
		int largest= arr[0];
		int smallest= arr[0];
		
		for(int s1: arr)
		{
			if(s1>largest)
			{
				largest= s1;
			}
			else if(s1<smallest)
			{
				smallest= s1;
			}
		}
		

		
		System.out.println("largest num is: "+largest);
		System.out.println("smallest num is: "+smallest);
	}

}
