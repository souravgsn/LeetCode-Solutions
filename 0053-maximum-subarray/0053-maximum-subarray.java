import java.util.*;
class Solution {
   public int maxSubArray(int[] nums) {
        
        int n = nums.length-1;
        if(n == 0){
            return nums[0];
        }
        int ans =nums[n];
        
       int max = -10000;
       while(nums[n] < 0 && n >= 0){
           
           if(nums[n] > max){
            max = nums[n];
           }   
           n--;
           if( n < 0){
            return max;
           }
       }
       
       
       int sum = nums[n];
       
       for(int i =n-1 ;i>=0;i--){
           
            ans = Math.max(sum, ans);
            if(nums[i] + sum <= 0){
                sum = 0;
            }else{
                sum += nums[i];
            }

        }
       
        return Math.max(sum, ans);
    }
    
}