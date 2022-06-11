/*calculateDifference 
Calculate the difference 
int n 
int - Sum 
Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
For Example if n is 10,you have to find 
(1^2+2^2+3^2+….9^2+10^2)- 
(1+2+3+4+5…+9+10)^2 
*/
import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,diff,sqOfSum=0,sumOfSq=0,square,sum=0;
		System.out.println("Enter an integer:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			square=i*i;
			System.out.println(square);
			sumOfSq+=square;
		}
		System.out.println("Sum of squares is "+sumOfSq);
		for(int i=1;i<=n;i++) {
			sum+=i;
			sqOfSum=sum*sum;			
		}
		System.out.println("Square of sum is "+sqOfSum);
		System.out.println("Difference between the sum of the squares of the first n natural numbers and the square of their sum is "+(diff=sqOfSum-sumOfSq));
	}
}
