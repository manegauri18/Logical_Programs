package strings;

import java.util.LinkedHashMap;


public class S16_first_nonRepeating_character
{
	public static void main(String[] args) {	

		String strInput = "XHello Java";

		LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();

		for (int i = 0; i < strInput.length(); i++)
		{
           char ch = strInput.charAt(i);

		   mp.put(ch, mp.getOrDefault(ch, 0) + 1);
		}

		
		for (char c : mp.keySet()) 
		{
		    if (mp.get(c) == 1) 
		    {
		        System.out.println("First Non repeating char is "+c);
		        break;
		    }
		}	
	}
}