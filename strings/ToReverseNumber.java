package strings;

public class ToReverseNumber
{
	public static void main(String[] args) 
	{
		int num=567;
		int rev=0;
		
		//while(num!=0)
		//{
			//rev=rev*10 + num%10;
			//num=num/10;
		//}
		
		for(int i=num; i>0; i=i/10)
		{
			rev=rev*10 + i%10;
		}
		
		System.out.println("Reverse number is: "+ rev);
		
	}

}
