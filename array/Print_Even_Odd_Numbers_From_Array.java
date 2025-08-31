package array;

public class Print_Even_Odd_Numbers_From_Array 
{
	public static void main(String[] args) 
	{
		int ar []= {1,2,3,4,5,6};
		
		//Extracting even numbers
		System.out.println("----Print even numbers from array----");
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
		
		//Extracting odd numbers
       System.out.println("----Print odd numbers from array----");
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]);
			}
		}	
		
	}

}
