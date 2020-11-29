
public class Divisiblenumber {
	
	public static void main(String args[])
	{
		Divisiblenumber n = new Divisiblenumber();
		int result = n.divBY(4,20);
		System.out.println(result);
	}
	
	public int divBY(int n,int m)
	{
		int sum1 = 0,sum2=0;
		for(int i=1;i<=m;i++)
		{
			if(i%n==0)
			{
				sum1=sum1+i;
			}
			else
			{
				sum2=sum2+i;
				
			}
			
			
		}
		return sum2-sum1;
		
	}

}
