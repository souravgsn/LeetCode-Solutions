//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String ip) {
        // Write your code here
        int left = 0;
		int n = ip.length();
		int count = 0;
		int dot = 0;
		while(left < n){
			int j = left;
			
			while(j < n && ip.charAt(j) != '.'){
				j++;
			}
			if(j < n && ip.charAt(j) == '.') dot++;
			String temp = ip.substring(left, j);
			
			int len = temp.length();
			
			if(len == 0) return false;
            try{
                int num = Integer.parseInt(temp);
                if(num == 0 && len != 1) return false;
    			else if(num < 0||num > 255) return false;
    			else if(countDigit(num) != len) return false;
    			count++;
    			left = j+1;
            }catch(Exception e){
                return false;
            }
		}

		return count == 4 && dot == 3;
    }
    static int countDigit(long n)
    {
		if(n == 0) return 1;
        return (int)(Math.log10(n) + 1);
    }
}