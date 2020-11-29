
public class ArrayProgram {
	
	public static void main(String args[])
	{
		int a[]= {3,1,5,0,4};
		int n=a.length;
		System.out.println(arrayprog(a,n));
	}
	
	static boolean arrayprog(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
						if((arr[i]<arr[k]) && (arr[k]<arr[j]))
						{
							return true;
						}
					
				}
			}
		}
		return false;
	}

}
