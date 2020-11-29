
public class Divisble {
	
	
	public boolean DivBy(int n,int x,int y)
	{
		if(n%x==0 && n%y==0)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String agrs[])
	{
		Divisble d = new Divisble();
		boolean result = d.DivBy(-14, 2, -6);
		System.out.println(result);
		
	}

}
