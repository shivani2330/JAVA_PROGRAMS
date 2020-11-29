
public class Array2 {
	
	public static void main(String args[])
	{
		int arr[] = {5, 2, 4, 3, 9, 7, 1};
		int n=arr.length;
	
		Array2 a = new Array2();
		int result =a.diff(arr, n, 9);
		System.out.println(result);

	
		 
	}
	
	public int diff(int a[],int n,int sum)
	{
		 int answer, temp, i, j, check;
		    if(n<=2)
		    {
		        answer = -1;
		    }
		    else
		    {
		    	for(i=0;i<a.length;i++)
		    	{
		    		for(j=i+1;j<a.length;j++)
		    		{
		    			if(a[i]>a[j])
		    			{
		    				temp=a[i];
		    				a[i]=a[j];
		    				a[j]=temp;
		    			}
		    		}
		    	}
		    	
		     check=a[0]+a[1];
		     if(check<=sum)
		     {
		    	  answer = a[0] * a[1];
		      }
		        else
		        {
		            answer = 0;
		        }  
		    }
		 
		    return answer;
		   
	}
	

}
