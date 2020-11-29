
public class Carry {

	public static void main(String args[])
	{
		Carry c = new Carry();
		int result=c.carryNumber(23, 563);
		System.out.println(result);
	}
	
	public int carryNumber(int n1,int n2)
	{
		int carry=0;
		while((n1!=0) && (n2!=0))
		{
			int p= n1%10;
			int q=n2%10;
			
			int sum=carry+p+q;
			if(sum>9)
			{
				carry++;
			}
			n1=n1/10;
			n2=n2/10;
			
			
		}
		return carry;
	}
	
}
