package array;

public class PrintElementsOfArrayPresentOnOddPosition {
    public static void main(String[] args) {
        
    	int[] array = {25, 11, 7, 75, 56};
        //Print all numbers from odd index 
        for (int i = 1; i < array.length; i =i+2) 
        { 
            System.out.println(array[i]);
        }
       //Print all numbers from even index 
        for (int i = 0; i < array.length; i =i+2) 
        { 
            System.out.println(array[i]);
        }
    }
}
