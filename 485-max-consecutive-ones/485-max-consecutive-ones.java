class Solution {
   public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int om =0;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] == 1){
            max++;
               if(om<max)
                om = max;
           } 
           else {
            max = 0;
           }
            
        }
        return om;
    }
}