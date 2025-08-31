package General;

public class Remove_Space_without_using_replaceMethod 
{
	public static void main(String[] args)
	{
		String str="Welcome to java programming";
		
		for(char c : str.toCharArray())
		{
			if(c!=' ')
			{
				System.out.print(c);
			}
		}
		
		
	}

}
