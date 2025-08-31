package strings;

import java.util.HashMap;

public class S15_CountOfEachCharacter {
    public static void main(String[] args) 
    {
        String input = "aabbbccccddddd";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) 
        {
            char c = input.charAt(i);
            
            if (c == ' ') {
                continue; // skip spaces
            }


            if (map.containsKey(c)) 
            {
                map.put(c, map.get(c) + 1);
            } 
            else 
            {
                map.put(c, 1);
            }
        }

  for (Character c : map.keySet()) {
          
      	System.out.println(c+ ":"+ map.get(c));
       	
        
    }
    }}

