import java.util.*;
public class StringSorting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		String[] arr = new String[5];
		int arr1[] = new int[5];
		System.out.println("Enter the String ");
		for(int index =0; index<arr.length; index++) {
			arr[index] = s.nextLine();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
