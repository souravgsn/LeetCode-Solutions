//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int n = nums.length;
        int[] arr = new int[n];
        boolean[] vis = new boolean[n];
        Map<Integer,Integer> map = new HashMap<>();
        
        int count = 0;
        for(int i = 0 ; i < n; i++){
            map.put(nums[i] , i);
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr);
        
        for(int i = 0 ; i<n ; i++){
            if(vis[i] || arr[i] == nums[i]){
                continue;
            }    
            int j = i;
            int cc = 0;
            
            while(vis[j] == false){
                vis[j] = true;
                cc++;
                j = map.get(arr[j]);
            }
            
            count += cc-1;
            
        }
        
        return count;
    }
}

// 7 16 14 17 6 9 5 3 18
// 3 5 6 7 9 14 16 17 