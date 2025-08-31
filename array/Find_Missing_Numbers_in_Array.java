package array;

import java.util.TreeSet;

public class Find_Missing_Numbers_in_Array 
{
    public static void main(String[] args) 
    {
        
        int input[] = {1, 2, 4, 6, 7};
    
        // Step 2: Put all array elements into TreeSet - Reason to use TreeSet is its always sort in ascending order
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : input) 
        {
            set.add(num);
        }
        
     // Step 2: Find min and max directly from TreeSet
        int min_number = set.first();   
        int max_number = set.last();    
        
        // Step 3: Check for missing numbers
        System.out.print("Missing numbers are: ");
        for (int i = min_number; i <= max_number; i++) 
        {
            if (!set.contains(i)) 
            {
                System.out.print(i + " ");
            }
        }
    }
}