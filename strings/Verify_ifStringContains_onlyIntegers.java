package strings;

public class Verify_ifStringContains_onlyIntegers
{
	public static void main(String[] args) 
	{
		String str="874AV";
		boolean flag= true;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)<'0' || str.charAt(i)>'9')
			{
				flag=false;
				break;
			}
		}
		
		
		if(flag)
		{
		  System.out.println("Integer string");
		}
		else
		{
			System.out.println("Not an integer string");
		}
	}

}
