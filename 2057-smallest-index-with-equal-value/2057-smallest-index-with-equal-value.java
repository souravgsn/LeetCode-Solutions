class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n = i%10;
            if(n == nums[i]){
                return i;
            }
        }
        return -1;
    }
}