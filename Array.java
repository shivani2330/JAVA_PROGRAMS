
public class Array {
	

	public int largesum(int arr[],int n)
	{
	
		int even[] = new int[n];
		int odd[] = new int [n];
		int temp;
		int evencount=0,oddcount=0;
		
		int answer;
		
		if(n<=3)
	    {
	        answer = 0;
	    }
		
		else
		{
			even[0]=arr[0];
			evencount=1;
		
			for(int i=1;i<arr.length;i++)
			{
				if(i%2==0)
				{
					even[evencount]=arr[i];
					evencount++;
				}
				else
				{
					odd[oddcount]=arr[i];
					oddcount++;
				}
			}
			
			for(int i=0;i<evencount;i++)
			{
				for(int j=i;j<evencount;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					
				}
				
				
			}
			for(int i=0;i<oddcount;i++)
			{
				for(int j=i;j<oddcount;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					
				}
			}
			
			answer= even[evencount-2]+odd[oddcount];
		}
		return answer;
		
	}
		
public static void main(String args[])
{
	int arr[]= {3,2,1,7,5,4};
	int n= arr.length;
	Array a = new Array();
	int result= a.largesum(arr, n);
	System.out.println(result);
}
	
	
	
	
	
}
	
	
