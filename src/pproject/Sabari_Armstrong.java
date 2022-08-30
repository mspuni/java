package pproject;
import java.util.Scanner;
public class Sabari_Armstrong 
{
		public static void main(String[] args)
		{
			Scanner q = new Scanner(System.in);
			System.out.print("Enter  the number to check Armstrong NUMber ?? ");
			int no=q.nextInt();
			int sum= 0,copy=no,count=0,rem,copy1=no,i;
			int a;
			while(copy1!=0)
			{
				copy1=copy1/10;
				count++;
				
			}
			while(no!=0)
			{
				rem=no%10;
				a=1;
				for(i=1;i<=count;i++)
				{
					a=a*rem;
				}
				sum=sum+a;
				no= no/10;
			}
			if(copy==sum)
			{
				System.out.println(sum+" is a ARMStrONg NuMBEr");
			}
			else 
			{
				System.out.println(sum+" is a  not a ARMStrONg NuMBEr");
			}
		}
}
