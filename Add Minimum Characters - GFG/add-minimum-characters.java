//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
	public static int addMinChar(String str){
		//code here
		int count = 0;
		if(str.length() == 1) return 0;
		int j = 0;
		
		int end  = str.length()-1;
	    int start  = 0;
	    
	    while(start < end){
	        if(str.charAt(start) != str.charAt(end)){
	            count++;
	            end--;
	        }else{
	            if(isPalindrome(str.substring(start,end+1))){
	                return count;
	            }
	            count++;
	            end--;
	        }
	    }
		
		return count;
	}
	
	
	
	public static boolean isPalindrome(String str){
	    int end  = str.length()-1;
	    int start  = 0;
	    
	    while(start < end){
	        if(str.charAt(start) != str.charAt(end)){
	            return false;
	        }else{
	            start++;
	            end--;
	        }
	    }
	    return true;
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String str = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.addMinChar(str));
        }
        
    }
}

// } Driver Code Ends