import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[])
	{
		int num,temp,i,j;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		for(i=2;i<=num;i++) {
			temp=0;
			for(j=1;j<=i;j++) {
				if(i%j==0)
				{
					temp++; 
				}
			}
			if(temp==2)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
