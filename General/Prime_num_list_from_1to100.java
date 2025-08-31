package General;

public class Prime_num_list_from_1to100 
{
	public static void main(String[] args) 
	{
		int temp=0;
		
		for(int num=1; num<=100; num++)
		{
			for(int i=2; i<=num-1; i++)
			{
				if(num%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(num);
			}
			else
			{
				temp=0;
			}
		}
	}

	
	
//	import java.util.Scanner;
//	class Prime
//	{
//		public static void main(String arg[])	
//		{
//		int count=0;
//	               System.out.println("Enter a number ");
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//		   if(n%i==0)
//		   {
//		        count++;
//		        
//		   }
//		}
//		if(count==2)
//		       System.out.println("prime number ");
//		else
//		System.out.println("Not a prime number ");	        
//		}
//	}
}
