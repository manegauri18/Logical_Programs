package array;

public class Print_Name_thousandTimes_without_usingLoop 
{
	public static void main(String[] args) {
		
		String name="Gauri";
		String s= "i";
		
		s =s.replaceAll("i", "iiiiiiiiii");  //10
		s =s.replaceAll("i", "iiiiiiiiii");  //100
		s =s.replaceAll("i", "iiiiiiiiii");  //1000
		
		s =s.replaceAll("i", name + "\n");
		
		System.out.println(s);
		
	}

}
