import java.util.Scanner;
public class CubeOfDigits {

	public static void main(String[] args) {
		int sum=0,n,i,cu;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=s.nextInt();
		sum=cube(n);
		System.out.println("Sum of cube of digits is "+sum);
	}
	public static int cube(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++) 
			sum=sum+(i*i*i);
		return sum;
	}
}
