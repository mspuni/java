package pproject;
public class String_sss 

{
	public static void main(String args[])
	{
		String s="java is a beautiful language";
		String o="";
		char a;
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			a=s.charAt(i);
			o=o+a;
		}
		System.out.println(o);
		String[] ss=s.split(" ");
		String aa="";
		for(int t=ss.length-1;t>=0;t--)
		{
			aa=aa+ss[t]+" ";
		}
		System.out.println(aa.toUpperCase());
		System.out.println(aa);
	}
}

