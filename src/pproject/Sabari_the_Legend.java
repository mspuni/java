package pproject;

public class Sabari_the_Legend {

	public static void main(String[] args) 
	{
		String s="abc";
		int n=6;
		int startPos=3;
		char[] arr=new char[s.length()];
		for(int i=0;i<arr.length;i++)
			arr[i]=s.charAt(i);
		int p=arr.length-1;
		
		
		for(int x=0;x<=n;x++)
		{
			if(x%2==1)
				System.out.println("");
			else
			{
				if((x==0) || (x==n))
				{
					for(int y=1;y<startPos;y++)
						System.out.print(" ");
					if(x==0)
					{
						System.out.print(arr[p]);
						p--;
					}
					else
						System.out.print("*");
				}
				else
				{
					for(int z=1;z<=2*startPos-1;z++)
					{
						if(z==1)
							System.out.print("*");
						else if(z==2*startPos-1)
						{
							System.out.print(arr[p]);
							p--;
						}
						else
							System.out.print(" ");
						
					}
				}
				
			}
		}
		
	}

}
