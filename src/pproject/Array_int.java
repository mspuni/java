package pproject;
import java.util.Scanner;
public class Array_int 

	{
		public static void main(String agrs[])
		{
			int n;
			System.out.println("enter the size of array");
			Scanner s =new Scanner(System.in);
			n=s.nextInt();
			int[] a;
			a= new int[n];
			
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the  array element ");
				a[i]=s.nextInt();
			}
			System.out.println("the  array element are");
			for(int i=0;i<n;i++)
			{
				System.out.println("array["+i+"] "+a[i]);
			}
		}
	}
				
				
		
			
	


