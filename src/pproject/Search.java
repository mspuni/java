package pproject;
import java.util.Scanner;
import java.util.Arrays;
public class Search 
{
	static int[] insert()
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
		return a;
	}
	static void display(int[] aa)
	{
		for(int i=0;i<aa.length;i++)
		{
			System.out.println("array["+i+"] "+aa[i]);
		}
	}
	static void sort(int[] aa)
	{
		int[] ab=aa;
		Arrays.sort(ab);
		for(int i=0;i<ab.length;i++)
		{
			System.out.println("array["+i+"] "+ab[i]);
		}
	}
	static void seach(int[] aa)
	{
		System.out.println("enter the element to be seached");
		Scanner ss =new Scanner(System.in);
		int n=ss.nextInt();
		int found=0;
		for(int i=0;i<aa.length;i++)
		{
			if(aa[i]==n)
			{
				System.out.println("array element "+n+" found in array["+i+"] ");
				i=aa.length;
				found=100;
			}
		}
		if(found==0)
		{
			System.out.println("array element "+n+" is not found");
		}
	}
	public static void main (String args[]) 
	{	
		int aa[]=insert();
		int z=1;
		while(z==1)
		{
			System.out.println("*************************");
			System.out.println("enter 2 for display array");
			System.out.println("enter 3 for sort array");
			System.out.println("enter 4 for search a array element");
			System.out.println("enter 5 for EXIT");
			System.out.println("*************************");
			Scanner sss =new Scanner(System.in);
			int n=sss.nextInt();
			switch(n)
			{
			
				case 2:		display(aa);
							break;
				case 3:		sort(aa);
								break;
				case 4:		seach(aa);
								break;
				case 5:    z=111;
								break;
				 default: System.out.println("invaild input/n please enter the vaild input"); 
							break;
			}
		
		}
	}
	
}
