package pproject;
import java.util.Scanner;
public class Armstrong_Array 
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number to check Armstrong NUMber ?? ");
		int n=scan.nextInt();
		String s=Integer.toString(n);
		int[] arm = new int[s.length()];
		for(int i=0;i<arm.length;i++)
		{
			arm[i] = s.charAt(i)-'0';
		}

		for(int j=0;j<arm.length;j++)
		{
			int k=0;
			int vaule=1;
			while(k<arm.length)
				
			{
				vaule=vaule*arm[j];
				k++;
			}
			sum=sum+vaule;
		}	
		if(sum==n)
		{
			System.out.println(n+" is a ARMStrONg NuMBEr");
		}
		else 
		{
			System.out.println(n+" is a  not a ARMStrONg NuMBEr");
		}
	}
}
