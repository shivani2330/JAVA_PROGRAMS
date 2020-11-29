
public class NonRepeating {
	
	public static void main(String args[])
	{
		int arr[]= {3,3,3,6,6,6,7,7,7,9,5,5,5};
		int n=arr.length;
		 NonRepeating(arr,n);
	}
	
	public static void NonRepeating(int a[],int n)
    {
        int count;
        System.out.println("Non Repeating element in array");

       for(int i=0;i<n;i++)
       {
           count=0;
           //initialise the for loop for checking the elenemnt which are not repeated)
           for (int j = 0; j < n; j++)
           {
                //check the condition if any number is same so
              //incre
              if(a[i]==a[j] && i!=j)
                     count++;
           }
          //if count became zero so print the current element
        if(count==0)
            System.out.print(a[i]+" ");
       }
     }

       

}
