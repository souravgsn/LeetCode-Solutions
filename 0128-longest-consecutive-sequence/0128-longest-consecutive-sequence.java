import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 ) return 0;
        if(nums.length == 1 ) return 1;
        Arrays.sort(nums);
        int ans =0;
        int count =0;
        int i=0;    
        while(i< nums.length-1){
            if(nums[i] == nums[i+1]-1 ){
                count++;
                ans = Math.max(ans,count);
            }else if(nums[i] == nums[i+1]){
                i++;
                continue;
                
            }
            else{
                count = 0;
            }
            i++;
        }
        int n = nums.length -1;
        if(nums[n] == nums[n-1]+1 || nums[n] == nums[n-1] && count == ans){
            return ans +1;
        }
        return ans+1;
    }
}