class Solution {
    public int findPeakElement(int[] nums) {
        long start =1;
        long end = nums.length-1;
        if(nums.length == 1){
            return 0;
        }
        if(nums.length == 2){
            if(nums[0]>nums[1]) return 0;
            else return 1;
        }
        while(start<=end){
            long mid = (start + end)/2 ;
            int i = (int)mid;
            if( i == nums.length-1) return i;
        
                if(nums[i] > nums[i-1] && nums[i] > nums[i+1]  ) return i;
                if(nums[i]<nums[i+1]){
                    start = i+1;
                }
                else{
                    end = i -1;
                }
                
            
        
        }
        return 0;
    }
}