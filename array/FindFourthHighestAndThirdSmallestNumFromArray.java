package array;

import java.util.Arrays;

public class FindFourthHighestAndThirdSmallestNumFromArray {
    public static void main(String[] args) {
        int[] array = {100, 14, 46, 47, 94, 97, 52, 86, 36, 94, 89};

        // Sort the array once
        Arrays.sort(array);

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
        
        int smallestNumber = array[0];
        int LargestNumber = array[array.length - 1];
        int fourthLargest = array[array.length - 4];
        int thirdSmallest = array[3 - 1];
        
        System.out.println("smallest number: " + smallestNumber);   
        System.out.println("largest number: " + LargestNumber);   
        System.out.println("Fourth largest number: " + fourthLargest);   
        System.out.println("Third smallest number: " + thirdSmallest);
    }
}
