package strings;

//**9 Count of each vowel in string**
public class S09_CountOfEachVowel {
	public static void main(String[] args) {
		String inputString = "Hello World";
		inputString = inputString.toLowerCase();
		int a = 0, e = 0, i = 0, o = 0, u = 0;

		for (int j = 0; j < inputString.length(); j++) 
		{
			char ch = inputString.charAt(j);

			if (ch == 'a') 
			{
				a++;
			} 
			else if (ch == 'e') 
			{
				e++;
			} else if (ch == 'i') 
			{
				i++;
			} else if (ch == 'o') 
			{
				o++;
			} else if (ch == 'u') 
			{
				u++;
			}
		}

		System.out.println("Count of 'a': " + a);
		System.out.println("Count of 'e': " + e);
		System.out.println("Count of 'i': " + i);
		System.out.println("Count of 'o': " + o);
		System.out.println("Count of 'u': " + u);
	}
}
