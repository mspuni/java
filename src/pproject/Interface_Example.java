package pproject;

interface maccha
{
	void lowd();
	void gand();
	void sha();
}
abstract class Fri implements maccha
{
	public void sha()
	{
		System.out.println("govinda");
	}
}
class Friend extends Fri
{
	public void lowd()
	{
		System.out.println("SABARI THE LEADER");
	}
	public void gand()
	{
		System.out.println("VIKAS THE BOSS KA BOSS");
	}
}
public class Interface_Example 
{
	public static void main(String agrs[])
	{
		Friend f =new Friend();
		f.lowd();
		f.gand();
		f.sha();
	}

}
