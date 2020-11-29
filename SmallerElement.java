
public class SmallerElement {

	  static void printNSE(int arr[], int n) 
	    { 
	        int next, i, j; 
	        for (i = 0; i < n; i++) { 
	            next = -1; 
	            for (j = i + 1; j < n; j++) { 
	                if (arr[i] > arr[j]) { 
	                    next = arr[j]; 
	                    break; 
	                } 
	            } 
	            System.out.println(arr[i] + " -- " + next); 
	        } 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        int arr[] = {3,2,11,7,6,5,6,1}; 
	        int n = arr.length; 
	        printNSE(arr, n); 
	    } 
}
	
	
	