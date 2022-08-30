package pproject;

import java.util.Scanner;

public class Diamond_Sabari 
{
	public static void main(String agrs[])
	{
		int n,x,i,j;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the  size of DIAMOND ::");
		n=s.nextInt();
		int space=1;
		int k=n;
		for(j=1;j<=n;j++)
		{
			for(i=1;i<k;i++)
				System.out.print(" ");
			for(x=1;x<=space*2-1;x++)
				System.out.print("*");
			System.out.println(" ");
		k--;
		space++;
		}
		k=1;
		space=n-1;
		for(j=1;j<=n;j++)
		{
			for(i=1;i<=k;i++)
				System.out.print(" ");
			for(x=1;x<=space*2-1;x++)
				System.out.print("*");
			System.out.println(" ");
		k++;
		space--;
		}

	}
}
