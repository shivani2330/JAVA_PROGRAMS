
public class StringReverse {
	
	public static void main(String args[])
	{
		String str="Shivani";
		System.out.println(reverse(str));
	}
	
	static String reverse(String str)
	{
		char ch[]=str.toCharArray();
		String rev="";
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		
		return rev;
		
	}

}
