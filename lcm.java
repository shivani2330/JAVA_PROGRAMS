
public class lcm {
	
	public int findLcm(int x,int y,int z)
	{
		int lcm=(x>y)?x:y;
		lcm=(lcm>z)?lcm:z;
		
		while(true)
		{
			if(lcm%x==0 && lcm%y==0 && lcm%z==0)
			{
				break;
			}
			
			lcm++;
			
		}
		
		return lcm;
	}
	
	public static void main(String args[])
	{
		lcm l =new lcm();
		int result= l.findLcm(2, 3, 4);
		System.out.println(result);
	}


}
