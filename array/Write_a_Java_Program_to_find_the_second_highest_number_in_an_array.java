package array;

public class Write_a_Java_Program_to_find_the_second_highest_number_in_an_array 
{
	public static void main(String[] args) 
	{
		int arr[] = { 100,14, 46, 47, 94, 97, 52, 86, 36, 94, 89 };
		int largest=0;
		int secLargest=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				secLargest= largest;
				largest= arr[i];
			}
			else if(arr[i]>secLargest)
			{
				secLargest= arr[i];
				
			}
		}
		
		System.out.println("Second largest number is: "+secLargest);
		System.out.println("largest number is: "+largest);
		
	}

}
