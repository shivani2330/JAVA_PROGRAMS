
public class Element {
	
	public int ElementAndIndices(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(i==arr[i])
			{
				count ++;
			}
			
		}
		return count;
	}
	
	public static void main(String args[])
	{
		int arr[] = /*{10,1,12,3,5,8,9,7,12,23};*/{-3,0,1,3,5,7};
		int n=arr.length;
		Element e = new Element();
		int result = e.ElementAndIndices(arr, n);
		System.out.println(result);
	}

}
