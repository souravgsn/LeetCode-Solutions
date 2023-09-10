//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max = 0;
        int j = 0;
        int i = 0;
        Stack<Integer> st = new Stack<>();
        while(i < n && j < n){
            if(st.isEmpty()){
                st.push(arr[i++]);
            }else if(arr[i] > dep[j]){
                st.pop();
                j++;
            }else{
                st.push(arr[i++]);
            }
            
            max = Math.max(st.size() , max);
        }
        
    
        return max;
    }
    
}


// arr[] = {0900, 0940, 0950, 1100, 1500, 1800}
// dep[] = {0910, 1120, 1130, 1200, 1900, 2000}

// 900  - 910 , 940,950,1100 - 1120, 
// 1