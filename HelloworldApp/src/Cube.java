import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num,sum=0,digit;
		System.out.println("Enter an integer: ");
		num=s.nextInt();
		while(num!=0) {
			//digit=num%10;
			sum=sum+((num%10)*(num%10)*(num%10));
			num=num/10;
		}
		System.out.println("Sum of cube of digits is "+sum);
	}
}
