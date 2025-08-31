package strings;


public class S22_SwapTwoStringsWithoutThirdVariable 
{
	public static void main(String[] args) 
	{
		String s1= "good";
		String s2= "afternoon";
		
				
		s1= s1+s2;                                           //goodafternoon
		s2= s1.substring(0, (s1.length()-s2.length()));     //s1.substring(0,13-9)
		s1= s1.substring(s2.length());
	
			
		System.out.println("String s1 after swap: "+s1);
		System.out.println("String s2 after swap: "+s2);
	}

}
