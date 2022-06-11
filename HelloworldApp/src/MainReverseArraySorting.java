import java.util.Scanner;

public class MainReverseArraySorting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num[] = new int[5];	//array initialization
		int result1;
		for(int index=0;index<num.length;index++) {
			System.out.println("Enter the value for index["+index+"]");
			num[index] = s.nextInt();
		}
		ReverseArraySorting revarray = new ReverseArraySorting();
		revarray.getSorted(num);
		System.out.println("Sorted Array : ");
		for(int index=0;index<num.length;index++) {
			System.out.println(num[index]);
		}
	}

}
