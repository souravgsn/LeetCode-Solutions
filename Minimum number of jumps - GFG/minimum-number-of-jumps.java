//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        if(arr[0] == 0) return -1;
        int jump = 1;
        int step = arr[0];
        int mr = arr[0];
        for(int i = 1; i < arr.length ; i++){
            mr = Math.max(mr,i + arr[i]);
            if(i == arr.length-1){
                return jump;
            }
            step--;
            if(step == 0){
                if(i >= mr){
                    return -1;
                }
                jump++;
                step = mr -i;
            }
        }
        return -1;
    }
}