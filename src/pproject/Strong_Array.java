package pproject;
import java.util.Scanner;
public class Strong_Array 
{
	public static void main(String args[])
	{	
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number to be check Strong NumBEr");
		int n=scan.nextInt();
		String stro=Integer.toString(n);
		int[] arr=new int[stro.length()];
		for(int i=0;i<stro.length();i++)
			arr[i]=stro.charAt(i)-'0';
		for(int j=0;j<stro.length();j++)
		{
			int abc=1;
			for(int k=arr[j];k>=1;k--)
				abc=k*abc;
			sum=sum+abc;
		}
		if(n==sum)
			System.out.println(n+" is a StROng NUmbEr");
		else
			System.out.println(n+" is not a StROng NUmbEr");
	}
	
}
