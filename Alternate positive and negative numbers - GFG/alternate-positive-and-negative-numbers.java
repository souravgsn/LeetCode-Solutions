//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for(int i = 0 ; i<n ; i++){
            if(arr[i] < 0){
                neg.add(arr[i]);
            }else{
                pos.add(arr[i]);
            }
        }
        
        int i = pos.size();
        int j = neg.size();
        
        if( i == 0 || j == 0) return;
        int z = 0;
        i=0;
        j=0;
        
        while(z < n){
            arr[z++] = pos.get(i++);
            arr[z++] = neg.get(j++);
            if(pos.size() == i){
                while(z < n && j < neg.size()){
                    arr[z++] = neg.get(j++);
                }
            }
            if(neg.size() == j && i < pos.size()){
                while(z < n){
                    arr[z++] = pos.get(i++);
                }
            }
        }
    }
}