package array;

import java.util.*;

public class PrintDuplicates 
{
    public static void main(String[] args) 
    {
        int[] array = {2, 4, 7, 2, 11, 5, 7, 14, 22, 11, 49, 58, 14, 101, 1, 3, 205, 49, 101, 12};
        
        LinkedHashSet<Integer> unique = new LinkedHashSet<>();
        LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();

        for (int num : array) 
        {
            if (unique.add(num) == false)  // add() returns false if number already exists
            {
                duplicates.add(num);
            }
        }
       
        System.out.println("Duplicates are: " + duplicates);
        
        ArrayList<Integer> list = new ArrayList<>(duplicates);
        
        Collections.sort(list);
        System.out.println("Ascending order: " + list);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order: " + list);
    }
}
