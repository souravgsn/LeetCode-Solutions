//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] price = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                price[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            sln.stockBuySell(price, n);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public void stockBuySell(int[] arr, int n) {
        // code here
        boolean  flag = false;
        for(int i = 1 ; i < n ;i++){
            int buy = 0;
            int sell = -1;
            
            if(arr[i] <= arr[i-1]){
                buy = i;
            }else{
                buy = i-1;
            }
            
            i++;
            while(i<n && arr[i] > arr[i-1]){
                i++;
            }
            
            if( i == n){
                sell = n-1;
            }else{
                sell = i-1;
            }
            
            if(sell == buy) continue;
            
            
            System.out.print("("+buy+" "+sell+") ");
            flag = true;
        }   
        
        if(!flag) System.out.print("No Profit");
        System.out.println();
    }
}