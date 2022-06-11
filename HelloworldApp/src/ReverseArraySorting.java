import java.util.*;

/*
 Create a method which accepts an integer array, 
 reverse the numbers in the array and returns the resulting array in sorted order
 * */
public class ReverseArraySorting {
	
	
	public int[] getSorted(int num[]) {
		System.out.println("Array in reverse order ");
		
		for(int index=num.length-1;index>=0;index--) {
			System.out.println(num[index]);
		}
		Arrays.sort(num);	
		return num;
	}
}
