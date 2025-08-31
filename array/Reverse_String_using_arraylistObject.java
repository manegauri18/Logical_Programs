package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse_String_using_arraylistObject 
{
	public static void main(String[] args) 
	{
        String str= "Hello Sagar";
		
		char[] ar = str.toCharArray();
		
		List<Character> al= new ArrayList<>();
		
		for(Character s1 : ar)
		{
			al.add(s1);	
		}
		
		Collections.reverse(al);
		
		ListIterator<Character> litr = al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.print(litr.next());
		}
		
	}

}
