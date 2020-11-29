
public class PalindromeNumber {
	
	public static void main(String args[])
	{
		
		int m =100;int n=200;
		for(int i=m;i<=n;i++)
		{
			if(i==palindrome(i))
			{
				System.out.println(i);
			}
		}
		
	}
	
	static int palindrome(int a)
	{
		int reverse=0;
		int n=a;
		while(n!=0)
		{
			
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
			
		}
	
		return reverse;
	}

}
