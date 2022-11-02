class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0 ;
        int maxi = nums[0];
        
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
        
        for(int i =0 ;i< nums.length;i++){
            sum+= nums[i];
            if(sum < 0 ) sum =0;
            if(sum > maxi ) maxi = sum;
            
        }
        return maxi;
        
    }
}