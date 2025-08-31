package General;

public class Largest_of_threee_num_without_ifLoop 
{
	public static void main(String[] args) 
	{
		int a=80;
		int b=20;
		int c=50;
		
		int temp= a>b?a:b;
		
		//System.out.println(temp);
		
		int largest= c>temp?c:temp;
		
		System.out.println(largest);
			
	}

}
