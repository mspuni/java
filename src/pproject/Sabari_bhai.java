package pproject;
class AException extends Exception
{
	 AException(String s)
	{
		super(s);
	}
}
public class Sabari_bhai 
{
	public static int mul(int q,int w)
	{
		return q/w;
	}
	public static void abb(int p)
	{
		try
		{
		if(p<19)
		{
			throw new AException("theere is a eroor bus");
		}
		else
		{
			p=p+p;
			System.out.println(p);
		}
		}
		catch(AException av)
		{
			System.out.println(av);
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int age=19;
		
		int a=10;
		int b=10;
		int c;
		int[] abc = {3,3};
		abb(7);
		
		try
		{	 int z=mul(11,11);
			System.out.println(z);
			int n=abc[1];
			System.out.println(n);
			 c=a/b;
			 System.out.println(c);
			
			 
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException aa)
		{
			System.out.println(aa);
		}
		
		finally
		{
			System.out.println("i can");
		}
		try
		{
			int na=abc[1];
			System.out.println(na);
		}
		finally
		{
			System.out.println("i will");
		}
		System.out.println(age);
		
	}
}
