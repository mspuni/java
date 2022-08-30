package pproject;

public class Concaaa 
{
	public static void main(String args[])
	{
		char[] apl= {'J','a','V','A'};
		for(int i=0;i<apl.length;i++)
		{
			if (Character.isUpperCase(apl[i])) 
				System.out.println("array["+i+"] "+apl[i]);
		}
	}
}
