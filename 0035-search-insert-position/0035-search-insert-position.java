class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e = nums.length-1;
        if(target >  nums[e]) return e+1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(target == nums[mid]) return mid; 
            if(target > nums[mid] && target < nums[mid+1]){
                return mid+1;
            }
            
            
            if(nums[mid]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return 0;
    }
}