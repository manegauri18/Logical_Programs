package strings;

public class S23_Sum_of_digits_in_string 
{
	public static void main(String[] args) 
	{
        String s1="welcome12to3the4worldof5java";
		int sum=0;
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(Character.isDigit(ch))
			{
				 sum = sum + Character.getNumericValue(ch);
				
			}
		
		}
		System.out.println(sum);
	}

}
