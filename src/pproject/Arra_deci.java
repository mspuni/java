package pproject;
import java.util.Scanner;
public class Arra_deci

	{
		public static void main(String agrs[])
		{
			int n;
			System.out.println("enter the size of array");
			Scanner s =new Scanner(System.in);
			n=s.nextInt();
			double[] a;
			a= new double[n];
			
			for(int i=0;i<n;i++)
			{
				System.out.println("enter the  array element ");
				a[i]=s.nextDouble();
			}
			System.out.println("the  array element are");
			for(int i=0;i<n;i++)
			{
				System.out.println("array["+i+"] "+a[i]);
			}
		}
	}
				
				
		
			
	


