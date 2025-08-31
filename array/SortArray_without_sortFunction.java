package array;

public class SortArray_without_sortFunction 
{
	public static void main(String[] args) 
	{
		int ar[]= {7,5,4,15};  //length=4
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				int temp=0;  //7
				
				if(ar[i]>ar[j])
				{
					temp=ar[i];  //7
					ar[i]=ar[j];  //ar[0]=5
					ar[j]=temp;  //ar[1]=7
				}
			}
			System.out.print(ar[i] + " ");
		}
		
	}

}
