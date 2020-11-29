
public class StringEg {
	
	/*
	 * static void moveSpaceInFront(char str[]) { // Keep copying non-space
	 * characters int i = str.length-1;
	 * 
	 * for (int j = i; j >= 0; j--) if (str[j] != '-') str[i--] = str[j];
	 * 
	 * // Move spaces to be beginning while (i >= 0) str[i--] = '-'; }
	 * 
	 * // Driver code public static void main(String[] args) { char str[] =
	 * "Hey-there,-it's-GeeksforGeeks".toCharArray(); moveSpaceInFront(str);
	 * System.out.println(String.valueOf(str)); }
	 */
	
	// Function to find spaces and move to beginning  
    static void moveSpaceInFront(char str[])  
    {  
        // Traverse from end and swap spaces  
        int i = str.length-1;  
        for (int j = i; j >= 0; j--)  
            if (str[j] != '-') 
            { 
                char c = str[i]; 
                str[i] = str[j]; 
                str[j] = c; 
                i--; 
            } 
    }     
  
    // Driver code  
    public static void main(String[] args) 
    { 
        char str[] = "Hey-there,-it's-GeeksforGeeks".toCharArray();  
        moveSpaceInFront(str);  
        System.out.println(String.valueOf(str)); 
    } 
}  
