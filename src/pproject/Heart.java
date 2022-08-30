package pproject;

import java.util.Scanner;
class Heart
{
	public static void main(String agrs[])
	{
		int n,x,i,j;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the heart size ::");
		n=s.nextInt();
		int space=1;
		int k=n;
		for(j=1;j<=n;j++)
		{
			for(i=1;i<k;i++)
				System.out.print(" ");
			for(x=1;x<=space*2-1;x++)
				System.out.print("*");
			for(i=1;i<2*k;i++)
				System.out.print(" ");
			for(x=1;x<=space*2-1;x++)
				System.out.print("*");
			System.out.println(" ");
		k--;
		space++;
		}
		k=2*n;
		space=1;
			


		for(j=1;j<=2*n;j++)
		{
			for(x=1;x<=space-1;x++)
				System.out.print(" ");
			for(i=1;i<=k*2-1;i++)
				System.out.print("*");
			System.out.println(" ");
			
			k--;
			space++;
		}
		
		
		
	}
}
			
	
		
