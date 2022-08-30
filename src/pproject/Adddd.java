package pproject;

class Adddd
{
	static void add(int a)
	{
		System.out.println("addtion of one integer number is "+(a+a));
	}
	static void add(int a,int b)
	{
		System.out.println("addtion of two integer number is "+(a+b));
	}
	static void add(int a,int b,int c)
	{
		System.out.println("addtion of 3 integer number is "+(a+b+c));
	}
	static void add(double a)
	{
		System.out.println("addtion of one decimal number is "+(a+a));
	}
	static void add(double a,double b)
	{
		System.out.println("addtion of two decimal number is "+(a+b));
	}
	static void add(double a,double b,double c)
	{
		double r=a+b+c;
		System.out.println("addtion of three decimal number is "+r);
	}
	public static void main(String args[])
	{
		add(33,99,876);
		add(22.44,545.99,878.6);
		add(33.77);
		add(22.66,55.99);
		add(33);
		add(22,55);
		add(33.77);
		add(22.66,55.99);
	}
}