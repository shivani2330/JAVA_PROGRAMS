
public class CharacterReplace {

	
	public static void main(String args[])
	{
		char a[] ="apples".toCharArray();
		int n = a.length;
		char c1='a';
		char c2='p';
		CharacterReplace cr = new CharacterReplace();
		cr.replace(a, n, c1, c2);
	}
	
	public void replace(char str[],int n, char c1,char c2)
	{
		int i;
		
		for(i=0;i<n;i++)
		{
			if(str[i]==c1)
			{
				str[i]=c2;
			}
			else if(str[i]==c2)
			{
				str[i]=c1;
			}
		}
		
		System.out.println(str);
	}
}
