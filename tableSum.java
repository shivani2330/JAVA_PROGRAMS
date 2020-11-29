
public class tableSum {
	
	public static void main(String args[])
	{
		tableSum s = new tableSum();
		s.table(5);
		
	}
	
	

	public void table(int n)
	{
		int result,sum=0;
		for(int i=1;i<=10;i++)
		{
			result = n*i;
			System.out.println(result);
			
			sum=sum+result;
		}
		System.out.println(sum);
		
		
		
	}
}



