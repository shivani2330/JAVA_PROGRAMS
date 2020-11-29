
public class MissingElement {
	
	public static void main(String args[])
	{
		int arr[]= {1,2,3,5,6};
		int n = arr.length;
		System.out.println(missing(arr,n));
	}
	
	static int missing(int arr[],int n)
	{
		int total=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		{
			
			total=total-arr[i];
			
		}
		
		return total;
	}

}
