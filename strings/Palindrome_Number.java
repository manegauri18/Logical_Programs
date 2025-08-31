package strings;
//push 
public class Palindrome_Number //Palindrome means number remains same after reversing it i.e. 121=121
{
	public static void main(String[] args)
	{
		int num=16461;
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse num is: "+ rev);
		
		if(org_num==rev)
		{
			System.out.println(org_num+" "+"is Palindrome number");
			
		}
		
		else
		{
			System.out.println(org_num+" "+"is not Palindrome number");
		}
		
	}

}
