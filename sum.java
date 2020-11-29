
public class sum {
	
	public static void main(String agrs[])
	{
		int arr[]= {10,11,7,12,14};
		int n= arr.length;
		System.out.println(sumofArray(arr,n));
	}
	
	
	static int max(int x,int y)
	{
		return(x>y)?x:y;
	}
	
	static int sumofArray(int arr[],int n)
	{
		int diff=0,max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				diff=arr[i]-arr[j];
				if(diff>max)
				{
					max=max(diff,max);
				}
			}
		}
		return max;
	}

}
