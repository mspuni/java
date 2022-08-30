package pproject;

class Sabari
{
	public static void main(String agrs[])
	{
		int n,x,i,j;
		
		
		n=4;
		int z=0;
		int y=0;
		int space=1;
		int k=n;
		int c=0;
		char[] a= {'s','a','b','a','r','i','i'};
		char[] b= {'U','n','K','n','o','w','n'};
		char[] bb= {'I','l','o','v','e','u'};
		for(j=1;j<=n;j++)
		{
			for(i=1;i<k;i++)
				System.out.print(" ");
			for(x=1;x<=space*2-1;x++)
			{
				System.out.print(a[z]);
				z++;
			}
			for(i=1;i<2*k;i++)
				System.out.print(" ");
			for(x=1;x<=space*2-1;x++)
			{
				System.out.print(b[y]);
				y++;
			}
			System.out.println(" ");
			k--;
			space++;
			y=0;
			z=0;
		}
		space=1;
		k=2*n;			

		for(j=1;j<=2*n;j++)
		{
			for(x=1;x<=space-1;x++)
				System.out.print(" ");
			for(i=1;i<=k*2-1;i++)
			{
				if(c==6)
					c=0;
				System.out.print(bb[c]);
				c++;
			}
			System.out.println(" ");
			
			k--;
			space++;
			c=0;
		}
		
		
		
	}
}