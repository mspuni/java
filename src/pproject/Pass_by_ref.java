package pproject;
class Gandu
{
	int a=10;
	static void jaa()
	{
		System.out.println("aaaa");
	}
}
class ama
{
	static void asd(Gandu g)
	{
		System.out.println(g.a);
		g.jaa();
	}
	static void add(int[] arr)
	{
		arr[0]=22;
		arr[1]=33;
		int sum=arr[0]+arr[1];
		System.out.println(sum);
	}
}
class Pass_by_ref 
{
	public static void main(String args[])
	{
		Gandu g = new Gandu();
		System.out.println(g.a);
		ama.asd(g);
		int[] arr=new int[2];
		ama.add(arr);
	}
	
}