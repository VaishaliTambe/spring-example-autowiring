/*Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.*/

import java.util.Scanner;

public class CalculateSum
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer:");
		n=s.nextInt();
		int sum=calculateSum(n);
	}

	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.print(" "+i);
				sum+=i;
			}
		}
		System.out.println("\n Sum = "+sum);
		return sum;
	}
}