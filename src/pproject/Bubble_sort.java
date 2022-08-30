package pproject;

import java.util.Arrays;
import java.util.Scanner;

class Bubble_sort 
{
	public static void main(String[] args)
	{
		
			int n;
			System.out.println("enter the size of array");
			Scanner s11 =new Scanner(System.in);
			n=s11.nextInt();
			int[] aa;
			aa= new int[n];
			
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the  array element ");
				aa[i]=s11.nextInt();
			}
			System.out.println("the array element before sorting");
			for(int i=0;i<aa.length;i++)
			{
				System.out.println("array["+i+"] "+aa[i]);
			}
			Arrays.sort(aa);
			for(int i=0;i<aa.length;i++)
			{
				System.out.println("array["+i+"] "+aa[i]);
			}
	}

}
