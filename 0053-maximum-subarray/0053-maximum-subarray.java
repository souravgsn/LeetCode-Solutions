import java.util.*;
class Solution {
   public int maxSubArray(int[] nums) {
        
        int n = nums.length-1;
        if(n == 0){
            return nums[0];
        }
        int ans =nums[n];
        
        boolean na = true;
       
       for(int i =0 ;i<= n ;i++ ){
           if(nums[i] > 0){
               na = false;
               break;
           }
       }
       
       if(na == true){ 
           int min = nums[n];
           for(int i = 0 ;i<=n ;i++){
               if(nums[i] > min){
                   min = nums[i];;
               }
           }
           return min;
       }
       
       
       while(nums[n] < 0){
           n--;
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