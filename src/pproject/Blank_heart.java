package pproject;

public class Blank_heart
{
	public static void main(String args[])
	{
		
		int n=3;
		char x='A';
		int space=n;
		int k=n;
		int l=1;
		int i,j,m,o,p;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<k;j++)
				System.out.print(" ");
			for(m=1;m<=l*2-1;m++)
			{
				if((m==1) || (m==l*2-1))
				{
					System.out.print(x);
					x++;
				}
				else
					System.out.print(" ");
			}
			for(o=1;o<2*k;o++)
				System.out.print(" ");
			for(p=1;p<=l*2-1;p++)
			{
				if((p==1) || (p==l*2-1))
				{
					System.out.print(x);
					x++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			k--;
			l++;
		}
		k=1;
		l=2*n;
		for(i=1;i<=2*n;i++)
		{
			for(j=1;j<k;j++)
				System.out.print(" ");
			for(m=1;m<=l*2-1;m++)
			{
				if((m==1) || (m==l*2-1))
				{
					System.out.print(x);
					x++;
				}
				else
					System.out.print(" ");
			}
			System.out.println("");
			k++;
			l--;
		}
	}
}