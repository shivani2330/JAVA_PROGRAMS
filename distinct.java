
public class distinct {
	
	
	public static void main(String args[])
	{
		int arr[]= {3,3,3,6,6,6,7,7,7,9,5,5,5};
		int n=arr.length;
		nonoccurence(arr,n);
	}
	
	static void nonoccurence(int arr[],int n)
	{
		  // Pick all elements one by one 
        for (int i = 0; i < n; i++) 
        { 
            // Check if the picked element  
            // is already printed 
            int j; 
            for (j = 0; j < i; j++) 
            if (arr[i] == arr[j]) 
                break; 
      
            // If not printed earlier,  
            // then print it 
            if (i == j) 
            System.out.print( arr[i] + " "); 
        } 
	
	}
       
}
