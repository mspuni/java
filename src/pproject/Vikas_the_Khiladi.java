package pproject;

public class Vikas_the_Khiladi {

	public static void main(String[] args)
	{	
				String s="decf*g*h*i*j";
				int n=12;
				int space=1;
				int l=n/3;
				int k=l;
				char[] arr=new char[s.length()];
				for(int i=0;i<arr.length;i++)
					arr[i]=s.charAt(i);
				int p=arr.length-1;
				int w=0;
				for(int j=0;j<l;j++)
				{
					if(j%2==1)
						System.out.println();
					else
					{
						for(int i=1;i<=k;i++)
							System.out.print(" ");
						for(int x=1;x<=space*2-1;x++)
						{
							if(x==1 || x==space*2-1)
							{
								System.out.print(arr[w]);
								w++;
							}
							else
								System.out.print(" ");
						}
						System.out.println(" ");
					
						
					}
					k--;
					space++;
					
				}
				int q=2*l+1;
				for(int y=0;y<=l;y++)
				{
					if(y%2==1)
						System.out.println();
					else
					{
						for(int x=1;x<=q;x++)
						{
							if(x==1 || x==q)
							{
								System.out.print(arr[w]);
								w++;
							}
							else
								System.out.print(" ");
						}
						System.out.println("");
					}
					
					
				}
				space=l;
				k=1;
				for(int j=0;j<=l;j++)
				{
					if(j%2==0)
						System.out.println();
					else
					{
						for(int i=1;i<=k;i++)
							System.out.print(" ");
						for(int x=1;x<=space*2-1;x++)
						{
							if(x==1 || x==space*2-1)
							{
								System.out.print(arr[w]);
								w++;
							}
							else
								System.out.print(" ");
						}
						System.out.println(" ");
					
						
					}
					
					space--;
					k++;
				}
					
			
				


	}

}
